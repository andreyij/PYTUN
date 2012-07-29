package org.pytun.storage.catalog;

public class Table {
	private String name;
	private TupleDescriptor descriptor;

	public Table(String n) {
		descriptor = new TupleDescriptor();

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
				descriptor.addColumn(c);
			}

		} else {
			// received table name
			name = n;
		}
	}

	public String getName() {
		return name;
	}

	public TupleDescriptor getDescriptor() {
		return descriptor;
	}

	public String toString() {
		String col = "";
		for (int i = 0; i < descriptor.getColumnCount(); i++) {
			try {
				col += i + "/" + descriptor.getColumn(i).toString() + ";";
			} catch (Exception e) {
				/* should not get here */
				assert (false);
			}
		}

		return "##" + name + "/" + descriptor.getColumnCount() + ":" + col;
	}
}
