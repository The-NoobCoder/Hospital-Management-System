package com.example.hospitalmanagementsystem.service;
import java.util.List;

import com.example.hospitalmanagementsystem.entity.Doctor;

public interface DoctorService {
	public List<Doctor> findAll();
	
	public Doctor findById(int docterId );
	
	public Doctor save (Doctor doctor);
	
	public String delete(int docterId);

}
