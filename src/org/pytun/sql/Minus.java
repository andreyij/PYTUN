package org.pytun.sql;

import org.antlr.runtime.tree.CommonTree;

public class Minus extends Expression {

	public Minus(CommonTree t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	public Minus(CommonTree t, Node left, Node right) {
		super(t, left, right);
	}

	@Override
	public void print(int indent) {
		printTabs(indent);
		System.out.println("-");
		left.print(indent + 1);
		right.print(indent + 1);
	}

}
