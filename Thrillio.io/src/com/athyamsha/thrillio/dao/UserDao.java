package com.athyamsha.thrillio.dao;

import com.athyamsha.thrillio.DataStore;
import com.athyamsha.thrillio.entities.User;

public class UserDao {
	public User[] getUsers() {
		return DataStore.getUsers();
	}
}
