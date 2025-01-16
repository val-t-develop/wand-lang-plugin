// This is a generated file. Not intended for manual editing.
package com.valtdevelop.wandlangplugin;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.valtdevelop.wandlangplugin.psi.WandTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class WandParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return root(b, l + 1);
  }

  /* ********************************************************** */
  // abstract_method_modifiers? result_type method_declarator throws_list? ';'
  public static boolean abstract_method_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstract_method_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ABSTRACT_METHOD_DECLARATION, "<abstract method declaration>");
    r = abstract_method_declaration_0(b, l + 1);
    r = r && result_type(b, l + 1);
    r = r && method_declarator(b, l + 1);
    r = r && abstract_method_declaration_3(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // abstract_method_modifiers?
  private static boolean abstract_method_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstract_method_declaration_0")) return false;
    abstract_method_modifiers(b, l + 1);
    return true;
  }

  // throws_list?
  private static boolean abstract_method_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstract_method_declaration_3")) return false;
    throws_list(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'public' | 'abstract'
  public static boolean abstract_method_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstract_method_modifier")) return false;
    if (!nextTokenIs(b, "<abstract method modifier>", ABSTRACT, PUBLIC)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ABSTRACT_METHOD_MODIFIER, "<abstract method modifier>");
    r = consumeToken(b, PUBLIC);
    if (!r) r = consumeToken(b, ABSTRACT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // abstract_method_modifier*
  public static boolean abstract_method_modifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstract_method_modifiers")) return false;
    Marker m = enter_section_(b, l, _NONE_, ABSTRACT_METHOD_MODIFIERS, "<abstract method modifiers>");
    while (true) {
      int c = current_position_(b);
      if (!abstract_method_modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "abstract_method_modifiers", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // multiplicative_expression (('+'|'-') multiplicative_expression)*
  public static boolean additive_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additive_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ADDITIVE_EXPRESSION, "<additive expression>");
    r = multiplicative_expression(b, l + 1);
    r = r && additive_expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (('+'|'-') multiplicative_expression)*
  private static boolean additive_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additive_expression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!additive_expression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "additive_expression_1", c)) break;
    }
    return true;
  }

  // ('+'|'-') multiplicative_expression
  private static boolean additive_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additive_expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = additive_expression_1_0_0(b, l + 1);
    r = r && multiplicative_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '+'|'-'
  private static boolean additive_expression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additive_expression_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, ADD);
    if (!r) r = consumeToken(b, MINUS);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER ('.' IDENTIFIER)*
  public static boolean ambiguous_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ambiguous_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && ambiguous_name_1(b, l + 1);
    exit_section_(b, m, AMBIGUOUS_NAME, r);
    return r;
  }

  // ('.' IDENTIFIER)*
  private static boolean ambiguous_name_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ambiguous_name_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ambiguous_name_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ambiguous_name_1", c)) break;
    }
    return true;
  }

  // '.' IDENTIFIER
  private static boolean ambiguous_name_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ambiguous_name_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOT, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // equality_expression ('&' equality_expression)*
  public static boolean and_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "and_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, AND_EXPRESSION, "<and expression>");
    r = equality_expression(b, l + 1);
    r = r && and_expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('&' equality_expression)*
  private static boolean and_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "and_expression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!and_expression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "and_expression_1", c)) break;
    }
    return true;
  }

  // '&' equality_expression
  private static boolean and_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "and_expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BIN_AND);
    r = r && equality_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expression (',' expression)*
  public static boolean argument_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARGUMENT_LIST, "<argument list>");
    r = expression(b, l + 1);
    r = r && argument_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' expression)*
  private static boolean argument_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!argument_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "argument_list_1", c)) break;
    }
    return true;
  }

  // ',' expression
  private static boolean argument_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'new' primitive_type dim_exprs dims? | 'new' class_or_interface_type dim_exprs dims?
  public static boolean array_creation_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_creation_expression")) return false;
    if (!nextTokenIs(b, NEW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = array_creation_expression_0(b, l + 1);
    if (!r) r = array_creation_expression_1(b, l + 1);
    exit_section_(b, m, ARRAY_CREATION_EXPRESSION, r);
    return r;
  }

  // 'new' primitive_type dim_exprs dims?
  private static boolean array_creation_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_creation_expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEW);
    r = r && primitive_type(b, l + 1);
    r = r && dim_exprs(b, l + 1);
    r = r && array_creation_expression_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // dims?
  private static boolean array_creation_expression_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_creation_expression_0_3")) return false;
    dims(b, l + 1);
    return true;
  }

  // 'new' class_or_interface_type dim_exprs dims?
  private static boolean array_creation_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_creation_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEW);
    r = r && class_or_interface_type(b, l + 1);
    r = r && dim_exprs(b, l + 1);
    r = r && array_creation_expression_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // dims?
  private static boolean array_creation_expression_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_creation_expression_1_3")) return false;
    dims(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '{' variable_initializers? ',' ? '}'
  public static boolean array_initializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_initializer")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && array_initializer_1(b, l + 1);
    r = r && array_initializer_2(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, ARRAY_INITIALIZER, r);
    return r;
  }

  // variable_initializers?
  private static boolean array_initializer_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_initializer_1")) return false;
    variable_initializers(b, l + 1);
    return true;
  }

  // ',' ?
  private static boolean array_initializer_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_initializer_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // left_hand_side assignment_operator assignment_expression
  public static boolean assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGNMENT, "<assignment>");
    r = left_hand_side(b, l + 1);
    r = r && assignment_operator(b, l + 1);
    r = r && assignment_expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // conditional_expression | assignment
  public static boolean assignment_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGNMENT_EXPRESSION, "<assignment expression>");
    r = conditional_expression(b, l + 1);
    if (!r) r = assignment(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '>>>=' | '&=' | '^=' | '|='
  public static boolean assignment_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGNMENT_OPERATOR, "<assignment operator>");
    r = consumeToken(b, ASSIGN);
    if (!r) r = consumeToken(b, MUL_ASSIGN);
    if (!r) r = consumeToken(b, DIV_ASSIGN);
    if (!r) r = consumeToken(b, MOD_ASSIGN);
    if (!r) r = consumeToken(b, ADD_ASSIGN);
    if (!r) r = consumeToken(b, MINUS_ASSIGN);
    if (!r) r = consumeToken(b, LSHIFT_ASSIGN);
    if (!r) r = consumeToken(b, RSHIFT_ASSIGN);
    if (!r) r = consumeToken(b, URSHIFT_ASSIGN);
    if (!r) r = consumeToken(b, BIN_AND_ASSIGN);
    if (!r) r = consumeToken(b, BIN_XOR_ASSIGN);
    if (!r) r = consumeToken(b, BIN_OR_ASSIGN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '{' block_statements? '}'
  public static boolean block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && block_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, BLOCK, r);
    return r;
  }

  // block_statements?
  private static boolean block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_1")) return false;
    block_statements(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // local_variable_declaration_statement | statement
  public static boolean block_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_STATEMENT, "<block statement>");
    r = local_variable_declaration_statement(b, l + 1);
    if (!r) r = statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // block_statement*
  public static boolean block_statements(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_statements")) return false;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_STATEMENTS, "<block statements>");
    while (true) {
      int c = current_position_(b);
      if (!block_statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "block_statements", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // 'true' | 'false'
  public static boolean boolean_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "boolean_literal")) return false;
    if (!nextTokenIs(b, "<boolean literal>", FALSE, TRUE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOLEAN_LITERAL, "<boolean literal>");
    r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'break' IDENTIFIER? ';'
  public static boolean break_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "break_statement")) return false;
    if (!nextTokenIs(b, BREAK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BREAK);
    r = r && break_statement_1(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, BREAK_STATEMENT, r);
    return r;
  }

  // IDENTIFIER?
  private static boolean break_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "break_statement_1")) return false;
    consumeToken(b, IDENTIFIER);
    return true;
  }

  /* ********************************************************** */
  // '(' primitive_type ')' unary_expression | '(' reference_type ')' unary_expression_not_plus_minus
  public static boolean cast_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cast_expression")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cast_expression_0(b, l + 1);
    if (!r) r = cast_expression_1(b, l + 1);
    exit_section_(b, m, CAST_EXPRESSION, r);
    return r;
  }

  // '(' primitive_type ')' unary_expression
  private static boolean cast_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cast_expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && primitive_type(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && unary_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' reference_type ')' unary_expression_not_plus_minus
  private static boolean cast_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cast_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && reference_type(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && unary_expression_not_plus_minus(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'catch' ( formal_parameter ) block
  public static boolean catch_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catch_clause")) return false;
    if (!nextTokenIs(b, CATCH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CATCH);
    r = r && catch_clause_1(b, l + 1);
    r = r && block(b, l + 1);
    exit_section_(b, m, CATCH_CLAUSE, r);
    return r;
  }

  // ( formal_parameter )
  private static boolean catch_clause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catch_clause_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = formal_parameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // catch_clause*
  public static boolean catches(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catches")) return false;
    Marker m = enter_section_(b, l, _NONE_, CATCHES, "<catches>");
    while (true) {
      int c = current_position_(b);
      if (!catch_clause(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "catches", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // '{' class_body_declarations? '}'
  public static boolean class_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_body")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && class_body_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, CLASS_BODY, r);
    return r;
  }

  // class_body_declarations?
  private static boolean class_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_body_1")) return false;
    class_body_declarations(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // class_member_declaration | static_initializer | constructor_declaration | type_declaration
  public static boolean class_body_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_body_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_BODY_DECLARATION, "<class body declaration>");
    r = class_member_declaration(b, l + 1);
    if (!r) r = static_initializer(b, l + 1);
    if (!r) r = constructor_declaration(b, l + 1);
    if (!r) r = type_declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // class_body_declaration*
  public static boolean class_body_declarations(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_body_declarations")) return false;
    Marker m = enter_section_(b, l, _NONE_, CLASS_BODY_DECLARATIONS, "<class body declarations>");
    while (true) {
      int c = current_position_(b);
      if (!class_body_declaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "class_body_declarations", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // class_modifiers? 'class' IDENTIFIER extending? interfaces? class_body
  public static boolean class_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_DECLARATION, "<class declaration>");
    r = class_declaration_0(b, l + 1);
    r = r && consumeTokens(b, 0, CLASS, IDENTIFIER);
    r = r && class_declaration_3(b, l + 1);
    r = r && class_declaration_4(b, l + 1);
    r = r && class_body(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // class_modifiers?
  private static boolean class_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_0")) return false;
    class_modifiers(b, l + 1);
    return true;
  }

  // extending?
  private static boolean class_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_3")) return false;
    extending(b, l + 1);
    return true;
  }

  // interfaces?
  private static boolean class_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_4")) return false;
    interfaces(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'new' class_type '(' argument_list? ')'
  public static boolean class_instance_creation_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_instance_creation_expression")) return false;
    if (!nextTokenIs(b, NEW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEW);
    r = r && class_type(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && class_instance_creation_expression_3(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, CLASS_INSTANCE_CREATION_EXPRESSION, r);
    return r;
  }

  // argument_list?
  private static boolean class_instance_creation_expression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_instance_creation_expression_3")) return false;
    argument_list(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // field_declaration | method_declaration
  public static boolean class_member_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_member_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_MEMBER_DECLARATION, "<class member declaration>");
    r = field_declaration(b, l + 1);
    if (!r) r = method_declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'public' | 'abstract' | 'final'
  public static boolean class_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_modifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_MODIFIER, "<class modifier>");
    r = consumeToken(b, PUBLIC);
    if (!r) r = consumeToken(b, ABSTRACT);
    if (!r) r = consumeToken(b, FINAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // class_modifier*
  public static boolean class_modifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_modifiers")) return false;
    Marker m = enter_section_(b, l, _NONE_, CLASS_MODIFIERS, "<class modifiers>");
    while (true) {
      int c = current_position_(b);
      if (!class_modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "class_modifiers", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // class_type | interface_type
  public static boolean class_or_interface_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_or_interface_type")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_type(b, l + 1);
    if (!r) r = interface_type(b, l + 1);
    exit_section_(b, m, CLASS_OR_INTERFACE_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // type_name
  public static boolean class_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_type")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_name(b, l + 1);
    exit_section_(b, m, CLASS_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // class_type (',' class_type)*
  public static boolean class_type_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_type_list")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_type(b, l + 1);
    r = r && class_type_list_1(b, l + 1);
    exit_section_(b, m, CLASS_TYPE_LIST, r);
    return r;
  }

  // (',' class_type)*
  private static boolean class_type_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_type_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!class_type_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "class_type_list_1", c)) break;
    }
    return true;
  }

  // ',' class_type
  private static boolean class_type_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_type_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && class_type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // inclusive_or_expression ('&&' inclusive_or_expression)*
  public static boolean conditional_and_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_and_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONDITIONAL_AND_EXPRESSION, "<conditional and expression>");
    r = inclusive_or_expression(b, l + 1);
    r = r && conditional_and_expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('&&' inclusive_or_expression)*
  private static boolean conditional_and_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_and_expression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!conditional_and_expression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "conditional_and_expression_1", c)) break;
    }
    return true;
  }

  // '&&' inclusive_or_expression
  private static boolean conditional_and_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_and_expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AND);
    r = r && inclusive_or_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // conditional_or_expression | conditional_or_expression '?' expression ':' conditional_expression
  public static boolean conditional_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONDITIONAL_EXPRESSION, "<conditional expression>");
    r = conditional_or_expression(b, l + 1);
    if (!r) r = conditional_expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // conditional_or_expression '?' expression ':' conditional_expression
  private static boolean conditional_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = conditional_or_expression(b, l + 1);
    r = r && consumeToken(b, QUESTION);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && conditional_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // conditional_and_expression ('||' conditional_and_expression)*
  public static boolean conditional_or_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_or_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONDITIONAL_OR_EXPRESSION, "<conditional or expression>");
    r = conditional_and_expression(b, l + 1);
    r = r && conditional_or_expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('||' conditional_and_expression)*
  private static boolean conditional_or_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_or_expression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!conditional_or_expression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "conditional_or_expression_1", c)) break;
    }
    return true;
  }

  // '||' conditional_and_expression
  private static boolean conditional_or_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_or_expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OR);
    r = r && conditional_and_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // constant_modifiers type variable_declarator
  public static boolean constant_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTANT_DECLARATION, "<constant declaration>");
    r = constant_modifiers(b, l + 1);
    r = r && type(b, l + 1);
    r = r && variable_declarator(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // expression
  public static boolean constant_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTANT_EXPRESSION, "<constant expression>");
    r = expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'public' | 'static' | 'final'
  public static boolean constant_modifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_modifiers")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTANT_MODIFIERS, "<constant modifiers>");
    r = consumeToken(b, PUBLIC);
    if (!r) r = consumeToken(b, STATIC);
    if (!r) r = consumeToken(b, FINAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // explicit_constructor_invocation? block_statements?
  public static boolean constructor_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTRUCTOR_BODY, "<constructor body>");
    r = constructor_body_0(b, l + 1);
    r = r && constructor_body_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // explicit_constructor_invocation?
  private static boolean constructor_body_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_body_0")) return false;
    explicit_constructor_invocation(b, l + 1);
    return true;
  }

  // block_statements?
  private static boolean constructor_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_body_1")) return false;
    block_statements(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // constructor_modifiers? constructor_declarator throws_list? constructor_body
  public static boolean constructor_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTRUCTOR_DECLARATION, "<constructor declaration>");
    r = constructor_declaration_0(b, l + 1);
    r = r && constructor_declarator(b, l + 1);
    r = r && constructor_declaration_2(b, l + 1);
    r = r && constructor_body(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // constructor_modifiers?
  private static boolean constructor_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_declaration_0")) return false;
    constructor_modifiers(b, l + 1);
    return true;
  }

  // throws_list?
  private static boolean constructor_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_declaration_2")) return false;
    throws_list(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // simple_type_name '(' formal_parameter_list? ')'
  public static boolean constructor_declarator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_declarator")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simple_type_name(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && constructor_declarator_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, CONSTRUCTOR_DECLARATOR, r);
    return r;
  }

  // formal_parameter_list?
  private static boolean constructor_declarator_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_declarator_2")) return false;
    formal_parameter_list(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'public' | 'protected' | 'private'
  public static boolean constructor_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_modifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTRUCTOR_MODIFIER, "<constructor modifier>");
    r = consumeToken(b, PUBLIC);
    if (!r) r = consumeToken(b, PROTECTED);
    if (!r) r = consumeToken(b, PRIVATE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // constructor_modifier*
  public static boolean constructor_modifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_modifiers")) return false;
    Marker m = enter_section_(b, l, _NONE_, CONSTRUCTOR_MODIFIERS, "<constructor modifiers>");
    while (true) {
      int c = current_position_(b);
      if (!constructor_modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "constructor_modifiers", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // 'continue' IDENTIFIER? ';'
  public static boolean continue_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "continue_statement")) return false;
    if (!nextTokenIs(b, CONTINUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONTINUE);
    r = r && continue_statement_1(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, CONTINUE_STATEMENT, r);
    return r;
  }

  // IDENTIFIER?
  private static boolean continue_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "continue_statement_1")) return false;
    consumeToken(b, IDENTIFIER);
    return true;
  }

  /* ********************************************************** */
  // DIGITS integer_type_suffix?
  public static boolean decimal_integer_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decimal_integer_literal")) return false;
    if (!nextTokenIs(b, DIGITS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DIGITS);
    r = r && decimal_integer_literal_1(b, l + 1);
    exit_section_(b, m, DECIMAL_INTEGER_LITERAL, r);
    return r;
  }

  // integer_type_suffix?
  private static boolean decimal_integer_literal_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decimal_integer_literal_1")) return false;
    integer_type_suffix(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '[' expression ']'
  public static boolean dim_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dim_expr")) return false;
    if (!nextTokenIs(b, LBRACK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACK);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RBRACK);
    exit_section_(b, m, DIM_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // dim_expr*
  public static boolean dim_exprs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dim_exprs")) return false;
    Marker m = enter_section_(b, l, _NONE_, DIM_EXPRS, "<dim exprs>");
    while (true) {
      int c = current_position_(b);
      if (!dim_expr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "dim_exprs", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // ('[' ']')*
  public static boolean dims(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dims")) return false;
    Marker m = enter_section_(b, l, _NONE_, DIMS, "<dims>");
    while (true) {
      int c = current_position_(b);
      if (!dims_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "dims", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // '[' ']'
  private static boolean dims_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dims_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LBRACK, RBRACK);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'do' statement 'while' ( expression ) ';'
  public static boolean do_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "do_statement")) return false;
    if (!nextTokenIs(b, DO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DO);
    r = r && statement(b, l + 1);
    r = r && consumeToken(b, WHILE);
    r = r && do_statement_3(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, DO_STATEMENT, r);
    return r;
  }

  // ( expression )
  private static boolean do_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "do_statement_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // relational_expression (('=='|'!=') relational_expression)*
  public static boolean equality_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equality_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EQUALITY_EXPRESSION, "<equality expression>");
    r = relational_expression(b, l + 1);
    r = r && equality_expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (('=='|'!=') relational_expression)*
  private static boolean equality_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equality_expression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!equality_expression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "equality_expression_1", c)) break;
    }
    return true;
  }

  // ('=='|'!=') relational_expression
  private static boolean equality_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equality_expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = equality_expression_1_0_0(b, l + 1);
    r = r && relational_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '=='|'!='
  private static boolean equality_expression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equality_expression_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, EQ);
    if (!r) r = consumeToken(b, NE);
    return r;
  }

  /* ********************************************************** */
  // and_expression ('^' and_expression)*
  public static boolean exclusive_or_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exclusive_or_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXCLUSIVE_OR_EXPRESSION, "<exclusive or expression>");
    r = and_expression(b, l + 1);
    r = r && exclusive_or_expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('^' and_expression)*
  private static boolean exclusive_or_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exclusive_or_expression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!exclusive_or_expression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "exclusive_or_expression_1", c)) break;
    }
    return true;
  }

  // '^' and_expression
  private static boolean exclusive_or_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exclusive_or_expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BIN_XOR);
    r = r && and_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'this' ( argument_list? ) | 'super' ( argument_list? )
  public static boolean explicit_constructor_invocation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "explicit_constructor_invocation")) return false;
    if (!nextTokenIs(b, "<explicit constructor invocation>", SUPER, THIS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPLICIT_CONSTRUCTOR_INVOCATION, "<explicit constructor invocation>");
    r = explicit_constructor_invocation_0(b, l + 1);
    if (!r) r = explicit_constructor_invocation_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'this' ( argument_list? )
  private static boolean explicit_constructor_invocation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "explicit_constructor_invocation_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, THIS);
    r = r && explicit_constructor_invocation_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // argument_list?
  private static boolean explicit_constructor_invocation_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "explicit_constructor_invocation_0_1")) return false;
    argument_list(b, l + 1);
    return true;
  }

  // 'super' ( argument_list? )
  private static boolean explicit_constructor_invocation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "explicit_constructor_invocation_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SUPER);
    r = r && explicit_constructor_invocation_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // argument_list?
  private static boolean explicit_constructor_invocation_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "explicit_constructor_invocation_1_1")) return false;
    argument_list(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'e' | 'E'
  public static boolean exponent_indicator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exponent_indicator")) return false;
    if (!nextTokenIs(b, "<exponent indicator>", EXP_BIG, EXP_SMALL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPONENT_INDICATOR, "<exponent indicator>");
    r = consumeToken(b, EXP_SMALL);
    if (!r) r = consumeToken(b, EXP_BIG);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // exponent_indicator signed_integer
  public static boolean exponent_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exponent_part")) return false;
    if (!nextTokenIs(b, "<exponent part>", EXP_BIG, EXP_SMALL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPONENT_PART, "<exponent part>");
    r = exponent_indicator(b, l + 1);
    r = r && signed_integer(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // assignment_expression
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = assignment_expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER | ambiguous_name '.' IDENTIFIER
  public static boolean expression_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = expression_name_1(b, l + 1);
    exit_section_(b, m, EXPRESSION_NAME, r);
    return r;
  }

  // ambiguous_name '.' IDENTIFIER
  private static boolean expression_name_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_name_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ambiguous_name(b, l + 1);
    r = r && consumeTokens(b, 0, DOT, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // statement_expression ';'
  public static boolean expression_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_STATEMENT, "<expression statement>");
    r = statement_expression(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'extends' class_type
  public static boolean extending(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extending")) return false;
    if (!nextTokenIs(b, EXTENDS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXTENDS);
    r = r && class_type(b, l + 1);
    exit_section_(b, m, EXTENDING, r);
    return r;
  }

  /* ********************************************************** */
  // 'extends' interface_type (',' interface_type)*
  public static boolean extends_interfaces(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extends_interfaces")) return false;
    if (!nextTokenIs(b, EXTENDS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXTENDS);
    r = r && interface_type(b, l + 1);
    r = r && extends_interfaces_2(b, l + 1);
    exit_section_(b, m, EXTENDS_INTERFACES, r);
    return r;
  }

  // (',' interface_type)*
  private static boolean extends_interfaces_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extends_interfaces_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!extends_interfaces_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "extends_interfaces_2", c)) break;
    }
    return true;
  }

  // ',' interface_type
  private static boolean extends_interfaces_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extends_interfaces_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && interface_type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // field_modifiers? type variable_declarators ';'
  public static boolean field_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FIELD_DECLARATION, "<field declaration>");
    r = field_declaration_0(b, l + 1);
    r = r && type(b, l + 1);
    r = r && variable_declarators(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // field_modifiers?
  private static boolean field_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_declaration_0")) return false;
    field_modifiers(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'public' | 'protected' | 'private' | 'static' | 'final' | 'transient' | 'volatile'
  public static boolean field_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_modifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FIELD_MODIFIER, "<field modifier>");
    r = consumeToken(b, PUBLIC);
    if (!r) r = consumeToken(b, PROTECTED);
    if (!r) r = consumeToken(b, PRIVATE);
    if (!r) r = consumeToken(b, STATIC);
    if (!r) r = consumeToken(b, FINAL);
    if (!r) r = consumeToken(b, TRANSIENT);
    if (!r) r = consumeToken(b, VOLATILE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // field_modifier*
  public static boolean field_modifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_modifiers")) return false;
    Marker m = enter_section_(b, l, _NONE_, FIELD_MODIFIERS, "<field modifiers>");
    while (true) {
      int c = current_position_(b);
      if (!field_modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "field_modifiers", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // 'finally' block
  public static boolean finally_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "finally_block")) return false;
    if (!nextTokenIs(b, FINALLY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FINALLY);
    r = r && block(b, l + 1);
    exit_section_(b, m, FINALLY_BLOCK, r);
    return r;
  }

  /* ********************************************************** */
  // 'f' | 'F' | 'd' | 'D'
  public static boolean float_type_suffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "float_type_suffix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FLOAT_TYPE_SUFFIX, "<float type suffix>");
    r = consumeToken(b, FLOAT_SMALL_POST);
    if (!r) r = consumeToken(b, FLOAT_BIG_POST);
    if (!r) r = consumeToken(b, DOUBLE_SMALL_POST);
    if (!r) r = consumeToken(b, DOUBLE_BIG_POST);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (DIGITS '.' DIGITS? exponent_part? float_type_suffix?)
  //     | (DIGITS exponent_part? float_type_suffix?)
  public static boolean floating_point_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "floating_point_literal")) return false;
    if (!nextTokenIs(b, DIGITS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = floating_point_literal_0(b, l + 1);
    if (!r) r = floating_point_literal_1(b, l + 1);
    exit_section_(b, m, FLOATING_POINT_LITERAL, r);
    return r;
  }

  // DIGITS '.' DIGITS? exponent_part? float_type_suffix?
  private static boolean floating_point_literal_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "floating_point_literal_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DIGITS, DOT);
    r = r && floating_point_literal_0_2(b, l + 1);
    r = r && floating_point_literal_0_3(b, l + 1);
    r = r && floating_point_literal_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DIGITS?
  private static boolean floating_point_literal_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "floating_point_literal_0_2")) return false;
    consumeToken(b, DIGITS);
    return true;
  }

  // exponent_part?
  private static boolean floating_point_literal_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "floating_point_literal_0_3")) return false;
    exponent_part(b, l + 1);
    return true;
  }

  // float_type_suffix?
  private static boolean floating_point_literal_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "floating_point_literal_0_4")) return false;
    float_type_suffix(b, l + 1);
    return true;
  }

  // DIGITS exponent_part? float_type_suffix?
  private static boolean floating_point_literal_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "floating_point_literal_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DIGITS);
    r = r && floating_point_literal_1_1(b, l + 1);
    r = r && floating_point_literal_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // exponent_part?
  private static boolean floating_point_literal_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "floating_point_literal_1_1")) return false;
    exponent_part(b, l + 1);
    return true;
  }

  // float_type_suffix?
  private static boolean floating_point_literal_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "floating_point_literal_1_2")) return false;
    float_type_suffix(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'float' | 'double'
  public static boolean floating_point_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "floating_point_type")) return false;
    if (!nextTokenIs(b, "<floating point type>", DOUBLE, FLOAT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FLOATING_POINT_TYPE, "<floating point type>");
    r = consumeToken(b, FLOAT);
    if (!r) r = consumeToken(b, DOUBLE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // statement_expression_list | local_variable_declaration
  public static boolean for_init(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_init")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FOR_INIT, "<for init>");
    r = statement_expression_list(b, l + 1);
    if (!r) r = local_variable_declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'for' '(' for_init? ';' expression? ';' for_update? ')' statement
  public static boolean for_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FOR, LPAREN);
    r = r && for_statement_2(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    r = r && for_statement_4(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    r = r && for_statement_6(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && statement(b, l + 1);
    exit_section_(b, m, FOR_STATEMENT, r);
    return r;
  }

  // for_init?
  private static boolean for_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement_2")) return false;
    for_init(b, l + 1);
    return true;
  }

  // expression?
  private static boolean for_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement_4")) return false;
    expression(b, l + 1);
    return true;
  }

  // for_update?
  private static boolean for_statement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement_6")) return false;
    for_update(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'for' '(' for_init? ';' expression? ';' for_update? ')' statement_no_short_if
  public static boolean for_statement_no_short_if(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement_no_short_if")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FOR, LPAREN);
    r = r && for_statement_no_short_if_2(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    r = r && for_statement_no_short_if_4(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    r = r && for_statement_no_short_if_6(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && statement_no_short_if(b, l + 1);
    exit_section_(b, m, FOR_STATEMENT_NO_SHORT_IF, r);
    return r;
  }

  // for_init?
  private static boolean for_statement_no_short_if_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement_no_short_if_2")) return false;
    for_init(b, l + 1);
    return true;
  }

  // expression?
  private static boolean for_statement_no_short_if_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement_no_short_if_4")) return false;
    expression(b, l + 1);
    return true;
  }

  // for_update?
  private static boolean for_statement_no_short_if_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement_no_short_if_6")) return false;
    for_update(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // statement_expression_list
  public static boolean for_update(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_update")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FOR_UPDATE, "<for update>");
    r = statement_expression_list(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // type variable_declarator_id
  public static boolean formal_parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_parameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FORMAL_PARAMETER, "<formal parameter>");
    r = type(b, l + 1);
    r = r && variable_declarator_id(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // formal_parameter (',' formal_parameter)*
  public static boolean formal_parameter_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_parameter_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FORMAL_PARAMETER_LIST, "<formal parameter list>");
    r = formal_parameter(b, l + 1);
    r = r && formal_parameter_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' formal_parameter)*
  private static boolean formal_parameter_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_parameter_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!formal_parameter_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "formal_parameter_list_1", c)) break;
    }
    return true;
  }

  // ',' formal_parameter
  private static boolean formal_parameter_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_parameter_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && formal_parameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // HEX_DIGITS integer_type_suffix?
  public static boolean hex_integer_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hex_integer_literal")) return false;
    if (!nextTokenIs(b, HEX_DIGITS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, HEX_DIGITS);
    r = r && hex_integer_literal_1(b, l + 1);
    exit_section_(b, m, HEX_INTEGER_LITERAL, r);
    return r;
  }

  // integer_type_suffix?
  private static boolean hex_integer_literal_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hex_integer_literal_1")) return false;
    integer_type_suffix(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'if' '(' expression ')' statement_no_short_if 'else' statement
  public static boolean if_then_else_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_then_else_statement")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IF, LPAREN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && statement_no_short_if(b, l + 1);
    r = r && consumeToken(b, ELSE);
    r = r && statement(b, l + 1);
    exit_section_(b, m, IF_THEN_ELSE_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // 'if' '(' expression ')' statement_no_short_if 'else' statement_no_short_if
  public static boolean if_then_else_statement_no_short_if(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_then_else_statement_no_short_if")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IF, LPAREN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && statement_no_short_if(b, l + 1);
    r = r && consumeToken(b, ELSE);
    r = r && statement_no_short_if(b, l + 1);
    exit_section_(b, m, IF_THEN_ELSE_STATEMENT_NO_SHORT_IF, r);
    return r;
  }

  /* ********************************************************** */
  // 'if' '(' expression ')' statement
  public static boolean if_then_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_then_statement")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IF, LPAREN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && statement(b, l + 1);
    exit_section_(b, m, IF_THEN_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // single_type_import_declaration | type_import_on_demand_declaration
  public static boolean import_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_declaration")) return false;
    if (!nextTokenIs(b, IMPORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = single_type_import_declaration(b, l + 1);
    if (!r) r = type_import_on_demand_declaration(b, l + 1);
    exit_section_(b, m, IMPORT_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // import_declaration*
  public static boolean import_declarations(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_declarations")) return false;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_DECLARATIONS, "<import declarations>");
    while (true) {
      int c = current_position_(b);
      if (!import_declaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "import_declarations", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // exclusive_or_expression ('|' exclusive_or_expression)*
  public static boolean inclusive_or_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inclusive_or_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INCLUSIVE_OR_EXPRESSION, "<inclusive or expression>");
    r = exclusive_or_expression(b, l + 1);
    r = r && inclusive_or_expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('|' exclusive_or_expression)*
  private static boolean inclusive_or_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inclusive_or_expression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!inclusive_or_expression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "inclusive_or_expression_1", c)) break;
    }
    return true;
  }

  // '|' exclusive_or_expression
  private static boolean inclusive_or_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inclusive_or_expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BIN_OR);
    r = r && exclusive_or_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // decimal_integer_literal | hex_integer_literal | octal_integer_literal
  public static boolean integer_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integer_literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTEGER_LITERAL, "<integer literal>");
    r = decimal_integer_literal(b, l + 1);
    if (!r) r = hex_integer_literal(b, l + 1);
    if (!r) r = octal_integer_literal(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'l' | 'L'
  public static boolean integer_type_suffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integer_type_suffix")) return false;
    if (!nextTokenIs(b, "<integer type suffix>", LONG_BIG_POST, LONG_SMALL_POST)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTEGER_TYPE_SUFFIX, "<integer type suffix>");
    r = consumeToken(b, LONG_SMALL_POST);
    if (!r) r = consumeToken(b, LONG_BIG_POST);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'byte' | 'short' | 'int' | 'long' | 'char'
  public static boolean integral_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integral_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTEGRAL_TYPE, "<integral type>");
    r = consumeToken(b, BYTE);
    if (!r) r = consumeToken(b, SHORT);
    if (!r) r = consumeToken(b, INT);
    if (!r) r = consumeToken(b, LONG);
    if (!r) r = consumeToken(b, CHAR);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // interface_member_declarations?
  public static boolean interface_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_body")) return false;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_BODY, "<interface body>");
    interface_member_declarations(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // interface_modifiers? 'interface' IDENTIFIER extends_interfaces? interface_body
  public static boolean interface_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_DECLARATION, "<interface declaration>");
    r = interface_declaration_0(b, l + 1);
    r = r && consumeTokens(b, 0, INTERFACE, IDENTIFIER);
    r = r && interface_declaration_3(b, l + 1);
    r = r && interface_body(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // interface_modifiers?
  private static boolean interface_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_declaration_0")) return false;
    interface_modifiers(b, l + 1);
    return true;
  }

  // extends_interfaces?
  private static boolean interface_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_declaration_3")) return false;
    extends_interfaces(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // constant_declaration | abstract_method_declaration
  public static boolean interface_member_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_member_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_MEMBER_DECLARATION, "<interface member declaration>");
    r = constant_declaration(b, l + 1);
    if (!r) r = abstract_method_declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // interface_member_declaration*
  public static boolean interface_member_declarations(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_member_declarations")) return false;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_MEMBER_DECLARATIONS, "<interface member declarations>");
    while (true) {
      int c = current_position_(b);
      if (!interface_member_declaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interface_member_declarations", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // 'public' | 'abstract'
  public static boolean interface_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_modifier")) return false;
    if (!nextTokenIs(b, "<interface modifier>", ABSTRACT, PUBLIC)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_MODIFIER, "<interface modifier>");
    r = consumeToken(b, PUBLIC);
    if (!r) r = consumeToken(b, ABSTRACT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // interface_modifier*
  public static boolean interface_modifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_modifiers")) return false;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_MODIFIERS, "<interface modifiers>");
    while (true) {
      int c = current_position_(b);
      if (!interface_modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interface_modifiers", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // type_name
  public static boolean interface_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_type")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_name(b, l + 1);
    exit_section_(b, m, INTERFACE_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // interface_type (',' interface_type)*
  public static boolean interface_type_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_type_list")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = interface_type(b, l + 1);
    r = r && interface_type_list_1(b, l + 1);
    exit_section_(b, m, INTERFACE_TYPE_LIST, r);
    return r;
  }

  // (',' interface_type)*
  private static boolean interface_type_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_type_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!interface_type_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interface_type_list_1", c)) break;
    }
    return true;
  }

  // ',' interface_type
  private static boolean interface_type_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_type_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && interface_type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'implements' interface_type_list
  public static boolean interfaces(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaces")) return false;
    if (!nextTokenIs(b, IMPLEMENTS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IMPLEMENTS);
    r = r && interface_type_list(b, l + 1);
    exit_section_(b, m, INTERFACES, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER ':' statement
  public static boolean labeled_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "labeled_statement")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, COLON);
    r = r && statement(b, l + 1);
    exit_section_(b, m, LABELED_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER ':' statement_no_short_if
  public static boolean labeled_statement_no_short_if(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "labeled_statement_no_short_if")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, COLON);
    r = r && statement_no_short_if(b, l + 1);
    exit_section_(b, m, LABELED_STATEMENT_NO_SHORT_IF, r);
    return r;
  }

  /* ********************************************************** */
  // primary
  public static boolean left_hand_side(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "left_hand_side")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LEFT_HAND_SIDE, "<left hand side>");
    r = primary(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // integer_literal | floating-point_literal | boolean_literal | CHAR_LITERAL | STRING_LITERAL | null_literal
  public static boolean literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL, "<literal>");
    r = integer_literal(b, l + 1);
    if (!r) r = floating_point_literal(b, l + 1);
    if (!r) r = boolean_literal(b, l + 1);
    if (!r) r = consumeToken(b, CHAR_LITERAL);
    if (!r) r = consumeToken(b, STRING_LITERAL);
    if (!r) r = null_literal(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // type variable_declarators
  public static boolean local_variable_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_variable_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOCAL_VARIABLE_DECLARATION, "<local variable declaration>");
    r = type(b, l + 1);
    r = r && variable_declarators(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // local_variable_declaration ';'
  public static boolean local_variable_declaration_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_variable_declaration_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOCAL_VARIABLE_DECLARATION_STATEMENT, "<local variable declaration statement>");
    r = local_variable_declaration(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // block | ';'
  public static boolean method_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_body")) return false;
    if (!nextTokenIs(b, "<method body>", LBRACE, SEMICOLON)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, METHOD_BODY, "<method body>");
    r = block(b, l + 1);
    if (!r) r = consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // method_header method_body
  public static boolean method_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, METHOD_DECLARATION, "<method declaration>");
    r = method_header(b, l + 1);
    r = r && method_body(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER '(' formal_parameter_list? ')'
  public static boolean method_declarator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_declarator")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, LPAREN);
    r = r && method_declarator_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, METHOD_DECLARATOR, r);
    return r;
  }

  // formal_parameter_list?
  private static boolean method_declarator_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_declarator_2")) return false;
    formal_parameter_list(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // method_modifiers? result_type method_declarator throws_list?
  public static boolean method_header(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_header")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, METHOD_HEADER, "<method header>");
    r = method_header_0(b, l + 1);
    r = r && result_type(b, l + 1);
    r = r && method_declarator(b, l + 1);
    r = r && method_header_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // method_modifiers?
  private static boolean method_header_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_header_0")) return false;
    method_modifiers(b, l + 1);
    return true;
  }

  // throws_list?
  private static boolean method_header_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_header_3")) return false;
    throws_list(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (method_name '(' argument_list? ')')
  //     | (primary '.' IDENTIFIER '(' argument_list? ')')
  //     | ('super' '.' IDENTIFIER '(' argument_list? ')')
  public static boolean method_invocation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_invocation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, METHOD_INVOCATION, "<method invocation>");
    r = method_invocation_0(b, l + 1);
    if (!r) r = method_invocation_1(b, l + 1);
    if (!r) r = method_invocation_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // method_name '(' argument_list? ')'
  private static boolean method_invocation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_invocation_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = method_name(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && method_invocation_0_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // argument_list?
  private static boolean method_invocation_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_invocation_0_2")) return false;
    argument_list(b, l + 1);
    return true;
  }

  // primary '.' IDENTIFIER '(' argument_list? ')'
  private static boolean method_invocation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_invocation_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = primary(b, l + 1);
    r = r && consumeTokens(b, 0, DOT, IDENTIFIER, LPAREN);
    r = r && method_invocation_1_4(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // argument_list?
  private static boolean method_invocation_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_invocation_1_4")) return false;
    argument_list(b, l + 1);
    return true;
  }

  // 'super' '.' IDENTIFIER '(' argument_list? ')'
  private static boolean method_invocation_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_invocation_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SUPER, DOT, IDENTIFIER, LPAREN);
    r = r && method_invocation_2_4(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // argument_list?
  private static boolean method_invocation_2_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_invocation_2_4")) return false;
    argument_list(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' | 'synchronized' | 'native'
  public static boolean method_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_modifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, METHOD_MODIFIER, "<method modifier>");
    r = consumeToken(b, PUBLIC);
    if (!r) r = consumeToken(b, PROTECTED);
    if (!r) r = consumeToken(b, PRIVATE);
    if (!r) r = consumeToken(b, STATIC);
    if (!r) r = consumeToken(b, ABSTRACT);
    if (!r) r = consumeToken(b, FINAL);
    if (!r) r = consumeToken(b, SYNCHRONIZED);
    if (!r) r = consumeToken(b, NATIVE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // method_modifier*
  public static boolean method_modifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_modifiers")) return false;
    Marker m = enter_section_(b, l, _NONE_, METHOD_MODIFIERS, "<method modifiers>");
    while (true) {
      int c = current_position_(b);
      if (!method_modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "method_modifiers", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER | ambiguous_name '.' IDENTIFIER
  public static boolean method_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = method_name_1(b, l + 1);
    exit_section_(b, m, METHOD_NAME, r);
    return r;
  }

  // ambiguous_name '.' IDENTIFIER
  private static boolean method_name_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_name_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ambiguous_name(b, l + 1);
    r = r && consumeTokens(b, 0, DOT, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // unary_expression (('*'|'/'|'%') unary_expression)*
  public static boolean multiplicative_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplicative_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MULTIPLICATIVE_EXPRESSION, "<multiplicative expression>");
    r = unary_expression(b, l + 1);
    r = r && multiplicative_expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (('*'|'/'|'%') unary_expression)*
  private static boolean multiplicative_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplicative_expression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!multiplicative_expression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "multiplicative_expression_1", c)) break;
    }
    return true;
  }

  // ('*'|'/'|'%') unary_expression
  private static boolean multiplicative_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplicative_expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = multiplicative_expression_1_0_0(b, l + 1);
    r = r && unary_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '*'|'/'|'%'
  private static boolean multiplicative_expression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplicative_expression_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, MULT);
    if (!r) r = consumeToken(b, DIV);
    if (!r) r = consumeToken(b, MOD);
    return r;
  }

  /* ********************************************************** */
  // 'null'
  public static boolean null_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "null_literal")) return false;
    if (!nextTokenIs(b, NULL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NULL);
    exit_section_(b, m, NULL_LITERAL, r);
    return r;
  }

  /* ********************************************************** */
  // integral_type | floating-point_type
  public static boolean numeric_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "numeric_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NUMERIC_TYPE, "<numeric type>");
    r = integral_type(b, l + 1);
    if (!r) r = floating_point_type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // OCTAL_DIGITS integer_type_suffix?
  public static boolean octal_integer_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "octal_integer_literal")) return false;
    if (!nextTokenIs(b, OCTAL_DIGITS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OCTAL_DIGITS);
    r = r && octal_integer_literal_1(b, l + 1);
    exit_section_(b, m, OCTAL_INTEGER_LITERAL, r);
    return r;
  }

  // integer_type_suffix?
  private static boolean octal_integer_literal_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "octal_integer_literal_1")) return false;
    integer_type_suffix(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'package' package_name ';'
  public static boolean package_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_declaration")) return false;
    if (!nextTokenIs(b, PACKAGE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PACKAGE);
    r = r && package_name(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, PACKAGE_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER ('.' IDENTIFIER)*
  public static boolean package_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && package_name_1(b, l + 1);
    exit_section_(b, m, PACKAGE_NAME, r);
    return r;
  }

  // ('.' IDENTIFIER)*
  private static boolean package_name_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_name_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!package_name_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "package_name_1", c)) break;
    }
    return true;
  }

  // '.' IDENTIFIER
  private static boolean package_name_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_name_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOT, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // primary | expression_name ('++'|'--')?
  public static boolean postfix_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postfix_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, POSTFIX_EXPRESSION, "<postfix expression>");
    r = primary(b, l + 1);
    if (!r) r = postfix_expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // expression_name ('++'|'--')?
  private static boolean postfix_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postfix_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression_name(b, l + 1);
    r = r && postfix_expression_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('++'|'--')?
  private static boolean postfix_expression_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postfix_expression_1_1")) return false;
    postfix_expression_1_1_0(b, l + 1);
    return true;
  }

  // '++'|'--'
  private static boolean postfix_expression_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postfix_expression_1_1_0")) return false;
    boolean r;
    r = consumeToken(b, INC);
    if (!r) r = consumeToken(b, DEC);
    return r;
  }

  /* ********************************************************** */
  // '--' unary_expression
  public static boolean predecrement_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "predecrement_expression")) return false;
    if (!nextTokenIs(b, DEC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DEC);
    r = r && unary_expression(b, l + 1);
    exit_section_(b, m, PREDECREMENT_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // '++' unary_expression
  public static boolean preincrement_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "preincrement_expression")) return false;
    if (!nextTokenIs(b, INC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INC);
    r = r && unary_expression(b, l + 1);
    exit_section_(b, m, PREINCREMENT_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // ( literal
  //     | 'this'
  //     | ('(' expression ')')
  //     | class_instance_creation_expression
  //     | ('super' '.' IDENTIFIER)
  //     | (method_name '(' argument_list? ')')
  //     | ('super' '.' IDENTIFIER '(' argument_list? ')')
  //     | expression_name
  //     | array_creation_expression)
  //     (('[' expression ']') | ('.' IDENTIFIER) | ('.' IDENTIFIER '(' argument_list? ')'))*
  public static boolean primary(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMARY, "<primary>");
    r = primary_0(b, l + 1);
    r = r && primary_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // literal
  //     | 'this'
  //     | ('(' expression ')')
  //     | class_instance_creation_expression
  //     | ('super' '.' IDENTIFIER)
  //     | (method_name '(' argument_list? ')')
  //     | ('super' '.' IDENTIFIER '(' argument_list? ')')
  //     | expression_name
  //     | array_creation_expression
  private static boolean primary_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = literal(b, l + 1);
    if (!r) r = consumeToken(b, THIS);
    if (!r) r = primary_0_2(b, l + 1);
    if (!r) r = class_instance_creation_expression(b, l + 1);
    if (!r) r = primary_0_4(b, l + 1);
    if (!r) r = primary_0_5(b, l + 1);
    if (!r) r = primary_0_6(b, l + 1);
    if (!r) r = expression_name(b, l + 1);
    if (!r) r = array_creation_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' expression ')'
  private static boolean primary_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'super' '.' IDENTIFIER
  private static boolean primary_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_0_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SUPER, DOT, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // method_name '(' argument_list? ')'
  private static boolean primary_0_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_0_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = method_name(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && primary_0_5_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // argument_list?
  private static boolean primary_0_5_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_0_5_2")) return false;
    argument_list(b, l + 1);
    return true;
  }

  // 'super' '.' IDENTIFIER '(' argument_list? ')'
  private static boolean primary_0_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_0_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SUPER, DOT, IDENTIFIER, LPAREN);
    r = r && primary_0_6_4(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // argument_list?
  private static boolean primary_0_6_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_0_6_4")) return false;
    argument_list(b, l + 1);
    return true;
  }

  // (('[' expression ']') | ('.' IDENTIFIER) | ('.' IDENTIFIER '(' argument_list? ')'))*
  private static boolean primary_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!primary_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "primary_1", c)) break;
    }
    return true;
  }

  // ('[' expression ']') | ('.' IDENTIFIER) | ('.' IDENTIFIER '(' argument_list? ')')
  private static boolean primary_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = primary_1_0_0(b, l + 1);
    if (!r) r = primary_1_0_1(b, l + 1);
    if (!r) r = primary_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '[' expression ']'
  private static boolean primary_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACK);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RBRACK);
    exit_section_(b, m, null, r);
    return r;
  }

  // '.' IDENTIFIER
  private static boolean primary_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOT, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // '.' IDENTIFIER '(' argument_list? ')'
  private static boolean primary_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_1_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOT, IDENTIFIER, LPAREN);
    r = r && primary_1_0_2_3(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // argument_list?
  private static boolean primary_1_0_2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_1_0_2_3")) return false;
    argument_list(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // numeric_type | 'bool'
  public static boolean primitive_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primitive_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMITIVE_TYPE, "<primitive type>");
    r = numeric_type(b, l + 1);
    if (!r) r = consumeToken(b, BOOL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // class_or_interface_type
  public static boolean reference_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "reference_type")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_or_interface_type(b, l + 1);
    exit_section_(b, m, REFERENCE_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // shift_expression ((('<'|'>'|'<='|'>=') shift_expression) | ('instanceof' reference_type))*
  public static boolean relational_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relational_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RELATIONAL_EXPRESSION, "<relational expression>");
    r = shift_expression(b, l + 1);
    r = r && relational_expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ((('<'|'>'|'<='|'>=') shift_expression) | ('instanceof' reference_type))*
  private static boolean relational_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relational_expression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!relational_expression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "relational_expression_1", c)) break;
    }
    return true;
  }

  // (('<'|'>'|'<='|'>=') shift_expression) | ('instanceof' reference_type)
  private static boolean relational_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relational_expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = relational_expression_1_0_0(b, l + 1);
    if (!r) r = relational_expression_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('<'|'>'|'<='|'>=') shift_expression
  private static boolean relational_expression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relational_expression_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = relational_expression_1_0_0_0(b, l + 1);
    r = r && shift_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '<'|'>'|'<='|'>='
  private static boolean relational_expression_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relational_expression_1_0_0_0")) return false;
    boolean r;
    r = consumeToken(b, LT);
    if (!r) r = consumeToken(b, GT);
    if (!r) r = consumeToken(b, LE);
    if (!r) r = consumeToken(b, GE);
    return r;
  }

  // 'instanceof' reference_type
  private static boolean relational_expression_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relational_expression_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INSTANCEOF);
    r = r && reference_type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // type | 'void'
  public static boolean result_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "result_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RESULT_TYPE, "<result type>");
    r = type(b, l + 1);
    if (!r) r = consumeToken(b, VOID);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'return' expression? ';'
  public static boolean return_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_statement")) return false;
    if (!nextTokenIs(b, RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RETURN);
    r = r && return_statement_1(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, RETURN_STATEMENT, r);
    return r;
  }

  // expression?
  private static boolean return_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_statement_1")) return false;
    expression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // package_declaration? import_declarations? type_declarations?
  static boolean root(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = root_0(b, l + 1);
    r = r && root_1(b, l + 1);
    r = r && root_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // package_declaration?
  private static boolean root_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_0")) return false;
    package_declaration(b, l + 1);
    return true;
  }

  // import_declarations?
  private static boolean root_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_1")) return false;
    import_declarations(b, l + 1);
    return true;
  }

  // type_declarations?
  private static boolean root_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_2")) return false;
    type_declarations(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // additive_expression (('<<'|'>>'|'>>>') additive_expression)*
  public static boolean shift_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shift_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SHIFT_EXPRESSION, "<shift expression>");
    r = additive_expression(b, l + 1);
    r = r && shift_expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (('<<'|'>>'|'>>>') additive_expression)*
  private static boolean shift_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shift_expression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!shift_expression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "shift_expression_1", c)) break;
    }
    return true;
  }

  // ('<<'|'>>'|'>>>') additive_expression
  private static boolean shift_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shift_expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = shift_expression_1_0_0(b, l + 1);
    r = r && additive_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '<<'|'>>'|'>>>'
  private static boolean shift_expression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shift_expression_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, LSHIFT);
    if (!r) r = consumeToken(b, RSHIFT);
    if (!r) r = consumeToken(b, URSHIFT);
    return r;
  }

  /* ********************************************************** */
  // '+' | '-'
  public static boolean sign(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sign")) return false;
    if (!nextTokenIs(b, "<sign>", ADD, MINUS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIGN, "<sign>");
    r = consumeToken(b, ADD);
    if (!r) r = consumeToken(b, MINUS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // sign? DIGITS
  public static boolean signed_integer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signed_integer")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIGNED_INTEGER, "<signed integer>");
    r = signed_integer_0(b, l + 1);
    r = r && consumeToken(b, DIGITS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // sign?
  private static boolean signed_integer_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signed_integer_0")) return false;
    sign(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean simple_type_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_type_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, SIMPLE_TYPE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // 'import' type_name ';'
  public static boolean single_type_import_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_type_import_declaration")) return false;
    if (!nextTokenIs(b, IMPORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IMPORT);
    r = r && type_name(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, SINGLE_TYPE_IMPORT_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // statement_without_trailing_substatement | labeled_statement | if_then_statement | if_then_else_statement | while_statement | for_statement
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = statement_without_trailing_substatement(b, l + 1);
    if (!r) r = labeled_statement(b, l + 1);
    if (!r) r = if_then_statement(b, l + 1);
    if (!r) r = if_then_else_statement(b, l + 1);
    if (!r) r = while_statement(b, l + 1);
    if (!r) r = for_statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // assignment | postfix_expression | preincrement_expression | predecrement_expression | method_invocation | class_instance_creation_expression
  public static boolean statement_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT_EXPRESSION, "<statement expression>");
    r = assignment(b, l + 1);
    if (!r) r = postfix_expression(b, l + 1);
    if (!r) r = preincrement_expression(b, l + 1);
    if (!r) r = predecrement_expression(b, l + 1);
    if (!r) r = method_invocation(b, l + 1);
    if (!r) r = class_instance_creation_expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // statement_expression (',' statement_expression)*
  public static boolean statement_expression_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_expression_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT_EXPRESSION_LIST, "<statement expression list>");
    r = statement_expression(b, l + 1);
    r = r && statement_expression_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' statement_expression)*
  private static boolean statement_expression_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_expression_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement_expression_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "statement_expression_list_1", c)) break;
    }
    return true;
  }

  // ',' statement_expression
  private static boolean statement_expression_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_expression_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && statement_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // statement_without_trailing_substatement | labeled_statement_no_short_if | if_then_else_statement_no_short_if | while_statement_no_short_if | for_statement_no_short_if
  public static boolean statement_no_short_if(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_no_short_if")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT_NO_SHORT_IF, "<statement no short if>");
    r = statement_without_trailing_substatement(b, l + 1);
    if (!r) r = labeled_statement_no_short_if(b, l + 1);
    if (!r) r = if_then_else_statement_no_short_if(b, l + 1);
    if (!r) r = while_statement_no_short_if(b, l + 1);
    if (!r) r = for_statement_no_short_if(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // block | expression_statement | switch_statement | do_statement | break_statement | continue_statement | return_statement | synchronized_statement | throws_statement | try_statement
  public static boolean statement_without_trailing_substatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_without_trailing_substatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT_WITHOUT_TRAILING_SUBSTATEMENT, "<statement without trailing substatement>");
    r = block(b, l + 1);
    if (!r) r = expression_statement(b, l + 1);
    if (!r) r = switch_statement(b, l + 1);
    if (!r) r = do_statement(b, l + 1);
    if (!r) r = break_statement(b, l + 1);
    if (!r) r = continue_statement(b, l + 1);
    if (!r) r = return_statement(b, l + 1);
    if (!r) r = synchronized_statement(b, l + 1);
    if (!r) r = throws_statement(b, l + 1);
    if (!r) r = try_statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'static' block
  public static boolean static_initializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_initializer")) return false;
    if (!nextTokenIs(b, STATIC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STATIC);
    r = r && block(b, l + 1);
    exit_section_(b, m, STATIC_INITIALIZER, r);
    return r;
  }

  /* ********************************************************** */
  // '{' switch_block_statement_groups? switch_labels? '}'
  public static boolean switch_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_block")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && switch_block_1(b, l + 1);
    r = r && switch_block_2(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, SWITCH_BLOCK, r);
    return r;
  }

  // switch_block_statement_groups?
  private static boolean switch_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_block_1")) return false;
    switch_block_statement_groups(b, l + 1);
    return true;
  }

  // switch_labels?
  private static boolean switch_block_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_block_2")) return false;
    switch_labels(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // switch_labels block_statements
  public static boolean switch_block_statement_group(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_block_statement_group")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SWITCH_BLOCK_STATEMENT_GROUP, "<switch block statement group>");
    r = switch_labels(b, l + 1);
    r = r && block_statements(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // switch_block_statement_group*
  public static boolean switch_block_statement_groups(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_block_statement_groups")) return false;
    Marker m = enter_section_(b, l, _NONE_, SWITCH_BLOCK_STATEMENT_GROUPS, "<switch block statement groups>");
    while (true) {
      int c = current_position_(b);
      if (!switch_block_statement_group(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "switch_block_statement_groups", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // 'case' constant_expression ':' | 'default' ':'
  public static boolean switch_label(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_label")) return false;
    if (!nextTokenIs(b, "<switch label>", CASE, DEFAULT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SWITCH_LABEL, "<switch label>");
    r = switch_label_0(b, l + 1);
    if (!r) r = parseTokens(b, 0, DEFAULT, COLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'case' constant_expression ':'
  private static boolean switch_label_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_label_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CASE);
    r = r && constant_expression(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // switch_label*
  public static boolean switch_labels(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_labels")) return false;
    Marker m = enter_section_(b, l, _NONE_, SWITCH_LABELS, "<switch labels>");
    while (true) {
      int c = current_position_(b);
      if (!switch_label(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "switch_labels", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // 'switch' '(' expression ')' switch_block
  public static boolean switch_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_statement")) return false;
    if (!nextTokenIs(b, SWITCH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SWITCH, LPAREN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && switch_block(b, l + 1);
    exit_section_(b, m, SWITCH_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // 'synchronized' '(' expression ')' block
  public static boolean synchronized_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "synchronized_statement")) return false;
    if (!nextTokenIs(b, SYNCHRONIZED)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SYNCHRONIZED, LPAREN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && block(b, l + 1);
    exit_section_(b, m, SYNCHRONIZED_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // 'throws' class_type_list
  public static boolean throws_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "throws_list")) return false;
    if (!nextTokenIs(b, THROWS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, THROWS);
    r = r && class_type_list(b, l + 1);
    exit_section_(b, m, THROWS_LIST, r);
    return r;
  }

  /* ********************************************************** */
  // 'throw' expression ';'
  public static boolean throws_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "throws_statement")) return false;
    if (!nextTokenIs(b, THROW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, THROW);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, THROWS_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // 'try' block catches | 'try' block catches? finally_block
  public static boolean try_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_statement")) return false;
    if (!nextTokenIs(b, TRY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = try_statement_0(b, l + 1);
    if (!r) r = try_statement_1(b, l + 1);
    exit_section_(b, m, TRY_STATEMENT, r);
    return r;
  }

  // 'try' block catches
  private static boolean try_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_statement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TRY);
    r = r && block(b, l + 1);
    r = r && catches(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'try' block catches? finally_block
  private static boolean try_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TRY);
    r = r && block(b, l + 1);
    r = r && try_statement_1_2(b, l + 1);
    r = r && finally_block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // catches?
  private static boolean try_statement_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_statement_1_2")) return false;
    catches(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // primitive_type | reference_type ('[' ']')*
  public static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE, "<type>");
    r = primitive_type(b, l + 1);
    if (!r) r = type_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // reference_type ('[' ']')*
  private static boolean type_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = reference_type(b, l + 1);
    r = r && type_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('[' ']')*
  private static boolean type_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!type_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_1_1", c)) break;
    }
    return true;
  }

  // '[' ']'
  private static boolean type_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LBRACK, RBRACK);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // class_declaration | interface_declaration | ';'
  public static boolean type_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_DECLARATION, "<type declaration>");
    r = class_declaration(b, l + 1);
    if (!r) r = interface_declaration(b, l + 1);
    if (!r) r = consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // type_declaration*
  public static boolean type_declarations(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_declarations")) return false;
    Marker m = enter_section_(b, l, _NONE_, TYPE_DECLARATIONS, "<type declarations>");
    while (true) {
      int c = current_position_(b);
      if (!type_declaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_declarations", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // 'import' package_name '.' '*' ';'
  public static boolean type_import_on_demand_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_import_on_demand_declaration")) return false;
    if (!nextTokenIs(b, IMPORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IMPORT);
    r = r && package_name(b, l + 1);
    r = r && consumeTokens(b, 0, DOT, MULT, SEMICOLON);
    exit_section_(b, m, TYPE_IMPORT_ON_DEMAND_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER ('.' IDENTIFIER)*
  public static boolean type_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && type_name_1(b, l + 1);
    exit_section_(b, m, TYPE_NAME, r);
    return r;
  }

  // ('.' IDENTIFIER)*
  private static boolean type_name_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_name_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!type_name_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_name_1", c)) break;
    }
    return true;
  }

  // '.' IDENTIFIER
  private static boolean type_name_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_name_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOT, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // preincrement_expression | predecrement_expression | ('+' unary_expression) | ('-' unary_expression) | unary_expression_not_plus_minus
  public static boolean unary_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNARY_EXPRESSION, "<unary expression>");
    r = preincrement_expression(b, l + 1);
    if (!r) r = predecrement_expression(b, l + 1);
    if (!r) r = unary_expression_2(b, l + 1);
    if (!r) r = unary_expression_3(b, l + 1);
    if (!r) r = unary_expression_not_plus_minus(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '+' unary_expression
  private static boolean unary_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_expression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ADD);
    r = r && unary_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '-' unary_expression
  private static boolean unary_expression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_expression_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MINUS);
    r = r && unary_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // postfix_expression | '~' unary_expression | '!' unary_expression | cast_expression
  public static boolean unary_expression_not_plus_minus(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_expression_not_plus_minus")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNARY_EXPRESSION_NOT_PLUS_MINUS, "<unary expression not plus minus>");
    r = postfix_expression(b, l + 1);
    if (!r) r = unary_expression_not_plus_minus_1(b, l + 1);
    if (!r) r = unary_expression_not_plus_minus_2(b, l + 1);
    if (!r) r = cast_expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '~' unary_expression
  private static boolean unary_expression_not_plus_minus_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_expression_not_plus_minus_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BIN_NOT);
    r = r && unary_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '!' unary_expression
  private static boolean unary_expression_not_plus_minus_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_expression_not_plus_minus_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NOT);
    r = r && unary_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // variable_declarator_id | (variable_declarator_id '=' variable_initializer)
  public static boolean variable_declarator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declarator")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variable_declarator_id(b, l + 1);
    if (!r) r = variable_declarator_1(b, l + 1);
    exit_section_(b, m, VARIABLE_DECLARATOR, r);
    return r;
  }

  // variable_declarator_id '=' variable_initializer
  private static boolean variable_declarator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declarator_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variable_declarator_id(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && variable_initializer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER ('[' ']')*
  public static boolean variable_declarator_id(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declarator_id")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && variable_declarator_id_1(b, l + 1);
    exit_section_(b, m, VARIABLE_DECLARATOR_ID, r);
    return r;
  }

  // ('[' ']')*
  private static boolean variable_declarator_id_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declarator_id_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!variable_declarator_id_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "variable_declarator_id_1", c)) break;
    }
    return true;
  }

  // '[' ']'
  private static boolean variable_declarator_id_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declarator_id_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LBRACK, RBRACK);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // variable_declarator (',' variable_declarator)*
  public static boolean variable_declarators(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declarators")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variable_declarator(b, l + 1);
    r = r && variable_declarators_1(b, l + 1);
    exit_section_(b, m, VARIABLE_DECLARATORS, r);
    return r;
  }

  // (',' variable_declarator)*
  private static boolean variable_declarators_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declarators_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!variable_declarators_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "variable_declarators_1", c)) break;
    }
    return true;
  }

  // ',' variable_declarator
  private static boolean variable_declarators_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declarators_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && variable_declarator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expression | array_initializer
  public static boolean variable_initializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_initializer")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_INITIALIZER, "<variable initializer>");
    r = expression(b, l + 1);
    if (!r) r = array_initializer(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // variable_initializer (',' variable_initializer)*
  public static boolean variable_initializers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_initializers")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_INITIALIZERS, "<variable initializers>");
    r = variable_initializer(b, l + 1);
    r = r && variable_initializers_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' variable_initializer)*
  private static boolean variable_initializers_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_initializers_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!variable_initializers_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "variable_initializers_1", c)) break;
    }
    return true;
  }

  // ',' variable_initializer
  private static boolean variable_initializers_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_initializers_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && variable_initializer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'while' ( expression ) statement
  public static boolean while_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_statement")) return false;
    if (!nextTokenIs(b, WHILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHILE);
    r = r && while_statement_1(b, l + 1);
    r = r && statement(b, l + 1);
    exit_section_(b, m, WHILE_STATEMENT, r);
    return r;
  }

  // ( expression )
  private static boolean while_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'while' ( expression ) statement_no_short_if
  public static boolean while_statement_no_short_if(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_statement_no_short_if")) return false;
    if (!nextTokenIs(b, WHILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHILE);
    r = r && while_statement_no_short_if_1(b, l + 1);
    r = r && statement_no_short_if(b, l + 1);
    exit_section_(b, m, WHILE_STATEMENT_NO_SHORT_IF, r);
    return r;
  }

  // ( expression )
  private static boolean while_statement_no_short_if_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_statement_no_short_if_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

}
