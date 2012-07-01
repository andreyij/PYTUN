tree grammar SQLTree;

options {
  k            = 2;
  tokenVocab   = SQLGrammar;
  ASTLabelType = CommonTree;
  output       = AST;
}

@header {
package org.pytun.sql;
import java.util.List;
import java.util.LinkedList;
}

query returns [Query q]
@init {
$q = new Query($start);
}
  :
  statement SEMI
  ;

statement
  :
  sql_statement
  ;

sql_statement
  :
  select_statement
  | update_statement
  | insert_statement
  | delete_statement
  | create_statement
  | drop_statement
  | alter_statement
  ;

select_statement
  :
  ^(SELECT_STMT select_list table_list optional_clause)
  ;

select_list
  :
  ^(EXPR_LIST expr+)
  ;

table_list
  :
  ^(TABLE_LIST identifier+)
  ;

optional_clause
  :
  ^(PREDICATE_LIST condition_list)
  ;

condition_list
  :
  //condition (boolean_operator condition)*
  orExpr
  ;

condition
  :
  ^(relational_operator expr expr)
  ;

orExpr
  :
  andExpr
  (
    OR^ andExpr
  )*
  ;

andExpr
  :
  condition
  (
    AND^ condition
  )*
  ;

expr
  :
  term
  (
    arithmetic_operator term
  )*
  ;

term
  :
  identifier
  | value
  ;

value
  :
  int_value
  | float_value
  | string_value
  | date_value
  | time_value
  | timestamp_value
  ;

int_value returns [int value]
  :
  INTEGER_LIT 
              {
               $value = Integer.parseInt($INTEGER_LIT.text);
              }
  ;

float_value returns [double value]
  :
  REAL_LIT 
           {
            $value = Double.parseDouble($REAL_LIT.text);
           }
  ;

string_value returns [String value]
  :
  STRING_LIT
                 {
                  $value = $STRING_LIT.text;
                 }
  ;

date_value
  :
  DATE string_value
  ;

time_value
  :
  TIME string_value
  ;

timestamp_value
  :
  TIMESTAMP string_value
  ;

identifier
  :
  IDENTIFIER
  ;

update_statement
  :
  UPDATE
  ;

insert_statement
  :
  DELETE
  ;

delete_statement
  :
  INSERT
  ;

create_statement
  :
  CREATE
  ;

drop_statement
  :
  DROP
  ;

alter_statement
  :
  ALTER
  ;

arithmetic_operator
  :
  PLUS
  | MINUS
  | MUL
  | DIV
  | MOD
  ;

relational_operator
  :
  EQ
  | LT
  | GT
  | GE
  | LE
  | NE
  ;

boolean_operator
  :
  AND^
  | OR^
  ;
