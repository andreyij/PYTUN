package org.pytun.sql;

import java.util.ArrayList;
import java.util.List;

import org.pytun.storage.catalog.Table;

public class ScopeStack {
	List<Scope> scopes;
	int current;

	public ScopeStack() {
		scopes = new ArrayList<Scope>();
		current = 0;
	}

	public Scope pop() {
		Scope s = scopes.remove(current);
		return s;
	}

	public Scope peek() {
		return scopes.get(current);
	}

	public void push(Scope s) {
		scopes.add(s);
		current++;
	}

	public Table searchAllScopesForTable(String tableName) {
		for (int i = current; i >= 0; i++) {
			Scope s = scopes.get(i);
			Table t = s.searchTable(tableName);
			if (t != null) {
				return t;
			}
		}
		return null;
	}

	/* debug functions */

	public void printStackDepth() {
		System.out.println("Stack size: " + scopes.size());
	}
}
