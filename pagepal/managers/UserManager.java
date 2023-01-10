package com.bookmarkingsite.pagepal.managers;

import java.util.List;

import com.bookmarkingsite.pagepal.dao.UserDao;
import com.bookmarkingsite.pagepal.entities.User;

public class UserManager {
	private static UserManager instance = new UserManager();
	private static UserDao dao = new UserDao();

	private UserManager() {
	}

	public static UserManager getInstance() { // returns single instance of usermanager
		return instance;
	}

	public User createUser(long id, String email, String password, String firstName, String lastName, int gender,
			String userType) {
		User user = new User();
		user.setId(id);
		user.setEmail(email);
		user.setPassword(password);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setGender(gender);
		user.setUserType(userType);
		
		return user;	
	}
	
	public List<User> getUsers() {
		return dao.getUsers();
	}
}
