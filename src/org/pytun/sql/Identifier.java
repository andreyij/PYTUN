package org.pytun.sql;

import org.antlr.runtime.tree.CommonTree;
import org.pytun.storage.catalog.Column;
import org.pytun.storage.catalog.Table;

public class Identifier extends Node {
	private String name;

	public enum IdentifierType {
		Table, Column
	};

	/*
	 * Type of this identifier (column or table)
	 */
	private IdentifierType type;

	/*
	 * the table this identifier belongs to
	 */
	private Table table;
	
	/*
	 * the column this identifier maps to
	 */
	private Column column;

	public Identifier(CommonTree t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print(int indent) {
		printTabs(indent);
		System.out.println(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public IdentifierType getIdentifierType() {
		return type;
	}
}
