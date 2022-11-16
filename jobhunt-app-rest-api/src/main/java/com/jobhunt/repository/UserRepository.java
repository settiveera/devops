package com.jobhunt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jobhunt.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

	public User findByEmailAndPassword(String email, String password);
	
	public User findByEmailAndUserName(String email, String userName);
}
