package org.pytun.execution.asl.arithmetic;

import org.pytun.execution.ExecutionEnv;

public class ArithAnd extends ArithNode {

	@Override
	public boolean evaluate(ExecutionEnv env) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		return "(" + left.toString() + " AND " + right.toString() + ")";
	}

}
