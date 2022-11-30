package com.solera.crm.ApiRest.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Contact 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String type;
	private LocalDate date;
	private String description;	
	
	@ManyToOne
	@JoinColumn(name="idOportunity")
	private Oportunity oportunity;
	
	public Contact() {}

	public Contact(Integer id, String type, LocalDate date, String description,
			Oportunity oportunity) {
		super();
		this.id = id;
		this.type = type;
		this.date = date;
		this.description = description;
		this.oportunity = oportunity;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

	public Oportunity getOportunity() {
		return oportunity;
	}

	public void setOportunity(Oportunity oportunity) {
		this.oportunity = oportunity;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", type=" + type + ", date=" + date + ", description=" + description
				 + ", oportunity=" + oportunity + "]";
	}
	
	

}
