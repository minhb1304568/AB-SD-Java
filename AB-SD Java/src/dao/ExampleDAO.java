package dao;

import java.util.List;

import hibernate.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

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

	@Override
	public void insertEntity(Object Entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEntity(Object Entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEntity(Object Entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getEntityByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> getAllEntity() {
		// TODO Auto-generated method stub
		return null;
	}

}
