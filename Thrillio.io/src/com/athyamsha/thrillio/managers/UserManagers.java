package com.athyamsha.thrillio.managers;

import com.athyamsha.thrillio.dao.UserDao;
import com.athyamsha.thrillio.entities.User;

public class UserManagers {
	private static UserManagers instance = new UserManagers();
	private static UserDao dao = new UserDao();

	private UserManagers() {

	}

	public static UserManagers getInstance() {
		return instance;
	}

	public User createUser(long id, String email, String firstName, String lastName, String password, int gender,
			String userType) {
		User user = new User();
		user.setId(id);
		user.setEmail(email);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setPassword(password);
		user.setGender(gender);
		user.setUserType(userType);

		return user;
	}
	
	public User[] getUsers() {
		return dao.getUsers();
	}
}
