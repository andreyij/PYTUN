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
import java.util.ArrayList;
import org.pytun.common.ColumnType;
}

query returns [Query n]
  @init{ 
    $n = null; 
  }   
  :
  sql_statement SEMI! {$n = $sql_statement.n;}
  ;

sql_statement returns [Query n]
@init{
  $n = null;
}
  :
  select_statement    {$n = $select_statement.n;}
  | update_statement  {$n = $update_statement.n;}
  | insert_statement  {$n = $insert_statement.n;}
  | delete_statement  {$n = $delete_statement.n;}
  | create_statement  {$n = $create_statement.n;}
  | drop_statement    {$n = $drop_statement.n;}
  | alter_statement   {$n = $alter_statement.n;}
  ;

select_statement returns [Query n]
@init{
  SelectQuery sq = new SelectQuery($start);
}
  :^(SELECT_STMT e = expression_list tl=table_spec_list w = where_clause?)
  {
    sq.setSelectList($e.list);
    sq.setFrom($tl.list);
    sq.setWhere($w.n);
    $n = (Query)sq;
  }
  ;

update_statement returns [Query n]
  : ^(UPDATE_STMT i=identifier al=assignment_list w=where_clause?)
  {
    UpdateQuery uq = new UpdateQuery($start);
    uq.setUpdateList($al.list);
    uq.setTable($i.n);
    uq.setWhere($w.n);
    $n = (Query)uq;
  }
  ;


insert_statement returns [Query n]
@init{
	InsertQuery i = new InsertQuery($start);
}
  :
    ^(INSERT_STMT identifier il=identifier_list vl=expression_list)
    {
    	i.setInto($identifier.n);
    	i.setColumns($il.list);
    	i.setValues($vl.list);
    	$n = i;
    }
  ;

delete_statement returns [Query n]
  :
  ^(DELETE_STMT identifier where_clause?)
  ;

create_statement returns [Query n]
@init{
  CreateQuery q = new CreateQuery($start);
}
  :
  ^(CREATE_STMT name=identifier columns=table_columns_def)
	  {
	    q.setTableName($name.n);
	    q.setColumns($columns.list);
	    $n =(Query)q;
	  }
  ;

drop_statement returns [Query n]
@init{
  DropQuery q = new DropQuery($start);
}
  :
    ^(DROP_STMT identifier)
    {
      q.setTable($identifier.n);
      $n = q;
    }
  ;

alter_statement returns [Query n]
  :
  ALTER
  ;

expression_list returns [List<Node> list] 
@init{
  $list = new ArrayList<Node>();
}
  : ^(EXPR_LIST (expr{$list.add($expr.n);})+);

table_spec_list returns [List<Node> list]
@init{
  $list = new ArrayList<Node>();
}
  : (t=table_spec {$list.add($t.n);})+
  ;

/*table_spec returns [Node n]
  : t=identifier{$n = $t.n;}
    (p=identifier{((Identifier)$n).setPseudonym(((Identifier)$p.n).getName());})?
  ; */

table_spec returns [Node n]
  : ^(i1=identifier i2=identifier)
    {
      Identifier i = (Identifier)$i1.n;
      String pseudonym = ((Identifier)$i2.n).getName();
      i.setPseudonym(pseudonym);
      $n = i; 
    }
  | id=identifier
    {
      $n = $id.n;
    }
  ;

identifier_list returns [List<Node> list]
@init{
  $list = new ArrayList();
} 
  :(i = identifier {$list.add($i.n);})+
  ;


where_clause returns [Condition n]
  :   ^(WHERE c=condition) {$n = $c.n;}
  ;
condition returns [Condition n]
  : ^(OR l=condition r=condition) 
    {
      OrCondition obj = new OrCondition($start);
      obj.setLeft($l.n);
      obj.setRight($r.n);
      $n = (Condition)obj;
    }
  | ^(AND l=condition r=condition)
    {
      AndCondition obj = new AndCondition($start);
      obj.setLeft($l.n);
      obj.setRight($r.n);
      $n = (Condition)obj;
    }
  | p = predicate {$n = (Condition)$p.n; }
  ;

predicate returns [Predicate n]
@init{
  $n = new Predicate($start);
}
  : ^(EQ l=expr r=expr) 
    {
      $n.setOperator(BooleanOperator.Equals); 
      $n.setLeft($l.n);
      $n.setRight($r.n);
    }
  | ^(LT expr expr)
    {
      $n.setOperator(BooleanOperator.LessThan); 
      $n.setLeft($l.n);
      $n.setRight($r.n);
    }
  | ^(GT expr expr)
    {
      $n.setOperator(BooleanOperator.GreaterThan); 
      $n.setLeft($l.n);
      $n.setRight($r.n);
    }
  | ^(GE expr expr)
    {
      $n.setOperator(BooleanOperator.GreaterThanEquals); 
      $n.setLeft($l.n);
      $n.setRight($r.n);
    }
  | ^(LE expr expr)
    {
      $n.setOperator(BooleanOperator.LessThanEquals); 
      $n.setLeft($l.n);
      $n.setRight($r.n);
    }
  | ^(NE expr expr)
    {
      $n.setOperator(BooleanOperator.NotEquals); 
      $n.setLeft($l.n);
      $n.setRight($r.n);
    }
  ;



