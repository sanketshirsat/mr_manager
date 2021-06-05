package com.sanket.mrmanager.model;

import java.util.List;

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
public class MedicalRepresentative {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mrId;
	private String name;
	private String address;
	private String companyName;
	@OneToMany( fetch= FetchType.LAZY,  cascade = {CascadeType.ALL})
	@JoinColumn(name="mrId")
	private List<Drug> drug;
	
	
	public MedicalRepresentative() {
		super();
	}


	public MedicalRepresentative(int mrId, String name, String address, String companyName, List<Drug> drug) {
		super();
		this.mrId = mrId;
		this.name = name;
		this.address = address;
		this.companyName = companyName;
		this.drug = drug;
	}


	public int getMrId() {
		return mrId;
	}


	public void setMrId(int mrId) {
		this.mrId = mrId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public List<Drug> getDrug() {
		return drug;
	}


	public void setDrug(List<Drug> drug) {
		this.drug = drug;
	}


	@Override
	public String toString() {
		return "MedicalRepresentative [mrId=" + mrId + ", name=" + name + ", address=" + address + ", companyName="
				+ companyName + ", drug=" + drug + "]";
	}
	
}