package com.jobhunt.service;

import com.jobhunt.dto.UserCredentials;
import com.jobhunt.model.User;

public interface UserClientService {
	
	public User addUser(User user);
	
	public UserCredentials getUserByUserNameAndPassword(UserCredentials creds);
}
