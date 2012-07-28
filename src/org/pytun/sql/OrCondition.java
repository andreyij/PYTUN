package org.pytun.sql;

import org.antlr.runtime.tree.CommonTree;

public class OrCondition extends Condition {

	public OrCondition(CommonTree t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print(int indent) {
		printTabs(indent);
		System.out.println("OR");
		left.print(indent + 1);
		right.print(indent + 1);
	}

}
