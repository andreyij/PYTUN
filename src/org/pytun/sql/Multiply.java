package org.pytun.sql;

import org.antlr.runtime.tree.CommonTree;

public class Multiply extends Expression {

	public Multiply(CommonTree t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	public Multiply(CommonTree t, Node l, Node r) {
		super(t, l, r);
	}

	@Override
	public void print(int indent) {
		printTabs(indent);
		System.out.println("*");
		left.print(indent + 1);
		right.print(indent + 1);
	}

}
