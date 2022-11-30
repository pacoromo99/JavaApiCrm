package com.solera.crm.ApiRest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solera.crm.ApiRest.repositories.ContactRepository;

@Service
public class ContactService {
	@Autowired
	private ContactRepository contactRepository;

}
