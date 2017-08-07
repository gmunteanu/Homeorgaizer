package com.training.homeorganizer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.jboss.logging.Logger;

import com.training.homeorganizer.resources.InitSessionFactory;
import com.training.homeorganizer.resources.Person;

public class StartHomeOrganizerApp {
	private static Logger log = Logger.getLogger(StartHomeOrganizerApp.class);
	
	private static SessionFactory sessionFactory = InitSessionFactory.getInstance();
	
	public static void main (String[] args){
		/* clean tables*/
		//clean();
		
		/* simple create example */
		createPerson();
		
		/* relation example */
		//createRelation();
		
		/* delete example */
		//delete();
		
		/* update example */
		update();
		
		/* query example */
		//query();
	}
	
	
	private static Person createPerson(){
		Person newPerson = new Person();
		newPerson.setPersonName("Mihai");
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(newPerson);
		tx.commit();
		session.close();
		return newPerson;
	}
	
	private static void update(){
		Person newPerson = createPerson();
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		newPerson.setPersonName("Ilie");
		session.update(newPerson);
		tx.commit();
		session.close();
	}
	
	private static void delete(){
		Person newPerson = createPerson();
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.delete(newPerson);
		tx.commit();
		session.close();
	}
	
	

}
