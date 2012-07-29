package org.pytun.storage.catalog;

import java.util.ArrayList;
import java.util.List;

public class Table {
	private String name;
	private ArrayList<Column> columns;

	public Table(String n) {
		columns = new ArrayList<Column>();

		if (n.startsWith("##")) {
			// received serialized table
			String buf = n;

			// remove ## prefix
			buf = buf.replaceFirst("[#][#]", "");

			// get table name and column count
			String[] tabspec = buf.split("[\\:\\/]+");
			name = tabspec[0];

			// remove table name and column count
			buf = buf.replaceFirst("[a-zA-Z]+[\\/][0-9]+[\\:]", "");

			// read columns
			String[] cols = buf.split("\\;");
			for (int i = 0; i < cols.length; i++) {
				Column c = new Column(cols[i]);
				c.setTable(this);
				addColumn(c);
			}

		} else {
			// received table name
			name = n;
		}
	}

	public String getName() {
		return name;
	}

	public int getColumnCount() {
		return columns.size();
	}

	public Column getColumn(String name) {
		if (columns == null) {
			return null;
		}

		for (int i = 0; i < columns.size(); i++) {
			if (columns.get(i).getName().equals(name)) {
				return columns.get(i);
			}
		}

		return null;
	}

	public Column getColumn(int idx) {
		if (idx >= columns.size() || idx < 0) {
			return null;
		}

		return columns.get(idx);
	}

	public List<Column> getColumns() {
		/*
		 * perhaps this should return a copy, but i'm just gonna live it like
		 * this for now
		 */
		return columns;
	}

	public void addColumn(Column col) {
		assert (col != null);
		columns.add(col);
	}

	public String toString() {
		String col = "";
		for (int i = 0; i < columns.size(); i++) {
			col += i + "/" + columns.get(i).toString() + ";";
		}

		return "##" + name + "/" + columns.size() + ":" + col;
	}
}
