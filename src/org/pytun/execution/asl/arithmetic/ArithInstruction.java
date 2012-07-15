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
	public boolean evaluate(ExecutionEnv env) {
		if (instruction == null) {
			System.out.println("Exec error: null instruction in ArithInstruction node!");
			return false;
		}
		
		if (instruction instanceof Call) {
			((Call)instruction).execute(env);
			// TODO: retrieve value from RETURN
		} else {
			System.out.println("Exec error: invalid instruction in ArithInstruction node (only CALL allowed)!");
			return false;
		}
		
		return true;
	}

	@Override
	public String toString() {
		return "(" + instruction.toString() + ")";
	}

}
