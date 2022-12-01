package com.solera.crm.ApiRest.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.solera.crm.ApiRest.entities.Contact;
import com.solera.crm.ApiRest.entities.Oportunity;

class ContactServiceTest {
	@Autowired
	private ContactService service;

	@Test
	void testAddContact() 
	{
		Date date = new Date();
		Oportunity oportunity = new Oportunity();
		oportunity.setId(1);
		oportunity.setName("solera");
		oportunity.setEmail("pepe@solera.com");
		oportunity.setCreationDate(date);
		oportunity.setIsClient(true);
		oportunity.setDescription("aasdadad");
		List<Contact> listado = service.findAll();
		int tamaño = listado.size();
		Contact contact = new Contact();
		contact.setType("email");
		contact.setDate(date);
		contact.setDescription("reunion");
		contact.setOportunity(oportunity);
		service.addContact(contact);
		assertEquals(tamaño + 1,  service.findAll().size());
	}
}
