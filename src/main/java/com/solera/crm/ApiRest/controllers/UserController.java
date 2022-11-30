package com.solera.crm.ApiRest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.solera.crm.ApiRest.entities.User;
import com.solera.crm.ApiRest.services.UserService;

@RestController
@RequestMapping("")
@CrossOrigin
public class UserController 
{
	@Autowired
	private UserService userService;
	
	@RequestMapping(path="/login", method = RequestMethod.POST)
	public ResponseEntity<String> checkUser(@RequestBody User user)
	{
		return userService.checkUser(user);
	}
}
