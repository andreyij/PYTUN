package org.pytun.execution.asl.arithmetic.mathematic;

import org.pytun.execution.asl.arithmetic.ArithNode;
import org.pytun.storage.value.DbDouble;
import org.pytun.storage.value.DbInteger;
import org.pytun.storage.value.DbString;

public class ArithDivide extends ArithMath {

	public ArithDivide(ArithNode left, ArithNode right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public String toString() {
		return "(" + left.toString() + " / " + right.toString() + ")";
	}

	@Override
	public DbInteger evalInteger(int a, int b) {
		return new DbInteger(a / b);
	}

	@Override
	public DbDouble evalDouble(double a, double b) {
		return new DbDouble(a / b);
	}

	@Override
	public DbString evalString(String a, String b) throws Exception {
		throw new Exception ("Exec error: DIVIDE operator is not applicable on STRING types");
	}
	
}
