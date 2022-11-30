package com.solera.crm.ApiRest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.solera.crm.ApiRest.entities.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer>  {

}
