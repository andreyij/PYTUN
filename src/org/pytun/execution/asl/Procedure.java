package org.pytun.execution.asl;

import java.util.ArrayList;

import org.pytun.execution.ExecutionEnv;
import org.pytun.execution.asl.instruction.Instruction;

public class Procedure {

	private String name;
	private ArrayList<Instruction> instructions;

	public Procedure(String n) {
		name = n;
		instructions = new ArrayList<Instruction>();
	}

	public String getName() {
		return name;
	}

	public void execute(ExecutionEnv env) throws Exception {

		for (int i = 0; i < instructions.size(); i++) {
			Instruction ins = instructions.get(i);

			if (ins == null) {
				throw new Exception(
						"Exec error: null ASL instruction in procedure '"
								+ name + "'!");
			}

			ins.execute(env);
		}
	}

	public void addInstruction(Instruction ins) {
		instructions.add(ins);
	}

	public String toString() {

		String text = "PROCEDURE " + name + ":\n";

		for (Instruction i : instructions) {
			text += "  " + i.toString() + "\n";
		}

		text += "END";

		return text;
	}
}