expr returns [Node n]
@init{
$n = null;
Node i = null;
}
  : ^(STAR_TERM (identifier{i = $identifier.n;})?)
    {
      StarIdentifier si = new StarIdentifier($start);
      if (i != null) {
        si.setTableAlias(((Identifier)i).getName());
      }
      $n = si;
    }
  | ^(PLUS l=expr r=expr) {Plus obj = new Plus($start, $l.n, $r.n); $n = (Node) obj;}
  | ^(MINUS l=expr r=expr){Minus obj = new Minus($start, $l.n, $r.n); $n = (Node) obj;}
  | ^(MUL l=expr r=expr){Multiply obj = new Multiply($start, $l.n, $r.n); $n = (Node) obj;}
  | ^(DIV l=expr r=expr){Divide obj = new Divide($start, $l.n, $r.n); $n = (Node) obj;}
  | ^(MOD l=expr r=expr){Modulo obj = new Modulo($start, $l.n, $r.n); $n = (Node) obj;}
  | term {$n = (Node)$term.n;}
  ;

term returns [Node n]
  : c=column_identifier {$n = $c.n;}
  | value {$n = $value.n;}
  ;

column_identifier returns [Node n]
  : ^(i1=identifier i2=identifier)
    {
      Identifier i = (Identifier)$i2.n;
      i.setTableAlias(((Identifier)$i1.n).getName());
      $n = i;
    }
  | id=identifier
    {
      $n = $id.n;
    }
  ;

value returns [Value n]
  :
  number_value  {$n = $number_value.n;}
  | string_value {$n = $string_value.n;}
  | date_value {$n = $date_value.n;}
  | time_value {$n = $time_value.n;}
  | timestamp_value{$n = $timestamp_value.n;}
  ;


number_value returns [Value n]
  :
  REAL_LIT {$n = NumberFactory.getNumberValue($start, $REAL_LIT.text);}
  ;

string_value returns [Value n]
  :
  STRING_LIT 
    {
      StringValue s = new StringValue($start);
      s.setValue($STRING_LIT.text);
      $n = (Value)s;
    }
  ;

date_value returns [Value n]
  :
  DATE string_value {$n = $string_value.n;}
  ;

time_value returns [Value n]
  :
  TIME string_value {$n = $string_value.n;}
  ;

timestamp_value returns [Value n]
  :
  TIMESTAMP string_value {$n = $string_value.n;}
  ;

identifier returns [Identifier n]
@init{
  $n = new Identifier ($start);
}
  : IDENTIFIER
	  {
	    $n.setName($IDENTIFIER.text);
	  }
  ;

assignment_list returns [List<Node> list]
  :^(UPDATE_ASSIGNMENTS (assignment{$list.add($assignment.n);})+)
  ;

assignment returns [Node n]
  : ^(EQ identifier expr)
  ;

table_columns_def returns [List<Node> list]
@init{
  $list = new ArrayList<Node>();
}
  :
  ^(COLUMN_DEF_LIST (table_column_def{$list.add($table_column_def.n);})+)
  ;

table_column_def returns [Node n]
@init{
 ColumnSpecification c = new ColumnSpecification($start);
}
  : i=identifier t=type_specifier
    {
      c.setName($i.n);
      c.setType($t.d);
      $n = c;
    }
  ;

type_specifier returns [DataType d]
@init{
  $d = new DataType($start);
}
  : INT {$d.setColumnType(ColumnType.INTEGER);}
  | FLOAT {$d.setColumnType(ColumnType.DOUBLE);}
  | CHAR LPAREN p=number_value RPAREN
    {
      $d.setColumnType(ColumnType.STRING);
      if (!($p.n instanceof IntegerValue)){
        throw new org.antlr.runtime.RecognitionException();
      }
      IntegerValue v = (IntegerValue)$p.n;
      $d.setPrecision(v.getValue());
    }
  | VARCHAR LPAREN p=number_value RPAREN
    {
      $d.setColumnType(ColumnType.STRING);
      if (!($p.n instanceof IntegerValue)){
        throw new org.antlr.runtime.RecognitionException();
      }
      IntegerValue v = (IntegerValue)$p.n;
      $d.setPrecision(v.getValue());
    }
  | DATE
    {$d.setColumnType(ColumnType.DATE);}
  | TIME
    {$d.setColumnType(ColumnType.TIME);}
  | TIMESTAMP
    {$d.setColumnType(ColumnType.TIMESTAMP);}
  ;



