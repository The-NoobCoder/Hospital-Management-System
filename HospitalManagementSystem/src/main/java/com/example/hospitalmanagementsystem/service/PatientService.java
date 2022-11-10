package com.example.hospitalmanagementsystem.service;

import java.util.List;

import com.example.hospitalmanagementsystem.entity.Patient;

public interface PatientService {


	public List<Patient> findAll();
	public Patient findById(int patientId);
	public Patient save(Patient patient);
	public String delete(int patientId);
	
}
