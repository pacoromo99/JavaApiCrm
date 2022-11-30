package com.solera.crm.ApiRest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.solera.crm.ApiRest.entities.Oportunity;

@Repository
public interface OportunityRepository extends JpaRepository<Oportunity, Integer>   
{

	Oportunity findByEmail(String email);
}
