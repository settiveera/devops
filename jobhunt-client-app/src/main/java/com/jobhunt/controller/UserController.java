package com.jobhunt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.jobhunt.dto.UserCredentials;
import com.jobhunt.model.User;
import com.jobhunt.service.UserClientServiceImpl;

@Controller
public class UserController {
	
	@Autowired
	private UserClientServiceImpl service;
	
	@PostMapping("/register-user")
	public String saveUser(@ModelAttribute("user") User user,Model m) {
		User addUser = service.addUser(user);
		if(addUser == null) {
			m.addAttribute("errorMsg", "UserName/Email already registered !!!!");
			return "register.jsp";
		}
		
		return "login.jsp";
	}
	
	@PostMapping("/authenticate")
	public String authenticateUser(@ModelAttribute("creds") UserCredentials creds,Model m) {
		UserCredentials users = service.getUserByUserNameAndPassword(creds);
		if(users == null) {
			m.addAttribute("errorMsg", "Invalid Email/Password");
			return "login.jsp";
		}
		return "index.jsp";
		
	}
}
