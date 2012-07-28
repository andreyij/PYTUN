package org.pytun.execution.asl.arithmetic;

import org.pytun.execution.ExecutionEnv;

public class ArithNot extends ArithNode {

	@Override
	public void evaluate(ExecutionEnv env) throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public String toString() {
		return "(NOT " + left.toString() + ")";
	}

}
