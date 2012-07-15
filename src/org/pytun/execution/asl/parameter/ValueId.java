package org.pytun.execution.asl.parameter;

import org.pytun.sql.Value;

public class ValueId extends Parameter {
	
	private Value value;
	
	public ValueId(String name) {
		// TODO
		//value = new Value();
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}
}
