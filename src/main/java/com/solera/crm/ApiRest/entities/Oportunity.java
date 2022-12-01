package com.solera.crm.ApiRest.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Oportunity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String email;
	private Date creationDate;
	private Boolean isClient;
	private String description;
	
	public Oportunity() {}

	public Oportunity(Integer id, String name, String email, Date creationDate, Boolean isClient, String description) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.creationDate = creationDate;
		this.isClient = isClient;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Boolean getIsClient() {
		return isClient;
	}

	public void setIsClient(Boolean isClient) {
		this.isClient = isClient;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Oportunity [id=" + id + ", name=" + name + ", email=" + email + ", creationDate=" + creationDate
				+ ", isClient=" + isClient + ", description=" + description + "]";
	}

	
	

}
