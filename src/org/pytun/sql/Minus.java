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

}
