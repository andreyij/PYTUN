grammar SQLGrammar;

options {
  backtrack    = true;
  k            = 2;
  language     = Java;
  output       = AST;
  ASTLabelType = CommonTree;
}

tokens {
  /* arithmetic operators */
  PLUS  = '+';
  MINUS = '-';
  MUL   = '*';
  DIV   = '/';
  MOD   = '%';
  /* relational operators */
  EQ    = '=';
  LT    = '<';
  GT    = '>';
  GE    = '>=';
  LE    = '<=';
  NE    = '!=';

  /* misc */
  SEMI  = ';';
  LPAREN = '(';
  RPAREN = ')';

  /* imaginary tokens */
  SELECT_STMT;
  UPDATE_STMT;
  DELETE_STMT;
  INSERT_STMT;
  CREATE_STMT;
  DROP_STMT;
  
  UPDATE_ASSIGNMENTS;
  
  TABLE_LIST;
  EXPR_LIST;
  STAR_TERM;
  COLUMN_DEF_LIST;
}

@parser::header {
package org.pytun.sql;
}

@lexer::header {
package org.pytun.sql;
}

query
  :
  sql_statement SEMI
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
  SELECT expression_list FROM table_spec_list (where_clause)?
    ->
      ^(SELECT_STMT expression_list table_spec_list where_clause?)
  ;

update_statement
  :
  UPDATE identifier SET assignment_list where_clause?
    ->
      ^(UPDATE_STMT identifier assignment_list where_clause?)
  ;

insert_statement
  :
  INSERT INTO identifier LPAREN identifier_list RPAREN VALUES LPAREN expression_list RPAREN
   ->
    ^(INSERT_STMT  identifier identifier_list expression_list)
  ;

delete_statement
  :
  DELETE FROM identifier where_clause
    -> ^(DELETE_STMT identifier where_clause?)
  ;

create_statement
  :
  CREATE TABLE identifier LPAREN table_columns_def RPAREN
    ->
    ^(CREATE_STMT identifier table_columns_def)
  ;

drop_statement
  :
  DROP TABLE identifier
    ->
    ^(DROP_STMT identifier)
  ;

alter_statement
  :
  ALTER
  ;

table_columns_def
  : table_column_def (',' table_column_def)*
    -> ^(COLUMN_DEF_LIST table_column_def+)
  ;
 
table_column_def
  : identifier type_specifier
  ;

type_specifier
  : INT
  | FLOAT
  | CHAR LPAREN number_value RPAREN
  | VARCHAR LPAREN number_value RPAREN
  | DATE
  | TIME
  | TIMESTAMP
  ;

expression_list
  :
  expr (',' expr)*
    ->
      ^(EXPR_LIST expr+)
  ;

table_spec_list
  : table_spec (',' table_spec)*
    -> table_spec+
  ;

table_spec
  : identifier AS? identifier
    -> ^(identifier identifier)
  | identifier
  ;

identifier_list
  :
  identifier (','! identifier)*
  ;

where_clause
  :
  WHERE disjunction
    ->
      ^(WHERE disjunction)
  ;

disjunction
  :
  conjunction (OR^ disjunction)*
  ;

conjunction
  :
  predicate (AND^ conjunction)*
  ;

predicate
  :
  expr (EQ^ | LT^ | GT^ | GE^ | LE^ | NE^ ) expr
  ;

expr
  : (identifier '.')? '*'
    -> ^(STAR_TERM identifier?)
  | simpleExpression ((PLUS^ | MINUS^) simpleExpression)*
  ;

simpleExpression
  :
  term ((MUL^ | DIV^ | MOD^) term)*
  ;

term
  : column_identifier
  | value
  ;

column_identifier  
  : identifier '.' identifier
    -> ^(identifier identifier)
  | identifier
  ;

value
  :
  number_value
  | string_value
  | date_value
  | time_value
  | timestamp_value
  ;


number_value
  :
  REAL_LIT
  ;

string_value
  :
  STRING_LIT
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

assignment_list
  : assignment (',' assignment)* -> ^(UPDATE_ASSIGNMENTS assignment+)
  ;

assignment
  : identifier EQ expr -> ^(EQ identifier expr)
  ;


/* statement keywords (case insensitive).*/
/* boolean operators */
AND : ('A'|'a')('N'|'n')('D'|'d') ;
OR : ('O'|'o')('R'|'r');

/* type specifiers */
DATE : ('D'|'d')('A'|'a')('T'|'t')('E'|'e');
TIME : ('T'|'t')('I'|'i')('M'|'m')('E'|'e');
TIMESTAMP : ('T'|'t')('I'|'i')('M'|'m')('E'|'e')('S'|'s')('T'|'t')('A'|'a')('M'|'m')('P'|'p');
INT : ('I'|'i')('N'|'n')('T'|'t');
FLOAT : ('F'|'f')('L'|'l')('O'|'o')('A'|'a')('T'|'t');
VARCHAR : ('V'|'v')('A'|'a')('R'|'r')('C'|'c')('H'|'h')('A'|'a')('R'|'r');
CHAR : ('C'|'c')('H'|'h')('A'|'a')('R'|'r');

/* statement */
SELECT : ('S'|'s')('E'|'e')('L'|'l')('E'|'e')('C'|'c')('T'|'t');
UPDATE : ('U'|'u')('P'|'p')('D'|'d')('A'|'a')('T'|'t')('E'|'e');
DELETE : ('D'|'d')('E'|'e')('L'|'l')('E'|'e')('T'|'t')('E'|'e');
INSERT : ('I'|'i')('N'|'n')('S'|'s')('E'|'e')('R'|'r')('T'|'t');
CREATE :('C'|'c')('R'|'r')('E'|'e')('A'|'a')('T'|'t')('E'|'e');
DROP :('D'|'d')('R'|'r')('O'|'o')('P'|'p');
ALTER :('A'|'a')('L'|'l')('T'|'t')('E'|'e')('R'|'r');

/* statement keyworkds */
FROM : ('F'|'f')('R'|'r')('O'|'o')('M'|'m');
WHERE : ('W'|'w')('H'|'h')('E'|'e')('R'|'r')('E'|'e');
SET : ('S'|'s')('E'|'e')('T'|'t');
INTO: ('I'|'i')('N'|'n')('T'|'t')('O'|'o');
VALUES: ('V'|'v')('A'|'a')('L'|'l')('U'|'u')('E'|'e')('S'|'s');
TABLE: ('T'|'t')('A'|'a')('B'|'b')('L'|'l')('E'|'e');
AS: ('A'|'a')('S'|'s');

/* general tokens */
fragment
LETTER : ('a'..'z' | 'A'..'Z') ;

fragment
DIGIT : '0'..'9'  ;

STRING_LIT : '\'' (~'\'')* '\'' ;

REAL_LIT : (DIGIT)+ ('.' (DIGIT)+)?;

IDENTIFIER : (LETTER) (LETTER | DIGIT | '_')*;

NEWLINE
  : '\r'? '\n' {$channel = HIDDEN;}
  ;

WHITESPACE
  : (' ' | '\t')+ {$channel = HIDDEN;}
  ;
