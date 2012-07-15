package org.pytun.execution.asl.arithmetic;

import org.pytun.execution.ExecutionEnv;

public class ArithPlus extends ArithNode {

	public ArithPlus(ArithNode left, ArithNode right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	public boolean evaluate(ExecutionEnv env) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String toString() {
		return "(" + left.toString() + " + " + right.toString() + ")";
	}

}
