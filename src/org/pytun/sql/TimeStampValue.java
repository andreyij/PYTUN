package org.pytun.sql;

import java.sql.Timestamp;

import org.antlr.runtime.tree.CommonTree;
import org.pytun.common.ColumnType;

public class TimeStampValue extends Value {
	private Timestamp value;

	public TimeStampValue(CommonTree t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	public Timestamp getValue() {
		return value;
	}

	public void setValue(Timestamp value) {
		this.value = value;
		if (type == null){
			type = new DataType(node);
			type.setColumnType(ColumnType.TIMESTAMP);
		}
	}

	@Override
	public void print(int indent) {
		printTabs(indent);
		System.out.println(value);
	}

}
