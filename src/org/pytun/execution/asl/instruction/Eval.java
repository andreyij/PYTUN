package org.pytun.execution.asl.instruction;

import org.pytun.execution.ExecutionEnv;
import org.pytun.execution.asl.arithmetic.ArithNode;
import org.pytun.execution.asl.parameter.Arithmetic;
import org.pytun.execution.asl.parameter.ValueId;

public class Eval extends Instruction {

	private ValueId returnValue;
	private Arithmetic arithmetic;

	public Eval(ValueId rv, Arithmetic ar) {
		returnValue = rv;
		arithmetic = ar;
	}

	@Override
	public void execute(ExecutionEnv env) throws Exception {

		ArithNode node = arithmetic.getArithmeticNode();
		if (node == null) {
			throw new Exception("Null arithmetic node!");
		}

		node.evaluate(env);

		returnValue.setValue(node.getValue());
	}

	@Override
	public String toString() {
		return "EVAL (" + returnValue.toString() + " = "
				+ arithmetic.toString() + ")";
	}

	public ValueId getReturnValue() {
		return returnValue;
	}

	public Arithmetic getArithmetic() {
		return arithmetic;
	}

}
