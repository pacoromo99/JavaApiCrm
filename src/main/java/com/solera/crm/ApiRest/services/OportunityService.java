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

	public void addOportunity(Oportunity oportunity) {
		// TODO Auto-generated method stub
		
	}

	public List<Oportunity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Oportunity findByEmail(String email) {
		return null;
		// TODO Auto-generated method stub
		
	}

}
