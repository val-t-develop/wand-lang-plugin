package com.valtdevelop.wandlangplugin;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class WandColorSettingsPage implements ColorSettingsPage {

    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
        new AttributesDescriptor("Package", WandSyntaxHighlighter.PACKAGE_KEYWORD),
        new AttributesDescriptor("Import", WandSyntaxHighlighter.IMPORT_KEYWORD),
        new AttributesDescriptor("Class", WandSyntaxHighlighter.CLASS_KEYWORD),
        new AttributesDescriptor("Interface", WandSyntaxHighlighter.INTERFACE_KEYWORD),
        new AttributesDescriptor("Extends", WandSyntaxHighlighter.EXTENDS_KEYWORD),
        new AttributesDescriptor("Implements", WandSyntaxHighlighter.IMPLEMENTS_KEYWORD),
        new AttributesDescriptor("Public", WandSyntaxHighlighter.PUBLIC_KEYWORD),
        new AttributesDescriptor("Private", WandSyntaxHighlighter.PRIVATE_KEYWORD),
        new AttributesDescriptor("Protected", WandSyntaxHighlighter.PROTECTED_KEYWORD),
        new AttributesDescriptor("Static", WandSyntaxHighlighter.STATIC_KEYWORD),
        new AttributesDescriptor("Abstract", WandSyntaxHighlighter.ABSTRACT_KEYWORD),
        new AttributesDescriptor("Final", WandSyntaxHighlighter.FINAL_KEYWORD),
        new AttributesDescriptor("Transient", WandSyntaxHighlighter.TRANSIENT_KEYWORD),
        new AttributesDescriptor("Volatile", WandSyntaxHighlighter.VOLATILE_KEYWORD),
        new AttributesDescriptor("Synchronized", WandSyntaxHighlighter.SYNCHRONIZED_KEYWORD),
        new AttributesDescriptor("Native", WandSyntaxHighlighter.NATIVE_KEYWORD),
        new AttributesDescriptor("Return", WandSyntaxHighlighter.RETURN_KEYWORD),
        new AttributesDescriptor("Goto", WandSyntaxHighlighter.GOTO_KEYWORD),
        new AttributesDescriptor("If", WandSyntaxHighlighter.IF_KEYWORD),
        new AttributesDescriptor("Else", WandSyntaxHighlighter.ELSE_KEYWORD),
        new AttributesDescriptor("While", WandSyntaxHighlighter.WHILE_KEYWORD),
        new AttributesDescriptor("Do", WandSyntaxHighlighter.DO_KEYWORD),
        new AttributesDescriptor("For", WandSyntaxHighlighter.FOR_KEYWORD),
        new AttributesDescriptor("Switch", WandSyntaxHighlighter.SWITCH_KEYWORD),
        new AttributesDescriptor("Case", WandSyntaxHighlighter.CASE_KEYWORD),
        //new AttributesDescriptor("Default", WandSyntaxHighlighter.DEFAULT_KEYWORD),
        new AttributesDescriptor("Break", WandSyntaxHighlighter.BREAK_KEYWORD),
        new AttributesDescriptor("Continue", WandSyntaxHighlighter.CONTINUE_KEYWORD),
        new AttributesDescriptor("Try", WandSyntaxHighlighter.TRY_KEYWORD),
        new AttributesDescriptor("Catch", WandSyntaxHighlighter.CATCH_KEYWORD),
        new AttributesDescriptor("Throw", WandSyntaxHighlighter.THROW_KEYWORD),
        new AttributesDescriptor("Throws", WandSyntaxHighlighter.THROWS_KEYWORD),
        new AttributesDescriptor("Finally", WandSyntaxHighlighter.FINALLY_KEYWORD),
        new AttributesDescriptor("This", WandSyntaxHighlighter.THIS_KEYWORD),
        new AttributesDescriptor("Super", WandSyntaxHighlighter.SUPER_KEYWORD),
        new AttributesDescriptor("New", WandSyntaxHighlighter.NEW_KEYWORD),
        new AttributesDescriptor("Const", WandSyntaxHighlighter.CONST_KEYWORD),
        new AttributesDescriptor("Void", WandSyntaxHighlighter.VOID_KEYWORD),
        new AttributesDescriptor("Char", WandSyntaxHighlighter.CHAR_KEYWORD),
        new AttributesDescriptor("Bool", WandSyntaxHighlighter.BOOL_KEYWORD),
        new AttributesDescriptor("Byte", WandSyntaxHighlighter.BYTE_KEYWORD),
        new AttributesDescriptor("Short", WandSyntaxHighlighter.SHORT_KEYWORD),
        new AttributesDescriptor("Int", WandSyntaxHighlighter.INT_KEYWORD),
        new AttributesDescriptor("Long", WandSyntaxHighlighter.LONG_KEYWORD),
        new AttributesDescriptor("Float", WandSyntaxHighlighter.FLOAT_KEYWORD),
        new AttributesDescriptor("Double", WandSyntaxHighlighter.DOUBLE_KEYWORD),
        new AttributesDescriptor("Instanceof", WandSyntaxHighlighter.INSTANCEOF_KEYWORD),
        new AttributesDescriptor("True", WandSyntaxHighlighter.TRUE_KEYWORD),
        new AttributesDescriptor("False", WandSyntaxHighlighter.FALSE_KEYWORD),
        new AttributesDescriptor("Null", WandSyntaxHighlighter.NULL_KEYWORD),
        new AttributesDescriptor("Block comment", WandSyntaxHighlighter.BLOCK_COMMENT),
        new AttributesDescriptor("Line comment", WandSyntaxHighlighter.LINE_COMMENT),
        new AttributesDescriptor("Identifier", WandSyntaxHighlighter.IDENTIFIER),
        new AttributesDescriptor("String literal", WandSyntaxHighlighter.STRING_LITERAL),
        new AttributesDescriptor("Char literal", WandSyntaxHighlighter.CHAR_LITERAL),
        new AttributesDescriptor("Digits", WandSyntaxHighlighter.DIGITS),
        new AttributesDescriptor("Octal digits", WandSyntaxHighlighter.OCTAL_DIGITS),
        new AttributesDescriptor("Hex digits", WandSyntaxHighlighter.HEX_DIGITS),
        new AttributesDescriptor("{", WandSyntaxHighlighter.LBRACE),
        new AttributesDescriptor("}", WandSyntaxHighlighter.RBRACE),
        new AttributesDescriptor("(", WandSyntaxHighlighter.LPAREN),
        new AttributesDescriptor(")", WandSyntaxHighlighter.RPAREN),
        new AttributesDescriptor("[", WandSyntaxHighlighter.LBRACK),
        new AttributesDescriptor("]", WandSyntaxHighlighter.RBRACK),
        new AttributesDescriptor(";", WandSyntaxHighlighter.SEMICOLON),
        new AttributesDescriptor(".", WandSyntaxHighlighter.DOT),
        new AttributesDescriptor(",", WandSyntaxHighlighter.COMMA),
        new AttributesDescriptor("+", WandSyntaxHighlighter.ADD),
        new AttributesDescriptor("-", WandSyntaxHighlighter.MINUS),
        new AttributesDescriptor("*", WandSyntaxHighlighter.MULT),
        new AttributesDescriptor("/", WandSyntaxHighlighter.DIV),
        new AttributesDescriptor("%", WandSyntaxHighlighter.MOD),
        new AttributesDescriptor("!", WandSyntaxHighlighter.NOT),
        new AttributesDescriptor("&&", WandSyntaxHighlighter.AND),
        new AttributesDescriptor("||", WandSyntaxHighlighter.OR),
        new AttributesDescriptor("==", WandSyntaxHighlighter.EQ),
        new AttributesDescriptor("!=", WandSyntaxHighlighter.NE),
        new AttributesDescriptor("<", WandSyntaxHighlighter.LT),
        new AttributesDescriptor(">", WandSyntaxHighlighter.GT),
        new AttributesDescriptor("<=", WandSyntaxHighlighter.LE),
        new AttributesDescriptor(">=", WandSyntaxHighlighter.GE),
        new AttributesDescriptor("~", WandSyntaxHighlighter.BIN_NOT),
        new AttributesDescriptor("&", WandSyntaxHighlighter.BIN_AND),
        new AttributesDescriptor("|", WandSyntaxHighlighter.BIN_OR),
        new AttributesDescriptor("^", WandSyntaxHighlighter.BIN_XOR),
        new AttributesDescriptor("<<", WandSyntaxHighlighter.LSHIFT),
        new AttributesDescriptor(">>", WandSyntaxHighlighter.RSHIFT),
        new AttributesDescriptor(">>>", WandSyntaxHighlighter.URSHIFT),
        new AttributesDescriptor("=", WandSyntaxHighlighter.ASSIGN),
        new AttributesDescriptor("+=", WandSyntaxHighlighter.ADD_ASSIGN),
        new AttributesDescriptor("-=", WandSyntaxHighlighter.MINUS_ASSIGN),
        new AttributesDescriptor("*=", WandSyntaxHighlighter.MUL_ASSIGN),
        new AttributesDescriptor("/=", WandSyntaxHighlighter.DIV_ASSIGN),
        new AttributesDescriptor("%=", WandSyntaxHighlighter.MOD_ASSIGN),
        new AttributesDescriptor("&=", WandSyntaxHighlighter.BIN_AND_ASSIGN),
        new AttributesDescriptor("|=", WandSyntaxHighlighter.BIN_OR_ASSIGN),
        new AttributesDescriptor("^=", WandSyntaxHighlighter.BIN_XOR_ASSIGN),
        new AttributesDescriptor("<<=", WandSyntaxHighlighter.LSHIFT_ASSIGN),
        new AttributesDescriptor(">>=", WandSyntaxHighlighter.RSHIFT_ASSIGN),
        new AttributesDescriptor(">>>=", WandSyntaxHighlighter.URSHIFT_ASSIGN),
        new AttributesDescriptor("++", WandSyntaxHighlighter.INC),
        new AttributesDescriptor("--", WandSyntaxHighlighter.DEC)
    };

    @Override
    public Icon getIcon() {
        return WandIcon.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new WandSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return """
        # You are reading the ".properties" entry.
        ! The exclamation mark can also mark text as comments.
        website = https://en.wikipedia.org/
        language = English
        # The backslash below tells the application to continue reading
        # the value onto the next line.
        message = Welcome to \\
                  Wikipedia!
        # Add spaces to the key
        key\\ with\\ spaces = This is the value that could be looked up with the key "key with spaces".
        # Unicode
        tab : \\u0009""";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @Override
    public AttributesDescriptor @NotNull [] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @Override
    public ColorDescriptor @NotNull [] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Wand";
    }

}