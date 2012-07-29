package org.pytun.execution.asl.arithmetic.comparison;

import org.pytun.execution.ExecutionEnv;
import org.pytun.execution.asl.arithmetic.ArithNode;
import org.pytun.storage.value.*;

public abstract class ArithComparison extends ArithNode {

	public abstract boolean compareInteger(int a, int b);
	public abstract boolean compareDouble(double a, double b);
	public abstract boolean compareBoolean(boolean a, boolean b);
	public abstract boolean compareString(String a, String b);

	@Override
	public DbValue evaluate(ExecutionEnv env) throws Exception {

		value = new DbNull();
		
		DbValue l = left.evaluate(env);
		DbValue r = right.evaluate(env);
		boolean ret = false;
		
		if (l instanceof DbInteger) {
			if (r instanceof DbInteger) {
				// int, int
				ret = compareInteger(((DbInteger)l).getValue(), ((DbInteger)r).getValue());
			} else if (r instanceof DbDouble) {
				// int, double
				ret = compareDouble(((DbInteger)l).getValue(), ((DbDouble)r).getValue());
			} else {
				throw new Exception ("Exec error: unable to compare types " + l.getType() + " and " + r.getType());
			}
		} else if (l instanceof DbDouble) {
			if (r instanceof DbInteger) {
				// double, int
				ret = compareDouble(((DbDouble)l).getValue(), ((DbInteger)r).getValue());
			} else if (r instanceof DbDouble) {
				// double, double
				ret = compareDouble(((DbDouble)l).getValue(), ((DbDouble)r).getValue());
			} else {
				throw new Exception ("Exec error: unable to compare types " + l.getType() + " and " + r.getType());
			}
		} else if (l instanceof DbBoolean) {
			if (r instanceof DbBoolean) {
				// boolean, boolean
				ret = compareBoolean(((DbBoolean)l).getValue(), ((DbBoolean)r).getValue());
			} else {
				throw new Exception ("Exec error: unable to compare types " + l.getType() + " and " + r.getType());
			}
		} else if (l instanceof DbString) {
			if (r instanceof DbBoolean) {
				// string, string
				ret = compareString(((DbString)l).getValue(), ((DbString)r).getValue());
			} else {
				throw new Exception ("Exec error: unable to compare types " + l.getType() + " and " + r.getType());
			}
		} else {
			throw new Exception ("Exec error: unable to compare types " + l.getType() + " and " + r.getType());
		}
		
		value = new DbBoolean(ret);
		return value;
	}
	
}
