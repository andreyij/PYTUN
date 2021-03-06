package org.pytun.sql.visitors;

import org.pytun.sql.Assignment;
import org.pytun.sql.Condition;
import org.pytun.sql.DateValue;
import org.pytun.sql.Divide;
import org.pytun.sql.DropQuery;
import org.pytun.sql.Expression;
import org.pytun.sql.InsertQuery;
import org.pytun.sql.IntegerValue;
import org.pytun.sql.Minus;
import org.pytun.sql.Modulo;
import org.pytun.sql.Multiply;
import org.pytun.sql.Node;
import org.pytun.sql.Plus;
import org.pytun.sql.Predicate;
import org.pytun.sql.RealValue;
import org.pytun.sql.SelectQuery;
import org.pytun.sql.StarIdentifier;
import org.pytun.sql.StringValue;
import org.pytun.sql.TimeStampValue;
import org.pytun.sql.TimeValue;
import org.pytun.sql.UpdateQuery;
import org.pytun.sql.CreateQuery;
import org.pytun.sql.DeleteQuery;
import org.pytun.sql.Identifier;

public class Visitor {

	/* statements */
	public Node Visit(SelectQuery n) throws Exception {
		return n;
	}

	public Node Visit(DeleteQuery n) throws Exception {
		return n;
	}

	public Node Visit(UpdateQuery n) throws Exception {
		return n;
	}

	public Node Visit(InsertQuery n) throws Exception {
		return n;
	}

	public Node Visit(DropQuery n) throws Exception {
		return n;
	}

	public Node Visit(CreateQuery n) throws Exception {
		return n;
	}

	public Node Visit(Expression n) throws Exception {
		return n;
	}

	/* arithmetic */
	public Node Visit(Plus n) throws Exception {
		return n;
	}

	public Node Visit(Minus n) throws Exception {
		return n;
	}

	public Node Visit(Divide n) throws Exception {
		return n;
	}

	public Node Visit(Multiply n) throws Exception {
		return n;
	}

	public Node Visit(Modulo n) throws Exception {
		return n;
	}

	public Node Visit(Identifier n) throws Exception {
		return n;
	}

	public Node Visit(StarIdentifier i) throws Exception {
		return i;
	}

	/* values */
	public Node Visit(IntegerValue n) throws Exception {
		return n;
	}

	public Node Visit(RealValue n) throws Exception {
		return n;
	}

	public Node Visit(StringValue n) throws Exception {
		return n;
	}

	public Node Visit(DateValue n) throws Exception {
		return n;
	}

	public Node Visit(TimeValue n) throws Exception {
		return n;
	}

	public Node Visit(TimeStampValue n) throws Exception {
		return n;
	}

	/* predicates */
	public Node Visit(Condition n) throws Exception {
		return n;
	}

	public Node Visit(Predicate n) throws Exception {
		return n;
	}
	
	public Node Visit(Assignment n) throws Exception {
		return n;
	}
}
