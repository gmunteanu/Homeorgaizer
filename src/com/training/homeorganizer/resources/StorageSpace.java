package com.training.homeorganizer.resources;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "storagespaces")
public class StorageSpace {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int storageSpaceId;
	private String storageSpaceName;
	@OneToOne
	@JoinColumn(name="ParentId")
	private StorageSpace parent;
	
	
	public int getStorageSpaceId() {
		return storageSpaceId;
	}
	public void setStorageSpaceId(int storageSpaceId) {
		this.storageSpaceId = storageSpaceId;
	}
	public String getStorageSpaceName() {
		return storageSpaceName;
	}
	public void setStorageSpaceName(String storageSpaceName) {
		this.storageSpaceName = storageSpaceName;
	}
	public StorageSpace getParent() {
		return parent;
	}
	public void setParent(StorageSpace parent) {
		this.parent = parent;
	}
	
	

}
