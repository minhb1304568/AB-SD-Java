package model;

import javax.persistence.*;

@Entity
@Table(name = "UserLogin")
public class User {
	
	@Id
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;

	public User() {
	}

	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
