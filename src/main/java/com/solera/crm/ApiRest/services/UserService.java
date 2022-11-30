package com.solera.crm.ApiRest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.solera.crm.ApiRest.entities.User;
import com.solera.crm.ApiRest.repositories.UserRepository;

@Service
public class UserService  {

	@Autowired
	private UserRepository userRepository;

	public User getUserByEmail(String email) 
	{	
		return userRepository.findByEmail(email);
	}
	
	public ResponseEntity<String> checkUser(@RequestBody User user)
	{
		User login = getUserByEmail(user.getEmail());
		if((login != null)&&(login.getPassword().equals(user.getPassword()))) 
		{
			return ResponseEntity.status(HttpStatus.OK).body("OK");
		}

		return ResponseEntity.status(HttpStatus.FORBIDDEN).body("");
	}

}





