package org.pytun.execution.asl.arithmetic;

import org.pytun.execution.ExecutionEnv;
import org.pytun.sql.Value;

public abstract class ArithNode {

	protected Value value;

	protected ArithNode left;
	protected ArithNode right;

	public abstract void evaluate(ExecutionEnv env) throws Exception;

	public abstract String toString();

	public Value getValue() {
		// TODO: return clone value
		return value;
	}
}
