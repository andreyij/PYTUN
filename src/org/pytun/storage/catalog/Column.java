package org.pytun.storage.catalog;

public class Column {
	public enum ColumnType {
		Integer, Float, String, Date, Time, DateTime, TimeStamp
	}

	private String name;
	private ColumnType type;

	public void setName(String name) {
		this.name = name;
	}

	public void setType(ColumnType type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public ColumnType getType() {
		return type;
	}
}
