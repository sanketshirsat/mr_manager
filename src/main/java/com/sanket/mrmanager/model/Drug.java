package com.sanket.mrmanager.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Drug {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int drugId;
	private String name;
	private String description;
	private String category;
	
	@ManyToOne(fetch= FetchType.LAZY,  cascade = {CascadeType.ALL})
	@JoinColumn(name="mrId")
	private MedicalRepresentative mrId;
	public Drug() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Drug(int drugId, String name, String description, String category) {
		super();
		this.drugId = drugId;
		this.name = name;
		this.description = description;
		this.category = category;
	}
	public int getDrugId() {
		return drugId;
	}
	public void setDrugId(int drugId) {
		this.drugId = drugId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Drug [drugId=" + drugId + ", name=" + name + ", description=" + description + ", category=" + category
				+ "]";
	}
	

}
