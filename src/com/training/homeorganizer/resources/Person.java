package com.training.homeorganizer.resources;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity(name = "persons")
//@SequenceGenerator(name = "person_seq", sequenceName = "person_id_seq")
public class Person {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int personId;
	private String personName;
	
	public Person(){
		
	}
	
	public Person(String personName){
		this.personName = personName;
	}
	
	public int getPersonId(){
		return personId;
	}
	
	public void setPersonId(int personId){
		this.personId = personId;
	}
	
	public String getPersonName(){
		return personName;
	}
	
	public void setPersonName(String personName){
		this.personName = personName;
	}
	
	public String toString(){
		return "Person name: " + getPersonName();
	}

}
