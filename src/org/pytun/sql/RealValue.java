package org.pytun.sql;

import org.antlr.runtime.tree.CommonTree;
import org.pytun.common.ColumnType;

public class RealValue extends Value {
	private double value;

	public RealValue(CommonTree t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
		if (type == null){
			type = new DataType(node);
			type.setColumnType(ColumnType.DOUBLE);
		}
	}

	@Override
	public void print(int indent) {
		printTabs(indent);
		System.out.println(value);
	}

}
