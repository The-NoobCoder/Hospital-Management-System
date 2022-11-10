package com.example.hospitalmanagementsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hospitalmanagementsystem.entity.Doctor;
import com.example.hospitalmanagementsystem.repository.DoctorRepository;

@Service
public class DoctorServiceImpl  implements DoctorService{

	DoctorRepository doctorRepository;
	

	@Autowired
	public DoctorServiceImpl(DoctorRepository doctorRepository) {
		super();
		this.doctorRepository = doctorRepository;
	}

	@Override
	public List<Doctor> findAll() {
		return doctorRepository.findAll();
	}

	@Override
	public Doctor findById(int docterId) {
		Optional<Doctor> optional = doctorRepository.findById(docterId);
		Doctor theDoctor = null;
		if(optional.isPresent()) {
			theDoctor = optional.get();
		}
		else {
			throw new RuntimeException("Doctor id not found : " +docterId);
		}
		return theDoctor;
	}

	@Override
	public Doctor save (Doctor doctor) {
		doctorRepository.save(doctor);
		return doctor;
		
	}

	@Override
	public String delete(int docterId) {
		Doctor doctor = findById(docterId);
		if(doctor != null) {
			doctorRepository.deleteById(docterId);
		}
		return "Delete doctor id " +docterId;
	}
	
	
}
