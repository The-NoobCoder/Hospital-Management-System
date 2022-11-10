package com.example.hospitalmanagementsystem.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospitalmanagementsystem.entity.Hospital;
import com.example.hospitalmanagementsystem.service.HospitalService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class HospitalRestController {
	
	private HospitalService hospitalService;

	@Autowired
	public HospitalRestController(HospitalService hospitalService) {
		super();
		this.hospitalService = hospitalService;
	}
	
	@GetMapping("/hospital")
	public  List<Hospital> findAll()
	{
		return hospitalService.findAll();
	}
	
	@GetMapping("/hospital/{hosId}")
	public Hospital getHospitalById(@PathVariable int hosId)
	{
		Hospital  hospital=hospitalService.findById(hosId);
		return hospital;
	}
	
	@PostMapping("/hospital")
	public Hospital addHospital(@RequestBody Hospital hospital) 
	{
		hospital.setHosId(0);
		
		hospitalService.save(hospital);
		return hospital;
		
	}
	@PutMapping("/hospital")
	public Hospital updateHospital(@RequestBody Hospital hospital)
	{
		hospitalService.save(hospital);
		return hospital;
		
	}
	/*@GetMapping("/byDesc")
	public List<Hospital>findAllByOrderByCityDesc()
	{
		List<Hospital> sordedByDesc=hospitalService.findAllByOrderByCityDesc();
		return sordedByDesc;
	}*/
	

}
