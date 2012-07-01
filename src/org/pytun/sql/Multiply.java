package org.pytun.sql;

import org.antlr.runtime.tree.CommonTree;

public class Multiply extends Expression {

	public Multiply(CommonTree t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	public Multiply(CommonTree t, Node l, Node r) {
		super (t, l, r);
	}

}
