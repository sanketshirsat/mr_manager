package com.sanket.mrmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanket.mrmanager.model.MedicalRepresentative;

public interface DrugRepository extends JpaRepository<MedicalRepresentative, Integer>{

}
