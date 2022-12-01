package com.solera.crm.ApiRest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.solera.crm.ApiRest.entities.Contact;
import com.solera.crm.ApiRest.entities.Oportunity;
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
		contactService.addContact(contact);
		
	}
	
	@GetMapping(path="/contact")
	public List<Contact> getAllContact()
	{
		return contactService.findAll();
		
	}
	
	
	


}
