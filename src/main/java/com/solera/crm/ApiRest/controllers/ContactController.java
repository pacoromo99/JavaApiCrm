package com.solera.crm.ApiRest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.solera.crm.ApiRest.services.ContactService;

@RestController
@RequestMapping("/")
public class ContactController {
	@Autowired
	private ContactService contactService;

}
