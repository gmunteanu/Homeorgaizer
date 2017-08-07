package com.training.homeorganizer.resources;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "item_seq", sequenceName = "item_id_seq")

public class Item implements Serializable{
	@Id
	@GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "item_seq")
	private int itemId;
	private String itemName;
	private StorageSpace storageSpace;
	private Date lastMove;
	//@OneToMany (mappedBy = "item")
	private List<Person> person;
	
	public Item(){
		
	}
	
	public Item(String itemName, StorageSpace storageSpace){
		this.itemName = itemName;
		this.storageSpace = storageSpace;
	}
	
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
	
	public String toString(){
		return "Item: " + getItemId() + " Name: " + getItemName() + " in " + getStorageSpace().getStorageSpaceName();
	}

}
