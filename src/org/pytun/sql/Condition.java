package org.pytun.sql;

import org.antlr.runtime.tree.CommonTree;
import org.pytun.sql.visitors.Visitor;

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


	@Override
	public Node accept(Visitor v) throws Exception {
		left = left.accept(v);
		right = right.accept(v);
		return v.Visit(this);
	}

}
