package dao;

import java.util.List;

import hibernate.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

// Implements và định nghĩa lại các phương thức của ExampleInterface

public class ExampleDAO implements ExampleInterface{

	private Session session;
	private Transaction transaction;
	
	public void openSession() {
		session = HibernateUtil.getSessionFactory().openSession();
	}
	
	public void openSessionWithBeginTransaction() {
		session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.beginTransaction();
	}
	
	public void commit() {
		transaction.commit();
	}
	
	public void rollback() {
		transaction.rollback();
	}
	
	public void closeSession () {
		session.close();
	}

	// Khu vực Overwrite 
	
	@Override
	public void insertEntity(Object Entity) {
		
	}

	@Override
	public void deleteEntity(Object Entity) {
		
	}

	@Override
	public void updateEntity(Object Entity) {
		
	}

	@Override
	public Object getEntityByName(String name) {
		return null;
	}

	@Override
	public List<Object> getAllEntity() {
		return null;
	}
	
}
