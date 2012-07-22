package org.pytun.sql;

import org.antlr.runtime.tree.CommonTree;

public class Condition extends Node {
	protected Node left;
	protected Node right;

	public Condition(CommonTree t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	@Override
	protected void setupAST() {
		left.setParent(this);
		right.setParent(this);
		left.setStatement(getStatement());
		right.setStatement(getStatement());
		left.setupAST();
		right.setupAST();
	}

}
