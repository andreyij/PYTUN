package org.pytun.sql;

import org.antlr.runtime.tree.CommonTree;
import org.pytun.sql.visitors.NamingVisitor;
import org.pytun.sql.visitors.SemanticVisitor;
import org.pytun.sql.visitors.Visitor;

public class Node {
	protected CommonTree node;
	protected Node parent;
	protected Node statement;
	protected DataType type;

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

	public String getText() {
		return node.getText();
	}

	public void setStatement(Node statement) {
		this.statement = statement;
	}

	protected void setupAST() {
	}

	protected void semanticValidation() throws Exception {
		accept (new SemanticVisitor());
	}

	protected void resolveNames() throws Exception {
		//accept (new NamingVisitor());
		Visitor v = new NamingVisitor();
		accept(v);
	}

	public void compile() throws Exception {
		setupAST();
		resolveNames();
		semanticValidation();
	}

	/* debugging */
	public void print(int indent) {
		printTabs(indent);
		System.out.println(this.getClass());
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

	public Node accept(Visitor v) throws Exception {
		return this;
	}

	public DataType getType() {
		return type;
	}

	public void setType(DataType type) {
		this.type = type;
	}
	
	public boolean isConstant(){
		return (this instanceof Value);
	}
}
