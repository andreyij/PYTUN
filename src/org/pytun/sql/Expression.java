package org.pytun.sql;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.TreeWizard.Visitor;

public class Expression extends Node {
	protected Node left;
	protected Node right;

	public Expression(CommonTree t) {
		super(t);
	}

	public Expression(CommonTree t, Node left, Node right) {
		super(t);
		this.left = left;
		this.right = right;
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
	protected void setupAST(){
		if(left != null){
			left.setParent(this);
			left.setStatement(this.getStatement());
			left.setupAST();
		}
		if (right != null){
			right.setParent(this);
			right.setStatement(this.getStatement());
			right.setupAST();			
		}
	}

	@Override
	public Node visit(Visitor v) {
		left = left.visit(v);
		right = right.visit(v);
		return this;
	}
	
}
