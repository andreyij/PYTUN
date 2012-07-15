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
	public boolean execute(ExecutionEnv env) {
		
		ArithNode node = arithmetic.getArithmeticNode();
		if (node == null) {
			return false;
		}
		
		if (!node.evaluate(env)) {
			return false;
		}
		
		returnValue.setValue(node.getValue());
		
		return false;
	}

	@Override
	public String toString() {
		return "EVAL (" + returnValue.toString() + " = " + arithmetic.toString() + ")";
	}

	public ValueId getReturnValue() {
		return returnValue;
	}

	public Arithmetic getArithmetic() {
		return arithmetic;
	}

}
