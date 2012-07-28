package org.pytun.execution.asl.arithmetic;

import org.pytun.execution.ExecutionEnv;

public class ArithModulo extends ArithNode {

	public ArithModulo(ArithNode left, ArithNode right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	public void evaluate(ExecutionEnv env) throws Exception {
	}

	@Override
	public String toString() {
		return "(" + left.toString() + " MOD " + right.toString() + ")";
	}

}
