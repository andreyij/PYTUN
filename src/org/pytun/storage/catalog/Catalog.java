package org.pytun.storage.catalog;

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Catalog {
	private Map<String, Table> tables;
	private String database;

	public Catalog(String database) {
		this.database = database;
	}

	public Table findTable(String name) {
		if (tables == null) {
			return null;
		}
		if (tables.containsKey(name)) {
			return tables.get(name);
		}
		return null;
	}

	public void createTable(Table table) {

	}

	public void init() throws Exception {
		String catalogPath = "database" + File.pathSeparator + database;
		File f = new File(catalogPath);
		boolean exists = f.exists();
		if (!exists) {
			/* Probably this is the first run. Just create it */
			FileWriter fw = new FileWriter(f);
			fw.write("<database></database>");
			fw.flush();
			fw.close();
		}
		initTables(f);
	}

	private void initTables(File catalog) throws Exception {
		tables = new HashMap<String, Table>();

		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(catalog);
		doc.getDocumentElement().normalize();

		NodeList tableList = doc.getElementsByTagName("table");
		for (int i = 0; i < tableList.getLength(); i++) {
			Node tableNode = tableList.item(i);
			Table t = tableFromCatalog(tableNode);
			if (t != null){
				tables.put(t.getName(), t);
			}
		}
	}
	
	private Table tableFromCatalog(Node xmlTable) throws Exception{
		/*
		 * XML table description has the following DOM
		 * <table>
		 * 	<name>table name</name>
		 * 	<columns>
		 * 		<column>
		 * 			<name></name>
		 * 			<type></type>
		 * 		</column>
		 * 	</columns>
		 * </table>
		 * 
		 * This structure should be extended to support a lot more info
		 * (in fact, it should not use XML at all!)  
		 */
		Table t = new Table();
		if (xmlTable.getNodeType()==Node.ELEMENT_NODE){
			Element e = (Element)xmlTable;
			NodeList bogusList = e.getElementsByTagName("name");
			Element nameEl = (Element)bogusList.item(0);
			t.setName(nameEl.getChildNodes().item(0).getNodeValue().trim());
			
		}
		return t;
	}
	
}
