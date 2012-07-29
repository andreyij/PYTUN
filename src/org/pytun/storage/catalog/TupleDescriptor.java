package org.pytun.storage.catalog;

import java.util.ArrayList;

public class TupleDescriptor {
	private ArrayList<Column> columns;
	
	public TupleDescriptor() {
		columns = new ArrayList<Column>();
	}
	
	public void addColumn(Column c) {
		columns.add(c);
	}
	
	public int getColumnCount() {
		return columns.size();
	}
	
	public Column getColumn(int idx) throws Exception {
		if (idx < 0 || idx >= columns.size()) {
			throw new Exception("Column index out of bounds!");
		} else {
			return columns.get(idx);
		}
	}
	
	public Column getColumn(String name) throws Exception {
		for (int i = 0; i < columns.size(); i++) {
			if (columns.get(i).getName().equals(name)) {
				return columns.get(i);
			}
		}

		throw new Exception("Could not find column '" + name + "'");
	}
	
	public ArrayList<Column> getColumns() {
		return columns;
	}
}
