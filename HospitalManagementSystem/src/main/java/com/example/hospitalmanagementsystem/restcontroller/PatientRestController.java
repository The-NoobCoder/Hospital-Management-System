package com.example.hospitalmanagementsystem.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospitalmanagementsystem.entity.Patient;

import com.example.hospitalmanagementsystem.service.PatientService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class PatientRestController {
	
	private PatientService patientService;

	@Autowired
	public PatientRestController(PatientService patientService) {
		super();
		this.patientService = patientService;
	}
	
	@GetMapping("/patient")
	public List<Patient> findAll()
	{
		return patientService.findAll();
	}
	@GetMapping("/patient/{patientId}")
	public Patient  getPateintById(@PathVariable int patientId)
	{
		Patient patient=patientService.findById(patientId);
		return patient;
		
	}
	@PostMapping("/patient")
	public String addPatient(@RequestBody Patient patient)
	{
		patient.setId(0);
		patientService.save(patient);
		
		return "Registration completed successfully";
	}
	
	@PutMapping("/patient")
	public Patient updatePatient(@RequestBody Patient patient)
	{
		patientService.save(patient);
		return patient;
	}
	@DeleteMapping("/patient/{patientId}")
	public String deletePatient(@PathVariable int patientId )
	{
		String message=patientService.delete(patientId);
		return message;
	}

}
