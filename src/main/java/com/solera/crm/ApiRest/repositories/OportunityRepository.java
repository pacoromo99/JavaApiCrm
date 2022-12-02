package com.solera.crm.ApiRest.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.solera.crm.ApiRest.entities.Oportunity;

@Repository
public interface OportunityRepository extends JpaRepository<Oportunity, Integer>   
{
	Oportunity findByEmail(String email);
	
	@Query(value="SELECT * FROM oportunity p where p.is_client = 0", nativeQuery=true)
	List<Oportunity> findByClientsFalse();
	
	@Query(value="SELECT * FROM oportunity p where p.is_client = 1", nativeQuery=true)
	List<Oportunity> findByClientsTrue();
	
	@Query(value="UPDATE oportunity p set p.is_client = 1 where p.id = :id", nativeQuery=true)
	void addClient(int id);
	
}
