package com.solera.crm.ApiRest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solera.crm.ApiRest.entities.Oportunity;
import com.solera.crm.ApiRest.repositories.OportunityRepository;

@Service
public class OportunityService {
	@Autowired
	private OportunityRepository oportunityRepository;

	public void addOportunity(Oportunity oportunity) 
	{
		if(findByEmail(oportunity.getEmail())==null) 
		{
			oportunityRepository.save(oportunity);
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
