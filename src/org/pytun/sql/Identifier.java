package org.pytun.sql;

import org.antlr.runtime.tree.CommonTree;
import org.pytun.sql.visitors.Visitor;
import org.pytun.storage.catalog.Column;
import org.pytun.storage.catalog.Table;

public class Identifier extends Node {
	private String name;

	public enum IdentifierType {
		None, Table, Column
	};

	/*
	 * Type of this identifier (column or table)
	 */
	private IdentifierType iType;

	/*
	 * the table this identifier belongs to
	 */
	private Table table;

	/*
	 * the column this identifier maps to
	 */
	private Column column;

	private String pseudonym;
	private String tableAlias;

	public Identifier(CommonTree t) {
		super(t);
		iType = IdentifierType.Column;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print(int indent) {
		printTabs(indent);
		System.out.print(name);
		if (iType == IdentifierType.Table) {
			System.out.println(" (table "+table.getName()+")");
		} else {
			System.out.println(" (column) ");
			if (this.column != null) {
				this.getType().print(indent + 1);
			}
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public IdentifierType getIdentifierType() {
		return iType;
	}

	public void setIdentifierType(IdentifierType type) {
		this.iType = type;
	}

	public void setColumn(Column column) {
		this.column = column;
	}

	public Column getColumn() {
		return column;
	}
	
	@Override
	public Node accept(Visitor v) throws Exception {
		return v.Visit(this);
		
	}

	public Table getTable() {
		return table;
	}

	public void setTable(Table table) {
		this.table = table;
	}

	public String getPseudonym() {
		return pseudonym;
	}

	public void setPseudonym(String pseudonym) {
		this.pseudonym = pseudonym;
	}

	public String getTableAlias() {
		return tableAlias;
	}

	public void setTableAlias(String tableAlias) {
		this.tableAlias = tableAlias;
	}
}
