package org.pytun.sql;

import org.antlr.runtime.tree.CommonTree;
import org.pytun.common.ColumnType;
import org.pytun.sql.visitors.Visitor;

public class Predicate extends Condition {
	private BooleanOperator op;

	public Predicate(CommonTree t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	public BooleanOperator getOperator() {
		return op;
	}

	public void setOperator(BooleanOperator op) {
		this.op = op;
	}

	@Override
	public void print(int indent) {
		printTabs(indent);
		switch (this.op) {
		case Equals:
			System.out.println("=");
			break;
		case LessThan:
			System.out.println("<");
			break;
		case LessThanEquals:
			System.out.println("<=");
			break;
		case GreaterThan:
			System.out.println(">");
			break;
		case GreaterThanEquals:
			System.out.println(">=");
			break;
		case NotEquals:
			System.out.println("!=");
			break;
		}
		left.print(indent + 1);
		right.print(indent + 1);
	}

	public boolean typesCompatible() {
		ColumnType l = left.getType().getColumnType();
		ColumnType r = right.getType().getColumnType();
		switch (l) {
		case INTEGER:
		case DOUBLE:
			if (r == ColumnType.INTEGER || r == ColumnType.DOUBLE)
				return true;
			return false;
		}
		return l == r;
	}

	@Override
	public Node accept(Visitor v) throws Exception {
		left = left.accept(v);
		right = right.accept(v);
		return v.Visit(this);
	}

}
