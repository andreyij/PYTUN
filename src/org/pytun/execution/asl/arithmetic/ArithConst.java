package org.pytun.execution.asl.arithmetic;

import org.pytun.execution.ExecutionEnv;
import org.pytun.sql.Value;

public class ArithConst extends ArithNode {

	public ArithConst(Value val) {
		value = val;
	}

	@Override
	public String toString() {
		return value.toString();
	}

	@Override
	public void evaluate(ExecutionEnv env) throws Exception {

		if (value == null) {
			throw new Exception("Exec error: null value in ArithConst node!");
		}
		// nothing to do
	}

}
