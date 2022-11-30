package com.solera.crm.ApiRest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.solera.crm.ApiRest.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>
{
	User findByEmail(String email);

}
