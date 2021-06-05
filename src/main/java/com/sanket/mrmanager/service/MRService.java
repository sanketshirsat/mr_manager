package com.sanket.mrmanager.service;

import java.util.List;

import com.sanket.mrmanager.model.MedicalRepresentative;


public interface MRService {

	MedicalRepresentative saveMedicalRepresentative(MedicalRepresentative medRep) throws Exception;
	List<MedicalRepresentative> getAllMRs() throws Exception;
	MedicalRepresentative getMR(int mrId) throws Exception;
	MedicalRepresentative updateMR(MedicalRepresentative medRep) throws Exception;
	void deleteMR(int mrId) throws Exception;
}
