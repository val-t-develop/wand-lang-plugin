package com.valtdevelop.wandlangplugin;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import com.valtdevelop.wandlangplugin.psi.WandTypes;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class WandSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey PACKAGE_KEYWORD = createTextAttributesKey("PACKAGE_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey IMPORT_KEYWORD = createTextAttributesKey("IMPORT_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey CLASS_KEYWORD = createTextAttributesKey("CLASS_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey INTERFACE_KEYWORD = createTextAttributesKey("INTERFACE_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey EXTENDS_KEYWORD = createTextAttributesKey("EXTENDS_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey IMPLEMENTS_KEYWORD = createTextAttributesKey("IMPLEMENTS_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey PUBLIC_KEYWORD = createTextAttributesKey("PUBLIC_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey PRIVATE_KEYWORD = createTextAttributesKey("PRIVATE_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey PROTECTED_KEYWORD = createTextAttributesKey("PROTECTED_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey STATIC_KEYWORD = createTextAttributesKey("STATIC_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey ABSTRACT_KEYWORD = createTextAttributesKey("ABSTRACT_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey FINAL_KEYWORD = createTextAttributesKey("FINAL_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey TRANSIENT_KEYWORD = createTextAttributesKey("TRANSIENT_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey VOLATILE_KEYWORD = createTextAttributesKey("VOLATILE_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey SYNCHRONIZED_KEYWORD = createTextAttributesKey("SYNCHRONIZED_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey NATIVE_KEYWORD = createTextAttributesKey("NATIVE_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey RETURN_KEYWORD = createTextAttributesKey("RETURN_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey GOTO_KEYWORD = createTextAttributesKey("GOTO_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey IF_KEYWORD = createTextAttributesKey("IF_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey ELSE_KEYWORD = createTextAttributesKey("ELSE_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey WHILE_KEYWORD = createTextAttributesKey("WHILE_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey DO_KEYWORD = createTextAttributesKey("DO_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey FOR_KEYWORD = createTextAttributesKey("FOR_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey SWITCH_KEYWORD = createTextAttributesKey("SWITCH_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey CASE_KEYWORD = createTextAttributesKey("CASE_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    //public static final TextAttributesKey DEFAULT_KEYWORD = createTextAttributesKey("DEFAULT_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey BREAK_KEYWORD = createTextAttributesKey("BREAK_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey CONTINUE_KEYWORD = createTextAttributesKey("CONTINUE_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey TRY_KEYWORD = createTextAttributesKey("TRY_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey CATCH_KEYWORD = createTextAttributesKey("CATCH_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey THROW_KEYWORD = createTextAttributesKey("THROW_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey THROWS_KEYWORD = createTextAttributesKey("THROWS_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey FINALLY_KEYWORD = createTextAttributesKey("FINALLY_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey THIS_KEYWORD = createTextAttributesKey("THIS_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey SUPER_KEYWORD = createTextAttributesKey("SUPER_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey NEW_KEYWORD = createTextAttributesKey("NEW_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey CONST_KEYWORD = createTextAttributesKey("CONST_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey VOID_KEYWORD = createTextAttributesKey("VOID_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey CHAR_KEYWORD = createTextAttributesKey("CHAR_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey BOOL_KEYWORD = createTextAttributesKey("BOOL_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey BYTE_KEYWORD = createTextAttributesKey("BYTE_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey SHORT_KEYWORD = createTextAttributesKey("SHORT_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey INT_KEYWORD = createTextAttributesKey("INT_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey LONG_KEYWORD = createTextAttributesKey("LONG_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey FLOAT_KEYWORD = createTextAttributesKey("FLOAT_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey DOUBLE_KEYWORD = createTextAttributesKey("DOUBLE_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey INSTANCEOF_KEYWORD = createTextAttributesKey("INSTANCEOF_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey TRUE_KEYWORD = createTextAttributesKey("TRUE_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey FALSE_KEYWORD = createTextAttributesKey("FALSE_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey NULL_KEYWORD = createTextAttributesKey("NULL_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey BLOCK_COMMENT = createTextAttributesKey("BLOCK_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT);
    public static final TextAttributesKey LINE_COMMENT = createTextAttributesKey("LINE_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT);
    public static final TextAttributesKey IDENTIFIER = createTextAttributesKey("IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey STRING_LITERAL = createTextAttributesKey("STRING_LITERAL", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey CHAR_LITERAL = createTextAttributesKey("CHAR_LITERAL", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey DIGITS = createTextAttributesKey("DIGITS", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey OCTAL_DIGITS = createTextAttributesKey("OCTAL_DIGITS", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey HEX_DIGITS = createTextAttributesKey("HEX_DIGITS", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey LBRACE = createTextAttributesKey("LBRACE", DefaultLanguageHighlighterColors.BRACES);
    public static final TextAttributesKey RBRACE = createTextAttributesKey("RBRACE", DefaultLanguageHighlighterColors.BRACES);
    public static final TextAttributesKey LPAREN = createTextAttributesKey("LPAREN", DefaultLanguageHighlighterColors.PARENTHESES);
    public static final TextAttributesKey RPAREN = createTextAttributesKey("RPAREN", DefaultLanguageHighlighterColors.PARENTHESES);
    public static final TextAttributesKey LBRACK = createTextAttributesKey("LBRACK", DefaultLanguageHighlighterColors.BRACKETS);
    public static final TextAttributesKey RBRACK = createTextAttributesKey("RBRACK", DefaultLanguageHighlighterColors.BRACKETS);
    public static final TextAttributesKey SEMICOLON = createTextAttributesKey("SEMICOLON", DefaultLanguageHighlighterColors.SEMICOLON);
    public static final TextAttributesKey DOT = createTextAttributesKey("DOT", DefaultLanguageHighlighterColors.DOT);
    public static final TextAttributesKey COMMA = createTextAttributesKey("COMMA", DefaultLanguageHighlighterColors.COMMA);
    public static final TextAttributesKey ADD = createTextAttributesKey("ADD", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey MINUS = createTextAttributesKey("MINUS", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey MULT = createTextAttributesKey("MULT", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey DIV = createTextAttributesKey("DIV", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey MOD = createTextAttributesKey("MOD", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey NOT = createTextAttributesKey("NOT", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey AND = createTextAttributesKey("AND", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey OR = createTextAttributesKey("OR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey EQ = createTextAttributesKey("EQ", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey NE = createTextAttributesKey("NE", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey LT = createTextAttributesKey("LT", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey GT = createTextAttributesKey("GT", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey LE = createTextAttributesKey("LE", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey GE = createTextAttributesKey("GE", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey BIN_NOT = createTextAttributesKey("BIN_NOT", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey BIN_AND = createTextAttributesKey("BIN_AND", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey BIN_OR = createTextAttributesKey("BIN_OR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey BIN_XOR = createTextAttributesKey("BIN_XOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey LSHIFT = createTextAttributesKey("LSHIFT", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey RSHIFT = createTextAttributesKey("RSHIFT", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey URSHIFT = createTextAttributesKey("URSHIFT", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey ASSIGN = createTextAttributesKey("ASSIGN", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey ADD_ASSIGN = createTextAttributesKey("ADD_ASSIGN", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey MINUS_ASSIGN = createTextAttributesKey("MINUS_ASSIGN", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey MUL_ASSIGN = createTextAttributesKey("MUL_ASSIGN", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey DIV_ASSIGN = createTextAttributesKey("DIV_ASSIGN", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey MOD_ASSIGN = createTextAttributesKey("MOD_ASSIGN", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey BIN_AND_ASSIGN = createTextAttributesKey("BIN_AND_ASSIGN", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey BIN_OR_ASSIGN = createTextAttributesKey("BIN_OR_ASSIGN", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey BIN_XOR_ASSIGN = createTextAttributesKey("BIN_XOR_ASSIGN", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey LSHIFT_ASSIGN = createTextAttributesKey("LSHIFT_ASSIGN", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey RSHIFT_ASSIGN = createTextAttributesKey("RSHIFT_ASSIGN", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey URSHIFT_ASSIGN = createTextAttributesKey("URSHIFT_ASSIGN", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey INC = createTextAttributesKey("INC", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey DEC = createTextAttributesKey("DEC", DefaultLanguageHighlighterColors.OPERATION_SIGN);

    private static final TextAttributesKey[] PACKAGE_KEYWORDS = new TextAttributesKey[]{PACKAGE_KEYWORD};
    private static final TextAttributesKey[] IMPORT_KEYWORDS = new TextAttributesKey[]{IMPORT_KEYWORD};
    private static final TextAttributesKey[] CLASS_KEYWORDS = new TextAttributesKey[]{CLASS_KEYWORD};
    private static final TextAttributesKey[] INTERFACE_KEYWORDS = new TextAttributesKey[]{INTERFACE_KEYWORD};
    private static final TextAttributesKey[] EXTENDS_KEYWORDS = new TextAttributesKey[]{EXTENDS_KEYWORD};
    private static final TextAttributesKey[] IMPLEMENTS_KEYWORDS = new TextAttributesKey[]{IMPLEMENTS_KEYWORD};
    private static final TextAttributesKey[] PUBLIC_KEYWORDS = new TextAttributesKey[]{PUBLIC_KEYWORD};
    private static final TextAttributesKey[] PRIVATE_KEYWORDS = new TextAttributesKey[]{PRIVATE_KEYWORD};
    private static final TextAttributesKey[] PROTECTED_KEYWORDS = new TextAttributesKey[]{PROTECTED_KEYWORD};
    private static final TextAttributesKey[] STATIC_KEYWORDS = new TextAttributesKey[]{STATIC_KEYWORD};
    private static final TextAttributesKey[] ABSTRACT_KEYWORDS = new TextAttributesKey[]{ABSTRACT_KEYWORD};
    private static final TextAttributesKey[] FINAL_KEYWORDS = new TextAttributesKey[]{FINAL_KEYWORD};
    private static final TextAttributesKey[] TRANSIENT_KEYWORDS = new TextAttributesKey[]{TRANSIENT_KEYWORD};
    private static final TextAttributesKey[] VOLATILE_KEYWORDS = new TextAttributesKey[]{VOLATILE_KEYWORD};
    private static final TextAttributesKey[] SYNCHRONIZED_KEYWORDS = new TextAttributesKey[]{SYNCHRONIZED_KEYWORD};
    private static final TextAttributesKey[] NATIVE_KEYWORDS = new TextAttributesKey[]{NATIVE_KEYWORD};
    private static final TextAttributesKey[] RETURN_KEYWORDS = new TextAttributesKey[]{RETURN_KEYWORD};
    private static final TextAttributesKey[] GOTO_KEYWORDS = new TextAttributesKey[]{GOTO_KEYWORD};
    private static final TextAttributesKey[] IF_KEYWORDS = new TextAttributesKey[]{IF_KEYWORD};
    private static final TextAttributesKey[] ELSE_KEYWORDS = new TextAttributesKey[]{ELSE_KEYWORD};
    private static final TextAttributesKey[] WHILE_KEYWORDS = new TextAttributesKey[]{WHILE_KEYWORD};
    private static final TextAttributesKey[] DO_KEYWORDS = new TextAttributesKey[]{DO_KEYWORD};
    private static final TextAttributesKey[] FOR_KEYWORDS = new TextAttributesKey[]{FOR_KEYWORD};
    private static final TextAttributesKey[] SWITCH_KEYWORDS = new TextAttributesKey[]{SWITCH_KEYWORD};
    private static final TextAttributesKey[] CASE_KEYWORDS = new TextAttributesKey[]{CASE_KEYWORD};
    //private static final TextAttributesKey[] DEFAULT_KEYWORDS = new TextAttributesKey[]{DEFAULT_KEYWORD};
    private static final TextAttributesKey[] BREAK_KEYWORDS = new TextAttributesKey[]{BREAK_KEYWORD};
    private static final TextAttributesKey[] CONTINUE_KEYWORDS = new TextAttributesKey[]{CONTINUE_KEYWORD};
    private static final TextAttributesKey[] TRY_KEYWORDS = new TextAttributesKey[]{TRY_KEYWORD};
    private static final TextAttributesKey[] CATCH_KEYWORDS = new TextAttributesKey[]{CATCH_KEYWORD};
    private static final TextAttributesKey[] THROW_KEYWORDS = new TextAttributesKey[]{THROW_KEYWORD};
    private static final TextAttributesKey[] THROWS_KEYWORDS = new TextAttributesKey[]{THROWS_KEYWORD};
    private static final TextAttributesKey[] FINALLY_KEYWORDS = new TextAttributesKey[]{FINALLY_KEYWORD};
    private static final TextAttributesKey[] THIS_KEYWORDS = new TextAttributesKey[]{THIS_KEYWORD};
    private static final TextAttributesKey[] SUPER_KEYWORDS = new TextAttributesKey[]{SUPER_KEYWORD};
    private static final TextAttributesKey[] NEW_KEYWORDS = new TextAttributesKey[]{NEW_KEYWORD};
    private static final TextAttributesKey[] CONST_KEYWORDS = new TextAttributesKey[]{CONST_KEYWORD};
    private static final TextAttributesKey[] VOID_KEYWORDS = new TextAttributesKey[]{VOID_KEYWORD};
    private static final TextAttributesKey[] CHAR_KEYWORDS = new TextAttributesKey[]{CHAR_KEYWORD};
    private static final TextAttributesKey[] BOOL_KEYWORDS = new TextAttributesKey[]{BOOL_KEYWORD};
    private static final TextAttributesKey[] BYTE_KEYWORDS = new TextAttributesKey[]{BYTE_KEYWORD};
    private static final TextAttributesKey[] SHORT_KEYWORDS = new TextAttributesKey[]{SHORT_KEYWORD};
    private static final TextAttributesKey[] INT_KEYWORDS = new TextAttributesKey[]{INT_KEYWORD};
    private static final TextAttributesKey[] LONG_KEYWORDS = new TextAttributesKey[]{LONG_KEYWORD};
    private static final TextAttributesKey[] FLOAT_KEYWORDS = new TextAttributesKey[]{FLOAT_KEYWORD};
    private static final TextAttributesKey[] DOUBLE_KEYWORDS = new TextAttributesKey[]{DOUBLE_KEYWORD};
    private static final TextAttributesKey[] INSTANCEOF_KEYWORDS = new TextAttributesKey[]{INSTANCEOF_KEYWORD};
    private static final TextAttributesKey[] TRUE_KEYWORDS = new TextAttributesKey[]{TRUE_KEYWORD};
    private static final TextAttributesKey[] FALSE_KEYWORDS = new TextAttributesKey[]{FALSE_KEYWORD};
    private static final TextAttributesKey[] NULL_KEYWORDS = new TextAttributesKey[]{NULL_KEYWORD};
    private static final TextAttributesKey[] BLOCK_COMMENTS = new TextAttributesKey[]{BLOCK_COMMENT};
    private static final TextAttributesKey[] LINE_COMMENTS = new TextAttributesKey[]{LINE_COMMENT};
    private static final TextAttributesKey[] IDENTIFIERS = new TextAttributesKey[]{IDENTIFIER};
    private static final TextAttributesKey[] STRING_LITERALS = new TextAttributesKey[]{STRING_LITERAL};
    private static final TextAttributesKey[] CHAR_LITERALS = new TextAttributesKey[]{CHAR_LITERAL};
    private static final TextAttributesKey[] DIGITSS = new TextAttributesKey[]{DIGITS};
    private static final TextAttributesKey[] OCTAL_DIGITSS = new TextAttributesKey[]{OCTAL_DIGITS};
    private static final TextAttributesKey[] HEX_DIGITSS = new TextAttributesKey[]{HEX_DIGITS};
    private static final TextAttributesKey[] LBRACES = new TextAttributesKey[]{LBRACE};
    private static final TextAttributesKey[] RBRACES = new TextAttributesKey[]{RBRACE};
    private static final TextAttributesKey[] LPARENS = new TextAttributesKey[]{LPAREN};
    private static final TextAttributesKey[] RPARENS = new TextAttributesKey[]{RPAREN};
    private static final TextAttributesKey[] LBRACKS = new TextAttributesKey[]{LBRACK};
    private static final TextAttributesKey[] RBRACKS = new TextAttributesKey[]{RBRACK};
    private static final TextAttributesKey[] SEMICOLONS = new TextAttributesKey[]{SEMICOLON};
    private static final TextAttributesKey[] DOTS = new TextAttributesKey[]{DOT};
    private static final TextAttributesKey[] COMMAS = new TextAttributesKey[]{COMMA};
    private static final TextAttributesKey[] ADDS = new TextAttributesKey[]{ADD};
    private static final TextAttributesKey[] MINUSS = new TextAttributesKey[]{MINUS};
    private static final TextAttributesKey[] MULTS = new TextAttributesKey[]{MULT};
    private static final TextAttributesKey[] DIVS = new TextAttributesKey[]{DIV};
    private static final TextAttributesKey[] MODS = new TextAttributesKey[]{MOD};
    private static final TextAttributesKey[] NOTS = new TextAttributesKey[]{NOT};
    private static final TextAttributesKey[] ANDS = new TextAttributesKey[]{AND};
    private static final TextAttributesKey[] ORS = new TextAttributesKey[]{OR};
    private static final TextAttributesKey[] EQS = new TextAttributesKey[]{EQ};
    private static final TextAttributesKey[] NES = new TextAttributesKey[]{NE};
    private static final TextAttributesKey[] LTS = new TextAttributesKey[]{LT};
    private static final TextAttributesKey[] GTS = new TextAttributesKey[]{GT};
    private static final TextAttributesKey[] LES = new TextAttributesKey[]{LE};
    private static final TextAttributesKey[] GES = new TextAttributesKey[]{GE};
    private static final TextAttributesKey[] BIN_NOTS = new TextAttributesKey[]{BIN_NOT};
    private static final TextAttributesKey[] BIN_ANDS = new TextAttributesKey[]{BIN_AND};
    private static final TextAttributesKey[] BIN_ORS = new TextAttributesKey[]{BIN_OR};
    private static final TextAttributesKey[] BIN_XORS = new TextAttributesKey[]{BIN_XOR};
    private static final TextAttributesKey[] LSHIFTS = new TextAttributesKey[]{LSHIFT};
    private static final TextAttributesKey[] RSHIFTS = new TextAttributesKey[]{RSHIFT};
    private static final TextAttributesKey[] URSHIFTS = new TextAttributesKey[]{URSHIFT};
    private static final TextAttributesKey[] ASSIGNS = new TextAttributesKey[]{ASSIGN};
    private static final TextAttributesKey[] ADD_ASSIGNS = new TextAttributesKey[]{ADD_ASSIGN};
    private static final TextAttributesKey[] MINUS_ASSIGNS = new TextAttributesKey[]{MINUS_ASSIGN};
    private static final TextAttributesKey[] MUL_ASSIGNS = new TextAttributesKey[]{MUL_ASSIGN};
    private static final TextAttributesKey[] DIV_ASSIGNS = new TextAttributesKey[]{DIV_ASSIGN};
    private static final TextAttributesKey[] MOD_ASSIGNS = new TextAttributesKey[]{MOD_ASSIGN};
    private static final TextAttributesKey[] BIN_AND_ASSIGNS = new TextAttributesKey[]{BIN_AND_ASSIGN};
    private static final TextAttributesKey[] BIN_OR_ASSIGNS = new TextAttributesKey[]{BIN_OR_ASSIGN};
    private static final TextAttributesKey[] BIN_XOR_ASSIGNS = new TextAttributesKey[]{BIN_XOR_ASSIGN};
    private static final TextAttributesKey[] LSHIFT_ASSIGNS = new TextAttributesKey[]{LSHIFT_ASSIGN};
    private static final TextAttributesKey[] RSHIFT_ASSIGNS = new TextAttributesKey[]{RSHIFT_ASSIGN};
    private static final TextAttributesKey[] URSHIFT_ASSIGNS = new TextAttributesKey[]{URSHIFT_ASSIGN};
    private static final TextAttributesKey[] INCS = new TextAttributesKey[]{INC};
    private static final TextAttributesKey[] DECS = new TextAttributesKey[]{DEC};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new WandLexerAdapter();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(WandTypes.PACKAGE)) {return PACKAGE_KEYWORDS;}
        if (tokenType.equals(WandTypes.IMPORT)) {return IMPORT_KEYWORDS;}
        if (tokenType.equals(WandTypes.CLASS)) {return CLASS_KEYWORDS;}
        if (tokenType.equals(WandTypes.INTERFACE)) {return INTERFACE_KEYWORDS;}
        if (tokenType.equals(WandTypes.EXTENDS)) {return EXTENDS_KEYWORDS;}
        if (tokenType.equals(WandTypes.IMPLEMENTS)) {return IMPLEMENTS_KEYWORDS;}
        if (tokenType.equals(WandTypes.PUBLIC)) {return PUBLIC_KEYWORDS;}
        if (tokenType.equals(WandTypes.PRIVATE)) {return PRIVATE_KEYWORDS;}
        if (tokenType.equals(WandTypes.PROTECTED)) {return PROTECTED_KEYWORDS;}
        if (tokenType.equals(WandTypes.STATIC)) {return STATIC_KEYWORDS;}
        if (tokenType.equals(WandTypes.ABSTRACT)) {return ABSTRACT_KEYWORDS;}
        if (tokenType.equals(WandTypes.FINAL)) {return FINAL_KEYWORDS;}
        if (tokenType.equals(WandTypes.TRANSIENT)) {return TRANSIENT_KEYWORDS;}
        if (tokenType.equals(WandTypes.VOLATILE)) {return VOLATILE_KEYWORDS;}
        if (tokenType.equals(WandTypes.SYNCHRONIZED)) {return SYNCHRONIZED_KEYWORDS;}
        if (tokenType.equals(WandTypes.NATIVE)) {return NATIVE_KEYWORDS;}
        if (tokenType.equals(WandTypes.RETURN)) {return RETURN_KEYWORDS;}
        if (tokenType.equals(WandTypes.GOTO)) {return GOTO_KEYWORDS;}
        if (tokenType.equals(WandTypes.IF)) {return IF_KEYWORDS;}
        if (tokenType.equals(WandTypes.ELSE)) {return ELSE_KEYWORDS;}
        if (tokenType.equals(WandTypes.WHILE)) {return WHILE_KEYWORDS;}
        if (tokenType.equals(WandTypes.DO)) {return DO_KEYWORDS;}
        if (tokenType.equals(WandTypes.FOR)) {return FOR_KEYWORDS;}
        if (tokenType.equals(WandTypes.SWITCH)) {return SWITCH_KEYWORDS;}
        if (tokenType.equals(WandTypes.CASE)) {return CASE_KEYWORDS;}
        //if (tokenType.equals(WandTypes.DEFAULT)) {return DEFAULT_KEYWORDS;}
        if (tokenType.equals(WandTypes.BREAK)) {return BREAK_KEYWORDS;}
        if (tokenType.equals(WandTypes.CONTINUE)) {return CONTINUE_KEYWORDS;}
        if (tokenType.equals(WandTypes.TRY)) {return TRY_KEYWORDS;}
        if (tokenType.equals(WandTypes.CATCH)) {return CATCH_KEYWORDS;}
        if (tokenType.equals(WandTypes.THROW)) {return THROW_KEYWORDS;}
        if (tokenType.equals(WandTypes.THROWS)) {return THROWS_KEYWORDS;}
        if (tokenType.equals(WandTypes.FINALLY)) {return FINALLY_KEYWORDS;}
        if (tokenType.equals(WandTypes.THIS)) {return THIS_KEYWORDS;}
        if (tokenType.equals(WandTypes.SUPER)) {return SUPER_KEYWORDS;}
        if (tokenType.equals(WandTypes.NEW)) {return NEW_KEYWORDS;}
        if (tokenType.equals(WandTypes.CONST)) {return CONST_KEYWORDS;}
        if (tokenType.equals(WandTypes.VOID)) {return VOID_KEYWORDS;}
        if (tokenType.equals(WandTypes.CHAR)) {return CHAR_KEYWORDS;}
        if (tokenType.equals(WandTypes.BOOL)) {return BOOL_KEYWORDS;}
        if (tokenType.equals(WandTypes.BYTE)) {return BYTE_KEYWORDS;}
        if (tokenType.equals(WandTypes.SHORT)) {return SHORT_KEYWORDS;}
        if (tokenType.equals(WandTypes.INT)) {return INT_KEYWORDS;}
        if (tokenType.equals(WandTypes.LONG)) {return LONG_KEYWORDS;}
        if (tokenType.equals(WandTypes.FLOAT)) {return FLOAT_KEYWORDS;}
        if (tokenType.equals(WandTypes.DOUBLE)) {return DOUBLE_KEYWORDS;}
        if (tokenType.equals(WandTypes.INSTANCEOF)) {return INSTANCEOF_KEYWORDS;}
        if (tokenType.equals(WandTypes.TRUE)) {return TRUE_KEYWORDS;}
        if (tokenType.equals(WandTypes.FALSE)) {return FALSE_KEYWORDS;}
        if (tokenType.equals(WandTypes.NULL)) {return NULL_KEYWORDS;}
        if (tokenType.equals(WandTypes.BLOCK_COMMENT)) {return BLOCK_COMMENTS;}
        if (tokenType.equals(WandTypes.LINE_COMMENT)) {return LINE_COMMENTS;}
        if (tokenType.equals(WandTypes.IDENTIFIER)) {return IDENTIFIERS;}
        if (tokenType.equals(WandTypes.STRING_LITERAL)) {return STRING_LITERALS;}
        if (tokenType.equals(WandTypes.CHAR_LITERAL)) {return CHAR_LITERALS;}
        if (tokenType.equals(WandTypes.DIGITS)) {return DIGITSS;}
        if (tokenType.equals(WandTypes.OCTAL_DIGITS)) {return OCTAL_DIGITSS;}
        if (tokenType.equals(WandTypes.HEX_DIGITS)) {return HEX_DIGITSS;}
        if (tokenType.equals(WandTypes.LBRACE)) {return LBRACES;}
        if (tokenType.equals(WandTypes.RBRACE)) {return RBRACES;}
        if (tokenType.equals(WandTypes.LPAREN)) {return LPARENS;}
        if (tokenType.equals(WandTypes.RPAREN)) {return RPARENS;}
        if (tokenType.equals(WandTypes.LBRACK)) {return LBRACKS;}
        if (tokenType.equals(WandTypes.RBRACK)) {return RBRACKS;}
        if (tokenType.equals(WandTypes.SEMICOLON)) {  return SEMICOLONS;}
        if (tokenType.equals(WandTypes.DOT)) {  return DOTS;}
        if (tokenType.equals(WandTypes.COMMA)) {return COMMAS;}
        if (tokenType.equals(WandTypes.ADD)) {return ADDS;}
        if (tokenType.equals(WandTypes.MINUS)) {return MINUSS;}
        if (tokenType.equals(WandTypes.MULT)) {return MULTS;}
        if (tokenType.equals(WandTypes.DIV)) {return DIVS;}
        if (tokenType.equals(WandTypes.MOD)) {return MODS;}
        if (tokenType.equals(WandTypes.NOT)) {return NOTS;}
        if (tokenType.equals(WandTypes.AND)) {return ANDS;}
        if (tokenType.equals(WandTypes.OR)) {return ORS;}
        if (tokenType.equals(WandTypes.EQ)) {return EQS;}
        if (tokenType.equals(WandTypes.NE)) {return NES;}
        if (tokenType.equals(WandTypes.LT)) {return LTS;}
        if (tokenType.equals(WandTypes.GT)) {return GTS;}
        if (tokenType.equals(WandTypes.LE)) {return LES;}
        if (tokenType.equals(WandTypes.GE)) {return GES;}
        if (tokenType.equals(WandTypes.BIN_NOT)) {return BIN_NOTS;}
        if (tokenType.equals(WandTypes.BIN_AND)) {return BIN_ANDS;}
        if (tokenType.equals(WandTypes.BIN_OR)) {return BIN_ORS;}
        if (tokenType.equals(WandTypes.BIN_XOR)) {return BIN_XORS;}
        if (tokenType.equals(WandTypes.LSHIFT)) {return LSHIFTS;}
        if (tokenType.equals(WandTypes.RSHIFT)) {return RSHIFTS;}
        if (tokenType.equals(WandTypes.URSHIFT)) {return URSHIFTS;}
        if (tokenType.equals(WandTypes.ASSIGN)) {return ASSIGNS;}
        if (tokenType.equals(WandTypes.ADD_ASSIGN)) {return ADD_ASSIGNS;}
        if (tokenType.equals(WandTypes.MINUS_ASSIGN)) {return MINUS_ASSIGNS;}
        if (tokenType.equals(WandTypes.MUL_ASSIGN)) {return MUL_ASSIGNS;}
        if (tokenType.equals(WandTypes.DIV_ASSIGN)) {return DIV_ASSIGNS;}
        if (tokenType.equals(WandTypes.MOD_ASSIGN)) {return MOD_ASSIGNS;}
        if (tokenType.equals(WandTypes.BIN_AND_ASSIGN)) {return BIN_AND_ASSIGNS;}
        if (tokenType.equals(WandTypes.BIN_OR_ASSIGN)) {return BIN_OR_ASSIGNS;}
        if (tokenType.equals(WandTypes.BIN_XOR_ASSIGN)) {return BIN_XOR_ASSIGNS;}
        if (tokenType.equals(WandTypes.LSHIFT_ASSIGN)) {return LSHIFT_ASSIGNS;}
        if (tokenType.equals(WandTypes.RSHIFT_ASSIGN)) {return RSHIFT_ASSIGNS;}
        if (tokenType.equals(WandTypes.URSHIFT_ASSIGN)) {return URSHIFT_ASSIGNS;}
        if (tokenType.equals(WandTypes.INC)) {return INCS;}
        if (tokenType.equals(WandTypes.DEC)) {return DECS;}
        return EMPTY_KEYS;
    }
}
