package com.valtdevelop.wandlangplugin.psi;

import com.intellij.psi.tree.TokenSet;
import com.intellij.psi.tree.TokenSet;
import com.intellij.psi.tree.TokenSet;

public interface WandTokenSets {
    TokenSet ABSTRACT = TokenSet.create(WandTypes.ABSTRACT);
    TokenSet ADD = TokenSet.create(WandTypes.ADD);
    TokenSet ADD_ASSIGN = TokenSet.create(WandTypes.ADD_ASSIGN);
    TokenSet AND = TokenSet.create(WandTypes.AND);
    TokenSet ASSING = TokenSet.create(WandTypes.ASSIGN);
    TokenSet BIN_AND = TokenSet.create(WandTypes.BIN_AND);
    TokenSet BIN_AND_ASSIGN = TokenSet.create(WandTypes.BIN_AND_ASSIGN);
    TokenSet BIN_NOT = TokenSet.create(WandTypes.BIN_NOT);
    TokenSet BIN_OR = TokenSet.create(WandTypes.BIN_OR);
    TokenSet BIN_OR_ASSIGN = TokenSet.create(WandTypes.BIN_OR_ASSIGN);
    TokenSet BIN_XOR = TokenSet.create(WandTypes.BIN_XOR);
    TokenSet BIN_XOR_ASSIGN = TokenSet.create(WandTypes.BIN_XOR_ASSIGN);
    TokenSet BLOCK_COMMENT = TokenSet.create(WandTypes.BLOCK_COMMENT);
    TokenSet BOOL = TokenSet.create(WandTypes.BOOL);
    TokenSet BREAK = TokenSet.create(WandTypes.BREAK);
    TokenSet BYTE = TokenSet.create(WandTypes.BYTE);
    TokenSet CASE = TokenSet.create(WandTypes.CASE);
    TokenSet CATCH = TokenSet.create(WandTypes.CATCH);
    TokenSet CHAR = TokenSet.create(WandTypes.CHAR);
    TokenSet CHAR_LITERAL = TokenSet.create(WandTypes.CHAR_LITERAL);
    TokenSet CLASS = TokenSet.create(WandTypes.CLASS);
    TokenSet COLON = TokenSet.create(WandTypes.COLON);
    TokenSet COMMA = TokenSet.create(WandTypes.COMMA);
    TokenSet CONST = TokenSet.create(WandTypes.CONST);
    TokenSet CONTINUE = TokenSet.create(WandTypes.CONTINUE);
    TokenSet DEC = TokenSet.create(WandTypes.DEC);
    TokenSet DEFAULT = TokenSet.create(WandTypes.DEFAULT);
    TokenSet DIGITS = TokenSet.create(WandTypes.DIGITS);
    TokenSet DIV = TokenSet.create(WandTypes.DIV);
    TokenSet DIV_ASSIGN = TokenSet.create(WandTypes.DIV_ASSIGN);
    TokenSet DO = TokenSet.create(WandTypes.DO);
    TokenSet DOT = TokenSet.create(WandTypes.DOT);
    TokenSet DOUBLE = TokenSet.create(WandTypes.DOUBLE);
    TokenSet DOUBLE_BIG_POST = TokenSet.create(WandTypes.DOUBLE_BIG_POST);
    TokenSet DOUBLE_SMALL_POST = TokenSet.create(WandTypes.DOUBLE_SMALL_POST);
    TokenSet ELSE = TokenSet.create(WandTypes.ELSE);
    TokenSet EQ = TokenSet.create(WandTypes.EQ);
    TokenSet EXP_BIG = TokenSet.create(WandTypes.EXP_BIG);
    TokenSet EXP_SMALL = TokenSet.create(WandTypes.EXP_SMALL);
    TokenSet EXTENDS = TokenSet.create(WandTypes.EXTENDS);
    TokenSet FALSE = TokenSet.create(WandTypes.FALSE);
    TokenSet FINAL = TokenSet.create(WandTypes.FINAL);
    TokenSet FINALLY = TokenSet.create(WandTypes.FINALLY);
    TokenSet FLOAT = TokenSet.create(WandTypes.FLOAT);
    TokenSet FLOAT_BIG_POST = TokenSet.create(WandTypes.FLOAT_BIG_POST);
    TokenSet FLOAT_SMALL_POST = TokenSet.create(WandTypes.FLOAT_SMALL_POST);
    TokenSet FOR = TokenSet.create(WandTypes.FOR);
    TokenSet GE = TokenSet.create(WandTypes.GE);
    TokenSet GOTO = TokenSet.create(WandTypes.GOTO);
    TokenSet GT = TokenSet.create(WandTypes.GT);
    TokenSet HEX_DIGITS = TokenSet.create(WandTypes.HEX_DIGITS);
    TokenSet IDENTIFIER = TokenSet.create(WandTypes.IDENTIFIER);
    TokenSet IF = TokenSet.create(WandTypes.IF);
    TokenSet IMPLEMENTS = TokenSet.create(WandTypes.IMPLEMENTS);
    TokenSet IMPORT = TokenSet.create(WandTypes.IMPORT);
    TokenSet INC = TokenSet.create(WandTypes.INC);
    TokenSet INSTANCEOF = TokenSet.create(WandTypes.INSTANCEOF);
    TokenSet INT = TokenSet.create(WandTypes.INT);
    TokenSet INTERFACE = TokenSet.create(WandTypes.INTERFACE);
    TokenSet LBRACE = TokenSet.create(WandTypes.LBRACE);
    TokenSet LBRACK = TokenSet.create(WandTypes.LBRACK);
    TokenSet LE = TokenSet.create(WandTypes.LE);
    TokenSet LINE_COMMENT = TokenSet.create(WandTypes.LINE_COMMENT);
    TokenSet LONG = TokenSet.create(WandTypes.LONG);
    TokenSet LONG_BIG_POST = TokenSet.create(WandTypes.LONG_BIG_POST);
    TokenSet LONG_SMALL_POST = TokenSet.create(WandTypes.LONG_SMALL_POST);
    TokenSet LPAREN = TokenSet.create(WandTypes.LPAREN);
    TokenSet LSHIFT = TokenSet.create(WandTypes.LSHIFT);
    TokenSet LSHIFT_ASSIGN = TokenSet.create(WandTypes.LSHIFT_ASSIGN);
    TokenSet LT = TokenSet.create(WandTypes.LT);
    TokenSet MINUS = TokenSet.create(WandTypes.MINUS);
    TokenSet MINUS_ASSIGN = TokenSet.create(WandTypes.MINUS_ASSIGN);
    TokenSet MOD = TokenSet.create(WandTypes.MOD);
    TokenSet MOD_ASSIGN = TokenSet.create(WandTypes.MOD_ASSIGN);
    TokenSet MULT = TokenSet.create(WandTypes.MULT);
    TokenSet MUL_ASSIGN = TokenSet.create(WandTypes.MUL_ASSIGN);
    TokenSet NATIVE = TokenSet.create(WandTypes.NATIVE);
    TokenSet NE = TokenSet.create(WandTypes.NE);
    TokenSet NEW = TokenSet.create(WandTypes.NEW);
    TokenSet NOT = TokenSet.create(WandTypes.NOT);
    TokenSet NULL = TokenSet.create(WandTypes.NULL);
    TokenSet OCTAL_DIGITS = TokenSet.create(WandTypes.OCTAL_DIGITS);
    TokenSet OR = TokenSet.create(WandTypes.OR);
    TokenSet PACKAGE = TokenSet.create(WandTypes.PACKAGE);
    TokenSet PRIVATE = TokenSet.create(WandTypes.PRIVATE);
    TokenSet PROTECTED = TokenSet.create(WandTypes.PROTECTED);
    TokenSet PUBLIC = TokenSet.create(WandTypes.PUBLIC);
    TokenSet QUESTION = TokenSet.create(WandTypes.QUESTION);
    TokenSet RBRACE = TokenSet.create(WandTypes.RBRACE);
    TokenSet RBRACK = TokenSet.create(WandTypes.RBRACK);
    TokenSet RETURN = TokenSet.create(WandTypes.RETURN);
    TokenSet RPAREN = TokenSet.create(WandTypes.RPAREN);
    TokenSet RSHIFT = TokenSet.create(WandTypes.RSHIFT);
    TokenSet RSHIFT_ASSIGN = TokenSet.create(WandTypes.RSHIFT_ASSIGN);
    TokenSet SEMICOLON = TokenSet.create(WandTypes.SEMICOLON);
    TokenSet SHORT = TokenSet.create(WandTypes.SHORT);
    TokenSet STATIC = TokenSet.create(WandTypes.STATIC);
    TokenSet STRING_LITERAL = TokenSet.create(WandTypes.STRING_LITERAL);
    TokenSet SUPER = TokenSet.create(WandTypes.SUPER);
    TokenSet SWITCH = TokenSet.create(WandTypes.SWITCH);
    TokenSet SYNCHRONIZED = TokenSet.create(WandTypes.SYNCHRONIZED);
    TokenSet THIS = TokenSet.create(WandTypes.THIS);
    TokenSet THROW = TokenSet.create(WandTypes.THROW);
    TokenSet THROWS = TokenSet.create(WandTypes.THROWS);
    TokenSet TRANSIENT = TokenSet.create(WandTypes.TRANSIENT);
    TokenSet TRUE = TokenSet.create(WandTypes.TRUE);
    TokenSet TRY = TokenSet.create(WandTypes.TRY);
    TokenSet URSHIFT = TokenSet.create(WandTypes.URSHIFT);
    TokenSet URSHIFT_ASSIGN = TokenSet.create(WandTypes.URSHIFT_ASSIGN);
    TokenSet VOID = TokenSet.create(WandTypes.VOID);
    TokenSet VOLATILE = TokenSet.create(WandTypes.VOLATILE);
    TokenSet WHILE = TokenSet.create(WandTypes.WHILE);
}
