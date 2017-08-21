package com.training.homeorganizer.resources;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity(name="items")
//@SequenceGenerator(name = "item_seq", sequenceName = "item_id_seq")

public class Item implements Serializable{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int itemId;
	private String itemName;
	
	@OneToOne
	@JoinColumn(name="StorageSpaceId")
	private StorageSpace storageSpace;
	
	private Date lastMove;
	
	@ManyToMany
	@JoinTable(name="ownership", joinColumns=@JoinColumn(name="ItemId"),
				inverseJoinColumns=@JoinColumn(name="PersonId")
			)
	private List<Person> person = new ArrayList<Person>();
	
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
