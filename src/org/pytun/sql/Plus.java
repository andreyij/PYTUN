package org.pytun.sql;

import org.antlr.runtime.tree.CommonTree;

public class Plus extends Expression {

	public Plus(CommonTree t) {
		super(t);
		// TODO Auto-generated constructor stub
	}
	
	public Plus(CommonTree t, Node right, Node left){
		super(t, right, left);
	}
}
