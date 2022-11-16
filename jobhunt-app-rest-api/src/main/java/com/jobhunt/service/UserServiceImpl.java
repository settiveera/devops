package com.jobhunt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobhunt.exception.InvalidCredentialsException;
import com.jobhunt.model.User;
import com.jobhunt.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository repo;

	@Override
	public User addUser(User user) {
		if(repo.findByEmailAndUserName(user.getEmail(), user.getUserName()) != null) {
			throw new InvalidCredentialsException("User Already Exists");
		}
		User savedUser = repo.save(user);
		
		return hidePassword(savedUser);
	}

	@Override
	public User getUserByEmailAndPassword(String email, String password) {
		User user = repo.findByEmailAndPassword(email, password);
		if(user == null) {
			throw new InvalidCredentialsException("Invalid Username/Password");
		}
		return hidePassword(user);
	}
	
	private User hidePassword(User user) {
		user.setPassword("##########");
		return user;
	}

	@Override
	public User getUserByEmailAndUserName(String email, String userName) {
		return repo.findByEmailAndUserName(email, userName);
	}
	
	

}
