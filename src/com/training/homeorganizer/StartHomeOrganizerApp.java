package com.training.homeorganizer;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.jboss.logging.Logger;

import com.training.homeorganizer.resources.InitSessionFactory;
import com.training.homeorganizer.resources.Item;
import com.training.homeorganizer.resources.Person;
import com.training.homeorganizer.resources.StorageSpace;

public class StartHomeOrganizerApp {
	private static Logger log = Logger.getLogger(StartHomeOrganizerApp.class);
	
	private static SessionFactory sessionFactory = InitSessionFactory.getInstance();
	
	public static void main (String[] args){
		/* clean tables*/
		//clean();
		
		/* simple create example */
		//createPerson();
		
		/* relation example */
		//createRelation();
		
		/* delete example */
		//delete();
		
		/* update example */
		//update();
		
		/* query example */
		//query();
		
		/*create a Storage Space */
		//createStorageSpace();
		
		createItem();
		
		sessionFactory.close();
	}
	
	
	private static Person createPerson(){
		Person newPerson = new Person();
		newPerson.setPersonName("Gigel");
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(newPerson);
		tx.commit();
		session.close();
		//sessionFactory.close();
		return newPerson;
	}
	
	private static void update(){
		//Person newPerson = createPerson();
		
		Person personToUpdate = new Person();
		personToUpdate.setPersonName("Vasile");
		personToUpdate.setPersonId(13);
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		//personToUpdate.setPersonName("Ilie");
		session.update(personToUpdate);
		tx.commit();
		session.close();
		sessionFactory.close();
	}
	
	private static void delete(){
		//Person personToDelete = createPerson();
		
		Person personToDelete = new Person();
		personToDelete.setPersonName("Ilie");
		personToDelete.setPersonId(14);
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.delete(personToDelete);
		tx.commit();
		session.close();
		sessionFactory.close();
	}
	
	private static void createItem(){
		Item newItem = new Item();
		newItem.setItemName("Rachete badminton");
		
		StorageSpace currentStorageSpace = new StorageSpace();
		currentStorageSpace.setStorageSpaceId(2);
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date today = new Date();
		
		Person curentPerson1 = new Person();
		curentPerson1.setPersonId(10);
		Person curentPerson2 = new Person();
		curentPerson2.setPersonId(11);
		
		newItem.setStorageSpace(currentStorageSpace);
		newItem.setLastMove(today);
		newItem.getPerson().add(curentPerson1);
		newItem.getPerson().add(curentPerson2);
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(newItem);
		tx.commit();
		session.close();
		
	}
	
	private static void createStorageSpace(){
		StorageSpace newStorageSpace = new StorageSpace();
		newStorageSpace.setStorageSpaceName("Caiete facultate");
		
		StorageSpace parentStorageSpace = new StorageSpace();
		parentStorageSpace.setStorageSpaceId(1);
		
		newStorageSpace.setParent(parentStorageSpace);
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(newStorageSpace);
		tx.commit();
		session.close();
		//sessionFactory.close();
	}
	
	

}
