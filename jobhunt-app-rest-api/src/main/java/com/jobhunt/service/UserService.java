package com.jobhunt.service;

import com.jobhunt.model.User;

public interface UserService {
	
	public User addUser(User user);
	
	public User getUserByEmailAndPassword(String email, String password);
	
	public User getUserByEmailAndUserName(String email,String userName);
}
