package org.pytun.sql;

import org.antlr.runtime.tree.CommonTree;

public class Divide extends Expression {

	public Divide(CommonTree t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	public Divide(CommonTree t, Node l, Node r) {
		super(t, l, r);
	}

	@Override
	public void print(int indent) {
		printTabs(indent);
		System.out.println("/");
		left.print(indent + 1);
		right.print(indent + 1);
	}

}
