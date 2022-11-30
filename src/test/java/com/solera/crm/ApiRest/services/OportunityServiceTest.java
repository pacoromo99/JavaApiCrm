package com.solera.crm.ApiRest.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.solera.crm.ApiRest.entities.Oportunity;

class OportunityServiceTest {
	@Autowired
	private OportunityService service;
	@Test
	void testAddOportunity() 
	{
		Oportunity oportunity = new Oportunity();
		Oportunity oportunityResult = service.findByEmail(oportunity.getEmail());
		assertEquals(null, oportunityResult);
		List<Oportunity> listado = service.findAll();
		int tamaño = listado.size();
		service.addOportunity(oportunity);
		assertEquals(tamaño++,  service.findAll().size());
	}


}
