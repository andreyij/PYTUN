package org.pytun.execution.asl.parameter;

public abstract class Parameter {
	
	public String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public abstract String toString();
}
