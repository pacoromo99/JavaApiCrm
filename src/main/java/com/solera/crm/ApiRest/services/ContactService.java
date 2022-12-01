package com.solera.crm.ApiRest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solera.crm.ApiRest.entities.Contact;
import com.solera.crm.ApiRest.repositories.ContactRepository;

@Service
public class ContactService {
	@Autowired
	private ContactRepository contactRepository;
	
	public void addContact(Contact contact) 
	{
		
	}

	public List<Contact> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
