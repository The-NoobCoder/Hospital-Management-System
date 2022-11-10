package com.example.hospitalmanagementsystem.service;

import java.util.List;

import com.example.hospitalmanagementsystem.entity.Receptionist;

public interface ReceptionistService {

public List<Receptionist> findAll();
	
	public Receptionist findById(int receptionistId );
	
	public Receptionist save(Receptionist receptionist);
	
	public String delete(int receptionistId);
}
