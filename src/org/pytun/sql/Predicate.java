package org.pytun.sql;

import org.antlr.runtime.tree.CommonTree;

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
		left.print(indent+1);
		right.print(indent+1);
	}

}
