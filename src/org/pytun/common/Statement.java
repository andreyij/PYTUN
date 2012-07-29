package org.pytun.common;

import org.pytun.execution.asl.Program;
import org.pytun.planner.Planner;
import org.pytun.planner.QueryPlan;
import org.pytun.sql.Node;
import org.pytun.sql.SqlCompiler;

public class Statement {

	String query;

	public Statement(String sqlQuery) {
		query = sqlQuery;
	}

	public void execute() throws Exception {
		SqlCompiler compiler = new SqlCompiler();
		Node node = compiler.compile(query);
		Planner planner = new Planner();
		QueryPlan queryPlan = planner.plan(node);
		Program program = queryPlan.translate();
		program.execute();
	}
}
