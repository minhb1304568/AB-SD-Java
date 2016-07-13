package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernate.HibernateUtil;
import model.User;

public class UserDAO implements UserInterface{
	
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
	public User getUserByEmail(String mail) {
		try {
			openSession();
			User user = (User) session.get(User.class, mail);
			return user;
		} catch (HibernateException e) {
			System.out.println("Failed when to delete User!");
			e.printStackTrace();
		} finally {
			closeSession();
		}	
		
		return null;
	}
	
	public static void main(String[] args) {
		UserDAO dao = new UserDAO();
		
		dao.insertUser(new User("tuankhung@gmail.com", "tuancamcam"));
		
		User user = dao.getUserByEmail("tuankhung@gmail.com");
		
		System.out.println(user.getEmail() + " " + user.getPassword());
	}

	@Override
	public void deleteUser(User user) {
		try {
			openSessionWithBeginTransaction();
			session.delete(user);
			commit();
		} catch (HibernateException e) {
			System.out.println("Failed when to delete User!");
			e.printStackTrace();
			rollback();
		} finally {
			closeSession();
		}
	}

	@Override
	public void insertUser(User user) {
		try {
			openSessionWithBeginTransaction();
			session.saveOrUpdate(user);
			commit();
		} catch (HibernateException e) {
			System.out.println("Failed when to insert User!");
			e.printStackTrace();
			rollback();
		} finally {
			closeSession();
		}
	}

}
