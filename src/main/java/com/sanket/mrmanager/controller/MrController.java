package com.sanket.mrmanager.controller;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanket.mrmanager.model.MedicalRepresentative;
import com.sanket.mrmanager.service.MRService;

@RestController
public class MrController {

	@Autowired
	MRService medicalReserve;
	
	// To save the Medical Representative Details 
	@PostMapping("/save")
	public MedicalRepresentative savemedicalRe(@RequestBody MedicalRepresentative medicalRe) {
		System.out.println("Entering into MedicalRepresentative controller method with medicalRe "+medicalRe.toString());
		try {
			return medicalReserve.saveMedicalRepresentative(medicalRe);
		} catch (Exception e) {
			System.out.println("Exception in savemedicalRe method "+e);
			return null;
		}
	}
	
	//To get all Medical Representatives 
	@GetMapping("/getAllMedReps")
	public  List<MedicalRepresentative> getAllMedicalRepresentatives() throws Exception {
		System.out.println("Entering into getAllmedicalRes controller method");
		try {
			List<MedicalRepresentative> list=medicalReserve.getAllMRs();
           for(MedicalRepresentative element:list) {
        	   element.setDrug(null);
           }
			return medicalReserve.getAllMRs();
		} catch (Exception e) {
			System.out.println("Exception in getAllmedicalRes method "+e);
			return null;
		}
		
	}
	
	//To get specific Medical Representative on the basic of id
	@GetMapping(path ="/getMedRep/{medicalReId}")
	public MedicalRepresentative getMedicalRepresentative(@PathVariable("medicalReId") int medicalReId) {
		System.out.println("Entering into getMedicalRepresentative controller method with medicalRe Id "+medicalReId);
		try {
			return medicalReserve.getMR(medicalReId);
		} catch (Exception e) {
			System.out.println("Exception in getmedicalRe controller method "+e);
			return null;
		}
		
	}
	
	//To update specific Medical Representative on the basic of id
	@PutMapping(path="/update/{medicalReId}")
	public MedicalRepresentative updateMedicalRepresentative(@PathVariable("medicalReId")int medicalReId,@RequestBody MedicalRepresentative medicalRe) {
		System.out.println("Entering into updatemedicalRe controller method with medicalRe Id "+medicalReId);
		try {
			return medicalReserve.updateMR(medicalRe);
		} catch (Exception e) {
			System.out.println("Exception in updatemedicalRe controller method "+e);
			return null;
		}
		
	}
	
	//To delete medical Representative details
	@DeleteMapping(path="/delete/{medicalReId}")
	public void deleteMedicalRepresentative(@PathVariable("medicalReId")int medicalReId) {
		 
		 System.out.println("Entering into deletemedicalRe controller method with medicalRe Id "+medicalReId);
			try {
				medicalReserve.deleteMR(medicalReId);
			} catch (Exception e) {
				System.out.println("Exception in deletemedicalRe controller method "+e);
			}
			
		 
	}
}
