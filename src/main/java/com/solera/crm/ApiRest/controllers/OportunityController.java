package com.solera.crm.ApiRest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.solera.crm.ApiRest.entities.Oportunity;
import com.solera.crm.ApiRest.services.OportunityService;

@RestController
@RequestMapping("/")
@CrossOrigin
public class OportunityController {
	@Autowired
	private OportunityService oportunityService;
	
	@RequestMapping(path="/opportunity/new", method = RequestMethod.POST)
	public void addOportunity(@RequestBody Oportunity opportunity)
	{
		
	}

}
