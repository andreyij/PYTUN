package org.pytun.execution.asl.arithmetic;

import org.pytun.execution.ExecutionEnv;
import org.pytun.execution.asl.instruction.Call;
import org.pytun.execution.asl.instruction.Instruction;

public class ArithInstruction extends ArithNode {

	private Instruction instruction;

	public ArithInstruction(Instruction ins) {
		instruction = ins;
	}

	@Override
	public void evaluate(ExecutionEnv env) throws Exception {
		if (instruction == null) {
			throw new Exception(
					"Exec error: null instruction in ArithInstruction node!");
		}

		if (instruction instanceof Call) {
			((Call) instruction).execute(env);
			// TODO: retrieve value from RETURN
		}
	}

	@Override
	public String toString() {
		return "(" + instruction.toString() + ")";
	}

}
