package com.solera.crm.ApiRest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solera.crm.ApiRest.entities.Contact;
import com.solera.crm.ApiRest.entities.Oportunity;
import com.solera.crm.ApiRest.repositories.ContactRepository;
import com.solera.crm.ApiRest.repositories.OportunityRepository;

@Service
public class OportunityService {
	@Autowired
	private OportunityRepository oportunityRepository;
	
	@Autowired
	private ContactRepository contactRepository;

	public void addOportunity(Oportunity oportunity) 
	{
		System.out.println(oportunity.getCreationDate());
		if(findByEmail(oportunity.getEmail())==null) 
		{
			oportunityRepository.save(oportunity);
			Oportunity guardada = findByEmail(oportunity.getEmail());
			Contact firstContact = new  Contact("email", guardada.getCreationDate(), guardada.getDescription(), guardada);
			contactRepository.save(firstContact);
		}	
	}

	public List<Oportunity> findAll() 
	{
		return oportunityRepository.findAll();
	}

	public Oportunity findByEmail(String email) {
		return oportunityRepository.findByEmail(email);
		// TODO Auto-generated method stub
		
	}

}
