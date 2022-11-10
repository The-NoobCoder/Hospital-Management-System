package com.example.hospitalmanagementsystem.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hospitalmanagementsystem.entity.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital, Integer> {

	//Optional<Hospital> findById(int hosId);

	

	//public List<Hospital> findAllHospitalByCityInDesc();
}
