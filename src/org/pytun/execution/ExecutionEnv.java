package org.pytun.execution;

import org.pytun.execution.asl.Program;

public class ExecutionEnv {

	private Program program;
	private Buffer returnBuffer;

	public Buffer getReturnBuffer() {
		return returnBuffer;
	}

	public void setReturnBuffer(Buffer returnBuffer) {
		this.returnBuffer = returnBuffer;
	}

	public Program getProgram() {
		return program;
	}

	public void setProgram(Program program) {
		this.program = program;
	}
	
	
}
