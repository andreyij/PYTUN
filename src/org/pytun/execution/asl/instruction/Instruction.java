package org.pytun.execution.asl.instruction;

import org.pytun.execution.ExecutionEnv;

public abstract class Instruction {
	
	public abstract boolean execute(ExecutionEnv env);
	
	public abstract String toString();
}
