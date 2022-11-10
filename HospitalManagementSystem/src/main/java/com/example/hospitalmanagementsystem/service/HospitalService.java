package com.example.hospitalmanagementsystem.service;

import java.util.List;

import com.example.hospitalmanagementsystem.entity.Hospital;

public interface HospitalService {
	
	public  List<Hospital> findAll();
	public Hospital save(Hospital hospital);
	//public  List<Hospital> findAllByOrderByCityDesc();
	public Hospital findById(int hosId);
	
	

}
