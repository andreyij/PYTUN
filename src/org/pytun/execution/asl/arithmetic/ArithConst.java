package org.pytun.execution.asl.arithmetic;

import org.pytun.execution.ExecutionEnv;
import org.pytun.storage.value.DbValue;

public class ArithConst extends ArithNode {

	public ArithConst(DbValue val) {
		value = val;
	}

	@Override
	public String toString() {
		return value.toString();
	}

	@Override
	public DbValue evaluate(ExecutionEnv env) throws Exception {

		if (value == null) {
			throw new Exception("Exec error: null value in ArithConst node!");
		}

		return value;
	}

}
