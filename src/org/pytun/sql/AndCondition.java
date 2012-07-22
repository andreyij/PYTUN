package org.pytun.sql;

import org.antlr.runtime.tree.CommonTree;

public class AndCondition extends Condition {

	public AndCondition(CommonTree t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print(int indent) {
		printTabs(indent);
		System.out.println("AND");
		left.print(indent + 1);
		right.print(indent + 1);
	}

}
