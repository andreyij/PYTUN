package org.pytun.execution.asl.parameter;

import org.pytun.execution.asl.DbValueContainer;
import org.pytun.storage.value.DbValue;

public class ValueId extends Parameter {
	
	private DbValueContainer value;
	
	public ValueId(String name) {
		this.name = name;
		value = new DbValueContainer(name);
	}
	
	public ValueId(DbValueContainer cont) {
		this.name = cont.getName();
		value = cont;
	}

	@Override
	public String toString() {
		return value.toString();
	}

	public DbValue getValue() {
		return value.getValue();
	}

	public void setValue(DbValue val) {
		value.setValue(val);
	}
}
