package com.athyamsha.thrillio.managers;

import com.athyamsha.thrillio.entities.User;

public class UserManagers {
	private static UserManagers instance = new UserManagers();

	private UserManagers() {

	}

	public static UserManagers getInstance() {
		return instance;
	}

	public User createUser(long id, String email, String password, String firstName, String lastName, String password, int gender, String userType) {
		User user = new User();
		user.setId(id);
		user.setEmail(email);
		user.setPassword(password);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setPassword(password);
		user.setGender(gender);
		user.setUserType(userType);
		
		return user;
	}
}
