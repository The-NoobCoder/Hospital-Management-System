package com.example.hospitalmanagementsystem.service;

import java.util.List;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hospitalmanagementsystem.entity.Patient;
import com.example.hospitalmanagementsystem.repository.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService {
	
	PatientRepository patientRepository;
	
	@Autowired
	public PatientServiceImpl(PatientRepository patientRepository) {
		super();
		this.patientRepository = patientRepository;
	}

	@Override
	public List<Patient> findAll() {
		// TODO Auto-generated method stub
		return patientRepository.findAll();
	}

	@Override
	public Patient findById(int patientId) {
		// TODO Auto-generated method stub
		Optional<Patient> optional=patientRepository.findById(patientId);
		Patient thePatient=null;
		if(optional.isPresent())
		{
			thePatient=optional.get();
		}
		else {
			throw new RuntimeException("Patient id not found :"+patientId);
		}
		return thePatient;
	}

	@Override
	public Patient save(Patient patient) {
		// TODO Auto-generated method stub
		patientRepository.save(patient);
		return patient;
	}

	@Override
	public String delete(int patientId) {
		// TODO Auto-generated method stub
		Patient patient=findById(patientId);
		if(patient != null) {
			patientRepository.deleteById(patientId);
		}
		return "deleted patient id "+patientId;
	}
	

}
