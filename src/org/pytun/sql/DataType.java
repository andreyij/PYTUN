package org.pytun.sql;

import org.antlr.runtime.tree.CommonTree;
import org.pytun.common.ColumnType;

public class DataType extends Node {
	private ColumnType type;
	private int precision;

	public DataType(CommonTree t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	public ColumnType getType() {
		return type;
	}

	public void setType(ColumnType type) {
		this.type = type;
	}

	public int getPrecision() {
		return precision;
	}

	public void setPrecision(int precision) {
		this.precision = precision;
	}

	@Override
	public void print(int indent) {
		printTabs(indent);
		switch (type) {
		case INTEGER:
			System.out.println("INTEGER");
			break;
		case DOUBLE:
			System.out.println("DOUBLE");
			break;
		case STRING:
			System.out.println("STRING (" + precision + ")");
			break;
		case DATE:
			System.out.println("DATE");
			break;
		case TIME:
			System.out.println("TIME");
			break;
		case TIMESTAMP:
			System.out.println("TIMESTAMP");
			break;
		case BOOLEAN:
			System.out.println("BOOLEAN");
			break;
		}
	}

}
