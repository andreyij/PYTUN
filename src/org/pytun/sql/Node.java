package org.pytun.sql;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.TreeWizard.Visitor;

public class Node {
	protected CommonTree node;
	protected Node parent;
	protected Node statement;

	public Node(CommonTree t) {
		node = t;
		parent = null;
	}

	public CommonTree getNode() {
		return node;
	}

	public void setNode(CommonTree node) {
		this.node = node;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

	public Node getParent() {
		return parent;
	}

	public Node getStatement() {
		return statement;
	}

	public void setStatement(Node statement) {
		this.statement = statement;
	}

	protected void setupAST() {
		/*
		 * make sure that each node on which we call this function overrides it
		 * 
		 * System.out.println(this.getClass()); throw new
		 * UnsupportedOperationException ();
		 */
	}

	protected void semanticValidation() {
	}

	protected void resolveNames() {

	}

	public void compile() {
		setupAST();
		resolveNames();
		semanticValidation();
	}

	/* debugging */
	public void print(int indent) {
		printTabs(indent);
		System.out.println(this.getClass());
		// throw new UnsupportedOperationException ();
	}

	protected void printTabs(int indent) {
		for (int i = 0; i < indent - 1; i++) {
			System.out.print("    ");
		}
		if (indent != 0) {
			System.out.print("|");
			System.out.print("___");
		}
	}
	
	public Node visit (Visitor v){
		return this;
	}
}
