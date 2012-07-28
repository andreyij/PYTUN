package org.pytun.execution.asl.arithmetic;

import org.pytun.execution.ExecutionEnv;

public class ArithAnd extends ArithNode {

	@Override
	public void evaluate(ExecutionEnv env) throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public String toString() {
		return "(" + left.toString() + " AND " + right.toString() + ")";
	}

}
