package com.solera.crm.ApiRest.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
		System.out.println(opportunity.toString());
		oportunityService.addOportunity(opportunity);
		
	}
	
	@GetMapping(path="/opportunity")
	public List<Oportunity> getAllOportunity()
	{
		return oportunityService.findAll();
		
	}
	
	public Optional<Oportunity> findById(int id) 
	{
		return oportunityService.findById(id);
	}
	
	@GetMapping(path="/opportunityIsNotClient")
	public List<Oportunity> getAllOportunityIsNotClient()
	{
		return oportunityService.findByClientsFalse();
		
	}
	
	@GetMapping(path="/opportunityIsClient")
	public List<Oportunity> getAllOportunityIsClient()
	{
		return oportunityService.findByClientsTrue();
		
	}
}
