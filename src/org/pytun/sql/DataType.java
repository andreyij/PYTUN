package org.pytun.sql;

import org.antlr.runtime.tree.CommonTree;
import org.pytun.common.ColumnType;

public class DataType extends Node {
	private ColumnType nodeType;
	private int precision;

	public DataType(CommonTree t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	public ColumnType getColumnType() {
		return nodeType;
	}

	public void setColumnType(ColumnType type) {
		this.nodeType = type;
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
		switch (nodeType) {
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

	public static boolean typesCompatible(ColumnType left, ColumnType right){
		switch (left) {
		case INTEGER:
		case DOUBLE:
			if (right == ColumnType.INTEGER || right == ColumnType.DOUBLE)
				return true;
			return false;
		}
		return left == right;
	}
	
	public static String typeAsText(ColumnType type){
		switch (type) {
		case INTEGER:
			return "INTEGER";
		case DOUBLE:
			return "DOUBLE";
		case STRING:
			return "STRING";
		case DATE:
			return "DATE";
		case TIME:
			return "TIME";
		case TIMESTAMP:
			return "TIMESTAMP";
		case BOOLEAN:
			return "BOOLEAN";
		}
		return "NONE";
	}
}
