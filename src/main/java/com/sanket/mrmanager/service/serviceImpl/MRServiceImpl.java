package com.sanket.mrmanager.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanket.mrmanager.model.MedicalRepresentative;
import com.sanket.mrmanager.repository.MrRepository;
import com.sanket.mrmanager.service.MRService;

@Service
public class MRServiceImpl implements MRService{

	@Autowired
	MrRepository mrRepo;
	
	@Override
	public MedicalRepresentative saveMedicalRepresentative(MedicalRepresentative medRep) throws Exception {
		return mrRepo.save(medRep);
	}

	@Override
	public List<MedicalRepresentative> getAllMRs() throws Exception {
		return mrRepo.findAll();
	}

	@Override
	public MedicalRepresentative getMR(int mrId) throws Exception {
		return mrRepo.findById(mrId).get();
	}

	@Override
	public MedicalRepresentative updateMR(MedicalRepresentative medRep) throws Exception {
		return mrRepo.save(medRep);
	}

	@Override
	public void deleteMR(int mrId) throws Exception {
		mrRepo.deleteById(mrId);
		
	}

}
