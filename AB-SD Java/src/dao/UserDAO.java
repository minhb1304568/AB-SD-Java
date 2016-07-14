package dao;

import java.util.Iterator;
import java.util.List;

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

	//get user by email
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
		
//		dao.insertUser(new User("hoikhin@gmail.com", "tuancamcam"));
//		dao.insertUser(new User("khin@gmail.com", "tuancamcam"));
//		dao.insertUser(new User("khinkhin@gmail.com", "tuancamcam"));
//		dao.insertUser(new User("khinkhinkhin@gmail.com", "tuancamcam"));
		dao.getAllUser2();
//		User user = dao.getUserByEmail("tuankhung@gmail.com");
//		System.out.println(user.getEmail() + " " + user.getPassword());
//		user.setPassword("joiuoiiouoi");
//		//dao.updatePassword(user);
//		System.out.println(user.getEmail() + " " + user.getPassword());
	}

	//Delete user
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

	//insert user
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
	
	//Change user's password
	@Override
	public void updatePassword(User user) {
		try {
			openSessionWithBeginTransaction();
			
			//Find and Delete old email
			User oldUser = (User) session.get(User.class, user.getEmail());
			session.delete(oldUser);
			
			//Create a new email
			session.saveOrUpdate(user);
			
			commit(); 
		} catch (HibernateException e) {
			System.out.println("Failed when to update User!");
			e.printStackTrace();
			rollback();
		} finally {
			closeSession();
		}
		
	}

	//return list user
	@Override
	public List<User> getAllUser() {
		try {
			openSessionWithBeginTransaction();
			List<User> user = session.createQuery("from User").list();//chua hieu
			for(Iterator<User> iterator=user.iterator();iterator.hasNext();){ //chua hieu tooo
				User em = (User)iterator.next();
				System.out.println(em.getEmail());
			}
			commit();
			return user;
		} catch (HibernateException e) {
			System.out.println("Failed when to get list User!");
			e.printStackTrace();
			rollback();
		} finally {
			closeSession();
		}
		return null;
	}
	
	public List<User> getAllUser2() {
		try {
			openSessionWithBeginTransaction();
			
			@SuppressWarnings("unchecked")
			List<User> user = session.createCriteria(User.class).list();
			
			for (User user2 : user) {
				System.out.println(user2.getEmail());
			}
			
			commit();
			return user;
		} catch (HibernateException e) {
			System.out.println("Failed when to get list User!");
			e.printStackTrace();
			rollback();
		} finally {
			closeSession();
		}
		return null;
	}

}
