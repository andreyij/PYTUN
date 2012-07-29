package org.pytun.execution.asl.arithmetic.comparison;

import org.pytun.execution.asl.arithmetic.ArithNode;

public class ArithGe extends ArithComparison {

	public ArithGe(ArithNode left, ArithNode right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	public String toString() {
		return "(" + left.toString() + " >= " + right.toString() + ")";
	}

	@Override
	public boolean compareInteger(int a, int b) {
		return a >= b;
	}

	@Override
	public boolean compareDouble(double a, double b) {
		return a >= b;
	}

	@Override
	public boolean compareBoolean(boolean a, boolean b) {
		return (a || !b);
	}

	@Override
	public boolean compareString(String a, String b) {
		return a.compareTo(b) >= 0;
	}	
}
