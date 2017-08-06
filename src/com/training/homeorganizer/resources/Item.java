package com.training.homeorganizer.resources;

import java.sql.Date;
import java.util.List;

public class Item {
	private int itemId;
	private String itemName;
	private StorageSpace storageSpace;
	private Date lastMove;
	private List<Person> person;
	
	public void setItemId(int itemId){
		this.itemId = itemId;
	}
	
	public int getItemId(){
		return itemId;
	}

	public List<Person> getPerson() {
		return person;
	}

	public void setPerson(List<Person> person) {
		this.person = person;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public StorageSpace getStorageSpace() {
		return storageSpace;
	}

	public void setStorageSpace(StorageSpace storageSpace) {
		this.storageSpace = storageSpace;
	}

	public Date getLastMove() {
		return lastMove;
	}

	public void setLastMove(Date lastMove) {
		this.lastMove = lastMove;
	}
	
	

}
