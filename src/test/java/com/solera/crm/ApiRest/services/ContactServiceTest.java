package com.solera.crm.ApiRest.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.solera.crm.ApiRest.entities.Contact;
import com.solera.crm.ApiRest.entities.Oportunity;

@SpringBootTest
class ContactServiceTest {
	@Autowired
	private ContactService service;
	
	@Autowired
	private OportunityService serviceOportunity;

	@Test
	void testAddContact() 
	{
		Date date = new Date();
		Oportunity oportunity = serviceOportunity.findById(27).get();
		int tamaño  = service.findAll().size();
		Contact contact = new Contact();
		contact.setType("email");
		contact.setDate(date);
		contact.setDescription("reunion");
		contact.setOportunity(oportunity);
		service.addContact(contact);
		tamaño = tamaño +1;
		assertEquals(tamaño,  service.findAll().size());
	}
}
