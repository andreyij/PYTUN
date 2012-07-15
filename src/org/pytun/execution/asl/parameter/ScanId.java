package org.pytun.execution.asl.parameter;

import org.pytun.execution.ScanPosition;

public abstract class ScanId extends Parameter {
	
	private ScanPosition position;
	
	public ScanId(String name) {
		setName(name);
	}

	public ScanPosition getPosition() {
		return position;
	}

	public void setPosition(ScanPosition position) {
		this.position = position;
	} 
}
