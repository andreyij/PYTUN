package org.pytun.sql;

import org.antlr.runtime.tree.CommonTree;
import org.pytun.sql.visitors.Visitor;
import org.pytun.storage.catalog.Column;
import org.pytun.storage.catalog.Table;

public class Identifier extends Node {
	public enum IdentifierType {
		None, Table, Column
	};

	protected String name;

	/*
	 * Type of this identifier (column or table)
	 */
	protected IdentifierType iType;

	/*
	 * the table this identifier belongs to
	 */
	protected Table table;

	/*
	 * the column this identifier maps to
	 */
	protected Column column;

	protected String pseudonym;
	protected String tableAlias;

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
			System.out.println(" (table " + table.getName() + ")");
		} else {
			System.out.print(" (column) ");
			if (this.column != null) {
				System.out.println(" (table " + column.getTable().getName()
						+ ") ");
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
