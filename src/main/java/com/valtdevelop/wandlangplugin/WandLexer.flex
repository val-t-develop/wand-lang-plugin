package com.valtdevelop.wandlangplugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.valtdevelop.wandlangplugin.psi.WandTypes.*;

%%

%{
  public _WandLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class WandLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

SPACE=[ \t\n\x0B\f\r]+
LINE_COMMENT="//".*
BLOCK_COMMENT="/"\*(.|\n)*\*"/"
IDENTIFIER=[a-zA-Z_][a-zA-Z_0-9]*
STRING_LITERAL=\"([^\"\\]*(\\.[^\"\\]*)*)\"
CHAR_LITERAL='([^'\\]|\\.)'
DIGITS=[0-9]+
OCTAL_DIGITS=[0-7]+

%%
<YYINITIAL> {
  {WHITE_SPACE}             { return WHITE_SPACE; }

  "package"                 { return PACKAGE; }
  "import"                  { return IMPORT; }
  "class"                   { return CLASS; }
  "interface"               { return INTERFACE; }
  "extends"                 { return EXTENDS; }
  "implements"              { return IMPLEMENTS; }
  "public"                  { return PUBLIC; }
  "private"                 { return PRIVATE; }
  "protected"               { return PROTECTED; }
  "static"                  { return STATIC; }
  "abstract"                { return ABSTRACT; }
  "final"                   { return FINAL; }
  "transient"               { return TRANSIENT; }
  "volatile"                { return VOLATILE; }
  "synchronized"            { return SYNCHRONIZED; }
  "native"                  { return NATIVE; }
  "return"                  { return RETURN; }
  "goto"                    { return GOTO; }
  "if"                      { return IF; }
  "else"                    { return ELSE; }
  "while"                   { return WHILE; }
  "do"                      { return DO; }
  "for"                     { return FOR; }
  "switch"                  { return SWITCH; }
  "case"                    { return CASE; }
  "default"                 { return DEFAULT; }
  "break"                   { return BREAK; }
  "continue"                { return CONTINUE; }
  "try"                     { return TRY; }
  "catch"                   { return CATCH; }
  "throw"                   { return THROW; }
  "throws"                  { return THROWS; }
  "finally"                 { return FINALLY; }
  "this"                    { return THIS; }
  "super"                   { return SUPER; }
  "new"                     { return NEW; }
  "const"                   { return CONST; }
  "void"                    { return VOID; }
  "char"                    { return CHAR; }
  "bool"                    { return BOOL; }
  "byte"                    { return BYTE; }
  "short"                   { return SHORT; }
  "int"                     { return INT; }
  "long"                    { return LONG; }
  "float"                   { return FLOAT; }
  "double"                  { return DOUBLE; }
  "instanceof"              { return INSTANCEOF; }
  "true"                    { return TRUE; }
  "false"                   { return FALSE; }
  "null"                    { return NULL; }
  "l"                       { return LONG_SMALL_POST; }
  "L"                       { return LONG_BIG_POST; }
  "f"                       { return FLOAT_SMALL_POST; }
  "F"                       { return FLOAT_BIG_POST; }
  "d"                       { return DOUBLE_SMALL_POST; }
  "D"                       { return DOUBLE_BIG_POST; }
  "e"                       { return EXP_SMALL; }
  "E"                       { return EXP_BIG; }
  "x"                       { return HEX_X_SMALL; }
  "X"                       { return HEX_X_BIG; }
  "{"                       { return LBRACE; }
  "}"                       { return RBRACE; }
  "("                       { return LPAREN; }
  ")"                       { return RPAREN; }
  "["                       { return LBRACK; }
  "]"                       { return RBRACK; }
  ";"                       { return SEMICOLON; }
  ":"                       { return COLON; }
  "?"                       { return QUESTION; }
  "."                       { return DOT; }
  ","                       { return COMMA; }
  "+"                       { return ADD; }
  "-"                       { return MINUS; }
  "*"                       { return MULT; }
  "/"                       { return DIV; }
  "%"                       { return MOD; }
  "!"                       { return NOT; }
  "&&"                      { return AND; }
  "||"                      { return OR; }
  "=="                      { return EQ; }
  "!="                      { return NE; }
  "<"                       { return LT; }
  ">"                       { return GT; }
  "<="                      { return LE; }
  ">="                      { return GE; }
  "~"                       { return BIN_NOT; }
  "&"                       { return BIN_AND; }
  "|"                       { return BIN_OR; }
  "^"                       { return BIN_XOR; }
  "<<"                      { return LSHIFT; }
  ">>"                      { return RSHIFT; }
  ">>>"                     { return URSHIFT; }
  "="                       { return ASSING; }
  "+="                      { return ADD_ASSIGN; }
  "-="                      { return MINUS_ASSIGN; }
  "*="                      { return MUL_ASSIGN; }
  "/="                      { return DIV_ASSIGN; }
  "%="                      { return MOD_ASSIGN; }
  "&="                      { return BIN_AND_ASSIGN; }
  "|="                      { return BIN_OR_ASSIGN; }
  "^="                      { return BIN_XOR_ASSIGN; }
  "<<="                     { return LSHIFT_ASSIGN; }
  ">>="                     { return RSHIFT_ASSIGN; }
  ">>>="                    { return URSHIFT_ASSIGN; }
  "++"                      { return INC; }
  "--"                      { return DEC; }
  "0[xX][0-9a-fA-F]+"       { return HEX_DIGITS; }

  {SPACE}                   { return SPACE; }
  {LINE_COMMENT}            { return LINE_COMMENT; }
  {BLOCK_COMMENT}           { return BLOCK_COMMENT; }
  {IDENTIFIER}              { return IDENTIFIER; }
  {STRING_LITERAL}          { return STRING_LITERAL; }
  {CHAR_LITERAL}            { return CHAR_LITERAL; }
  {DIGITS}                  { return DIGITS; }
  {OCTAL_DIGITS}            { return OCTAL_DIGITS; }

}

[^] { return BAD_CHARACTER; }
