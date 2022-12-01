package com.solera.crm.ApiRest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.solera.crm.ApiRest.entities.Contact;
import com.solera.crm.ApiRest.services.ContactService;

@RestController
@RequestMapping("/")
@CrossOrigin
public class ContactController {
	@Autowired
	private ContactService contactService;
	
	@PostMapping(path="/contact/new")
	public void addContact(@RequestBody Contact contact) 
	{
		//contactService.addContact(contact);
		
	}
	
	
	


}
