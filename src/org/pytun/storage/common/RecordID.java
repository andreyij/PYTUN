package org.pytun.storage.common;

public class RecordID {

	public int 	pageID;
	public int 	slotID;
	
	public RecordID (int pageID, int slotID) {
		this.pageID = pageID;
		this.slotID = slotID;
	}
}
