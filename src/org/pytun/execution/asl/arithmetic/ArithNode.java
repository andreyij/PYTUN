package org.pytun.execution.asl.arithmetic;

import org.pytun.execution.ExecutionEnv;
import org.pytun.storage.value.DbValue;

public abstract class ArithNode {

	protected DbValue value;

	protected ArithNode left;
	protected ArithNode right;
	
	public abstract DbValue evaluate(ExecutionEnv env) throws Exception;

	public abstract String toString();
	
	public DbValue getValue() {
		// TODO: return clone value
		return value;
	}
}
