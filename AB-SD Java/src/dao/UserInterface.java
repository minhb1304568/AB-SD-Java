package dao;

import java.util.List;

import model.User;

public interface UserInterface {
	
	//return a user
	public User getUserByEmail(String mail);
	
	//delete a user
	public void deleteUser(User user);
	
	//insert a new user
	public void insertUser(User user);
	
	//Change user's password
	public void updatePassword(User user);
	
	//return list of user
	public List<User> getAllUser();
	
	//
	public boolean isExist(User user);
}
