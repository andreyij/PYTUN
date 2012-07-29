package org.pytun.storage.catalog;

import org.pytun.common.*;

public class Column {

	private String name;
	private ColumnType type;
	private int precision;
	private Table table;

	public String getName() {
		return name;
	}

	public ColumnType getType() {
		return type;
	}

	public int getPrecision() {
		return precision;
	}

	public Column(String n, ColumnType t, int p) {
		// from scratch
		name = n;
		type = t;
		precision = p;
	}

	public Column(String ser) {
		// serialized column
		String[] parts = ser.split("\\/");

		name = parts[1];
		type = ColumnType.valueOf(parts[2]);
		precision = Integer.parseInt(parts[3]);
	}

	public String toString() {
		return name + "/" + type.toString() + "/" + precision;
	}

	public Table getTable() {
		return table;
	}

	public void setTable(Table table) {
		this.table = table;
	}
}
