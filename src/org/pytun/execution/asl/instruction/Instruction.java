package org.pytun.execution.asl.instruction;

import org.pytun.execution.ExecutionEnv;

public abstract class Instruction {
	
	public abstract void execute(ExecutionEnv env) throws Exception;
	
	public abstract String toString();
}
