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

import com.example.hospitalmanagementsystem.entity.Doctor;
import com.example.hospitalmanagementsystem.service.DoctorService;


@RestController
@RequestMapping("/api/doctor")
@CrossOrigin(origins = "http://localhost:4200")
public class DoctorRestController {
	
private DoctorService doctorService;
	
	@Autowired
	public DoctorRestController(DoctorService doctorService) {
		super();
		this.doctorService = doctorService;
	}

	@GetMapping("/doctor")
	public List<Doctor> findAll()
	{
		return doctorService.findAll();
	}
	@GetMapping("/doctor/{doctorId}")
	public Doctor  getDoctorById(@PathVariable int doctorId)
	{
		Doctor doctor = doctorService.findById(doctorId);
		return doctor;
		
	}
	@PostMapping("/doctor")
	public String addDoctor(@RequestBody Doctor doctor)
	{
		doctor.setId(0);
		doctorService.save(doctor);
		
		return "Registration completed successfully";
	}
	
	@PutMapping("/doctor")
	public Doctor updateDoctor(@RequestBody Doctor doctor)
	{
		doctorService.save(doctor);
		return doctor;
	}
	@DeleteMapping("/doctor/{doctorId}")
	public String deleteDoctor(@PathVariable int doctorId )
	{
		String message=doctorService.delete(doctorId);
		return message;
	}

}
