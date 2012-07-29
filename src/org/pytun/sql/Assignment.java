package org.pytun.sql;

import org.antlr.runtime.tree.CommonTree;
import org.pytun.sql.visitors.Visitor;

public class Assignment extends Node {

	private Node column;
	private Node value;

	public Assignment(CommonTree t) {
		super(t);
	}

	public Node getColumn() {
		return column;
	}

	public void setColumn(Node column) {
		this.column = column;
	}

	public Node getValue() {
		return value;
	}

	public void setValue(Node value) {
		this.value = value;
	}

	@Override
	protected void setupAST() {
		column.setParent(this);
		column.setStatement(getStatement());
		column.setupAST();

		value.setParent(this);
		value.setStatement(getStatement());
		value.setupAST();
	}

	@Override
	public void print(int indent) {
		printTabs(indent);
		System.out.println("ASSIGN");
		column.print(indent + 1);
		System.out.println();
		value.print(indent + 1);
	}

	@Override
	public Node accept(Visitor v) throws Exception {
		column = column.accept(v);
		value = value.accept(v);
		return v.Visit(this);
	}


}
