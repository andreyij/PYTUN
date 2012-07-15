package org.pytun.test;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.pytun.sql.Query;
import org.pytun.sql.SQLGrammarLexer;
import org.pytun.sql.SQLGrammarParser;
import org.pytun.sql.SQLTree;

public class Main {
	public void printSQLTree(String SQLQuery) {
		System.out.println("parsing: " + SQLQuery);
		ANTLRStringStream in = new ANTLRStringStream(SQLQuery);
		SQLGrammarLexer lexer = new SQLGrammarLexer(in);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		SQLGrammarParser parser = new SQLGrammarParser(tokens);
		try {
			SQLGrammarParser.query_return ret = parser.query();
			CommonTree tree = (CommonTree) ret.getTree();
			if (tree == null){
				throw new Exception("Tree is null!");
			}
			SQLTree st = new SQLTree(new CommonTreeNodeStream(tree));
			Query q = st.query().n; 
			System.out.println("Tree is: "+q.getClass());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void printTree(CommonTree t, int indent) {
		if ( t != null ) {
			StringBuffer sb = new StringBuffer(indent);
			
			if(indent > 0) {
				for(int i = 0; i<indent - 1; i++)
					sb = sb.append("  ");
				sb = sb.append("|");				
			}
			for ( int i = 0; i < indent; i++ )
				sb = sb.append("__");
			
			System.out.println(sb.toString() + t.getText() + " (type: " + t.getType() + ")");
			for ( int i = 0; i < t.getChildCount(); i++ ) {
				printTree((CommonTree)t.getChild(i), indent+1);
			}
		}
	}


	public static void main(String[] args) {
		Main m = new Main();
		m.printSQLTree("SELECT a FROM x;");
	}
}
