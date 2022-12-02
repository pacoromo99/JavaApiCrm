package com.solera.crm.ApiRest.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.solera.crm.ApiRest.entities.Oportunity;

@SpringBootTest
class OportunityServiceTest {
	
	@Autowired
	private OportunityService service;
	@Test
	void testAddOportunity() 
	{
		Date date = new Date();
		Oportunity oportunity = new Oportunity();
		oportunity.setName("solera");
		oportunity.setEmail("pepe@solera.com");
		oportunity.setCreationDate(date);
		oportunity.setIsClient(true);
		oportunity.setDescription("aasdadad");
		Oportunity oportunityResult = service.findByEmail(oportunity.getEmail());
		assertEquals(null, oportunityResult);
		List<Oportunity> listado = service.findAll();
		int tamaño = listado.size();
		service.addOportunity(oportunity);
		assertEquals(tamaño + 1,  service.findAll().size());
	}
	
	void testAddClient() 
	{
		Date date = new Date();
		Oportunity oportunity = new Oportunity();
		oportunity.setName("solera");
		oportunity.setEmail("pepe@solera.com");
		oportunity.setCreationDate(date);
		oportunity.setIsClient(false);
		oportunity.setDescription("aasdadad");
		List<Oportunity> listado = service.findByClientsTrue();
		int tamaño = listado.size();
		service.addClient(oportunity.getId());
		assertEquals(tamaño + 1,  service.findByClientsTrue().size());
	}
}
