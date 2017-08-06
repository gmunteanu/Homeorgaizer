package com.training.homeorganizer.resources;

public class StorageSpace {
	private int storageSpaceId;
	private String storageSpaceName;
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
	public StorageSpace getLocation() {
		return parent;
	}
	public void setLocation(StorageSpace location) {
		this.parent = location;
	}
	
	

}
