package org.pytun.storage.catalog;

public class Table {
	private String name;
	private Column[] columns;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Column getColumn(String name) {
		if (columns == null) {
			return null;
		}
		for (int i = 0; i < columns.length; i++) {
			if (columns[i].getName().equals(name)) {
				return columns[i];
			}
		}
		return null;
	}

	public void setColumns(Column[] columns) {
		this.columns = columns;
	}

	public Column[] getColumns() {
		return columns;
	}
}
