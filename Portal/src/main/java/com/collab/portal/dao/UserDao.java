package com.collab.portal.dao;

import java.util.List;

import com.collab.portal.model.User;

public interface UserDao {
	
	User authenticate(User user);
	void updateUser(User user);
	User registerUser(User user);
	public List<User> getAllUsers(User user);

}
