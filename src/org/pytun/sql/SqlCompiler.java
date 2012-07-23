package org.pytun.sql;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

public class SqlCompiler {

	public Node compile(String sqlQuery) throws Exception {
		Query q = null;
		ANTLRStringStream in = new ANTLRStringStream(sqlQuery);
		SQLGrammarLexer lexer = new SQLGrammarLexer(in);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		SQLGrammarParser parser = new SQLGrammarParser(tokens);
		try {
			SQLGrammarParser.query_return ret = parser.query();
			CommonTree tree = (CommonTree) ret.getTree();
			if (tree == null) {
				throw new Exception("Internal: Tree is null!");
			}
			SQLTree st = new SQLTree(new CommonTreeNodeStream(tree));
			q = st.query().n;
			System.out.println("Tree is: " + q.getClass());
			q.compile();
			q.print(0);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return q;
	}
}
