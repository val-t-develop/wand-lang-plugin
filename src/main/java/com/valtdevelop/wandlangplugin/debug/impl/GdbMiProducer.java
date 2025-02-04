// Copyright 2022 Danny Milosavljevic. Use of this source code is governed by the Apache 2.0 license that can be found in the COPYING file.

package com.valtdevelop.wandlangplugin.debug.impl;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/**
 * This reads async and sync responses from a pty input stream.
 * It sends each async responses to the application main thread via invokeLater.
 * It fills the sync response into a blocking queue.
 */
public class GdbMiProducer /*extends Thread*/ {
    //    private final BufferedReader myChildOut;
    private final BlockingQueue<GdbMiStateResponse> myQueue = new LinkedBlockingDeque<>(1);

    // Both requests and responses have an optional "id" token in front (a numeral) which can be used to find the corresponding request to a response. Maybe use those.
    // But async outputs, so those starting with one of "*+=", will not have them.
    public static Optional<String> parseToken(@NotNull Scanner scanner) {
        final var result = new StringBuilder();
        while (scanner.hasNext("[0-9]")) {
            char c = consume(scanner);
            result.append(c);
        }
        if (result.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(result.toString());
    }

    // Consume one character and give that one back
    private static char consume(Scanner scanner) {
        return scanner.next().charAt(0);
    }

    private final static String digits = "01234567";

    @NotNull
    private static String parseDigitsIntoCode(Scanner scanner, int radix, int maxLength) {
        int result = 0;
        // pucgenie: xP
        while (maxLength --> 0) {
            char c = consume(scanner);
            int digit = digits.indexOf(c);
            if (digit == -1 || digit >= radix) { // error
                break;
            }
            result *= radix;
            result += digit;
        }
        return Character.toString(result);
    }

    // Modifies RESULT.
    private static void interpretEscapeSequenceBody(@NotNull Scanner scanner, @NotNull Appendable result) throws IOException {
        if (scanner.hasNext("[0-7]")) {
            result.append(parseDigitsIntoCode(scanner, 8, 3));
        } else {
            final char c = consume(scanner);
            switch (c) {
                case 'a' -> result.append((char) 0x7);
                case 'b' -> result.append((char) 0x8);
                case 'f' -> result.append((char) 0xc);
                case 'n' -> result.append((char) 0xa);
                case 'r' -> result.append((char) 0xd);
                case 't' -> result.append((char) 0x9);
                case 'v' -> result.append((char) 0xb);
                case 'x' -> result.append(parseDigitsIntoCode(scanner, 16, 2));
                case 'u' -> result.append(parseDigitsIntoCode(scanner, 16, 4));
                case 'U' -> result.append(parseDigitsIntoCode(scanner, 16, 8));
                default -> result.append(c);
            }
        }
    }

    @NotNull
    public static String parseCString(@NotNull Scanner scanner) {
        StringBuilder result = new StringBuilder();
        scanner.next("\"");
        try {
            while (scanner.hasNext()) {
                if (scanner.hasNext("\\\\")) { // backslash
                    scanner.next();
                    interpretEscapeSequenceBody(scanner, result);
                } else if (scanner.hasNext("\"")) {
                    break;
                } else {
                    char c = consume(scanner);
                    result.append(c);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        if (escape) {
//
//        }
        scanner.next("\"");
        return result.toString();
    }


    // Not specified in GDB manual
    @NotNull
    public static String parseSymbol(@NotNull Scanner scanner) {
        var prefix = scanner.next("[a-zA-Z_-]");
        final var result = new StringBuilder();
        result.append(prefix);

        while (scanner.hasNext("[a-zA-Z0-9_-]")) {
            char c = consume(scanner);
            result.append(c);
        }
        return result.toString();
    }

    @NotNull
    public static String parseKlass(Scanner scanner) {
        return parseSymbol(scanner);
    }

    @NotNull
    private static Map<String, ?> parseTuple(@NotNull Scanner scanner) {
        scanner.next("\\{");
        var result = new HashMap<String, Object>();
        while (scanner.hasNext()) {
            if (scanner.hasNext("}")) {
                break;
            }
            var name = parseSymbol(scanner);
            scanner.next("=");
            var value = parseValue(scanner);
            result.put(name, value);
            if (scanner.hasNext(",")) {
                scanner.next();
            } else {
                break;
            }
        }
        scanner.next("}");
        return result;
    }

    @NotNull
    private static List<Map.Entry<String, ?>> parseKeyValueList(@NotNull Scanner scanner) {
        final var result = new ArrayList<Map.Entry<String, ?>>();
        while (scanner.hasNext() && !scanner.hasNext("]")) {
            var name = parseSymbol(scanner);
            scanner.next("=");
            var value = parseValue(scanner);
            result.add(new AbstractMap.SimpleEntry<>(name, value));
            if (scanner.hasNext(",")) {
                scanner.next();
            } else {
                break;
            }
        }
        scanner.next("]");
        return result;
    }

    @NotNull
    private static List<?> parsePrimitiveList(@NotNull Scanner scanner) {
        var result = new ArrayList<Object>();
        while (scanner.hasNext() && !scanner.hasNext("]")) {
            var value = parseValue(scanner);
            result.add(value);
            if (scanner.hasNext(",")) {
                scanner.next();
            } else {
                break;
            }
        }
        scanner.next("]");
        return result;
    }

    @NotNull
    private static List<?> parseList(@NotNull Scanner scanner) {
        scanner.next("\\[");
        if (scanner.hasNext("]")) {
            scanner.next("]");
            return new ArrayList<>();
        } else if (scanner.hasNext("[a-zA-Z_-]")) { // name=value
            return parseKeyValueList(scanner);
        } else { // list of "value"s, not of "name=value"s
            return parsePrimitiveList(scanner);
        }
    }

    @SuppressWarnings("unchecked")
    public static <X> @NotNull X parseValue(@NotNull Scanner scanner) {
        /* c-string | tuple | list
        tuple ==> "{}" | "{" result ( "," result )* "}"
        list ==> "[]"
               | "[" value ( "," value )* "]"
               | "[" result ( "," result )* "]"
        result ==> variable "=" value
        value ==> const | tuple | list
        */
        if (scanner.hasNext("\\{")) {
            return (X) parseTuple(scanner);
        } else if (scanner.hasNext("\\[")) {
            return (X) parseList(scanner);
        } else {
            return (X) parseCString(scanner);
        }
    }

    public void produce(GdbMiStateResponse item) throws InterruptedException {
        //println(currentThread().getId() + currentThread().getName() + " produce");
        myQueue.put(item);
    }

    /// Note: result will be null on timeout.
    public GdbMiStateResponse consume() throws InterruptedException {
        //println(currentThread().getId() + currentThread().getName() + " consume");
        return myQueue.poll(2, TimeUnit.SECONDS);
    }

    public GdbMiProducer() {
    }
}
