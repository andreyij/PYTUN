package org.pytun.execution.asl.parameter;

import org.pytun.storage.value.DbValue;

public class ValueId extends Parameter {
	
	private DbValue value;
	
	public ValueId(String name) {
		// TODO
		//value = new Value();
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	public DbValue getValue() {
		return value;
	}

	public void setValue(DbValue value) {
		this.value = value;
	}
}
