package com.jobhunt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.jobhunt.dto.UserCredentials;
import com.jobhunt.model.User;

@Service
public class UserClientServiceImpl implements UserClientService {
	
	@Autowired
	private RestTemplate userRestClient;
	
	@Value("${USER_REST_API_URL}")
	private String userRestApiUrl;
	
	@Value("${USER_REST_API_LOGIN}")
	private String userRestApiLogin;

	@Override
	public User addUser(User user) {
		User registeredUser = null;
		try {
			registeredUser = userRestClient.postForObject(userRestApiUrl, user, User.class);
		} catch (Exception ex) {
		}
		
		return registeredUser;
	}

	@Override
	public UserCredentials getUserByUserNameAndPassword(UserCredentials creds) {
		UserCredentials ucreds = null;
		try {
			ucreds = userRestClient.postForObject(userRestApiLogin, creds, UserCredentials.class);
		} catch (Exception ex) {
			
		}
		return ucreds;
	}

}
