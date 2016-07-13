package dao;

import model.User;

public interface UserInterface {

	public User getUserByEmail(String mail);
	
	public void deleteUser(User user);
	
	public void insertUser(User user);
	
}
