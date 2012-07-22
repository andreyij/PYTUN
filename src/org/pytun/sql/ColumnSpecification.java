package org.pytun.sql;

import org.antlr.runtime.tree.CommonTree;

public class ColumnSpecification extends Node {

	private Identifier name;
	private DataType type;

	public ColumnSpecification(CommonTree t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	public Identifier getName() {
		return name;
	}

	public void setName(Identifier name) {
		this.name = name;
	}

	public DataType getType() {
		return type;
	}

	public void setType(DataType type) {
		this.type = type;
	}

	@Override
	public void print(int indent) {
		name.print(indent+1);
		type.print(indent+2);
	}
}
