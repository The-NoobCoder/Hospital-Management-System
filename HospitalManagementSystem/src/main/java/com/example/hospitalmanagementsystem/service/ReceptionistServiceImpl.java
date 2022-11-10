package com.example.hospitalmanagementsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.hospitalmanagementsystem.entity.Receptionist;
import com.example.hospitalmanagementsystem.repository.ReceptionistRepository;

@Service
public class ReceptionistServiceImpl implements ReceptionistService{

	
	ReceptionistRepository receptionistRepository;
	
   @Autowired
   public ReceptionistServiceImpl(ReceptionistRepository receptionistRepository) {
		super();
		this.receptionistRepository = receptionistRepository;
	}
	
   @Override
	public List<Receptionist> findAll() {
		return receptionistRepository.findAll();
	}

	
	@Override
	public Receptionist findById(int receptionistId) {
		Optional<Receptionist> optional = receptionistRepository.findById(receptionistId);
		Receptionist theReceptionist = null;
		if(optional.isPresent()) {
			theReceptionist = optional.get();
		}
		else {
			throw new RuntimeException("Receptionist id not found : " +receptionistId);
		}
		return theReceptionist;
	}
	@Override
	public Receptionist save(Receptionist receptionist) {
		receptionistRepository.save(receptionist);
		return receptionist;
	}
	@Override
	public String delete(int receptionistId) {
		Receptionist receptionist = findById(receptionistId);
		if(receptionist != null) {
			receptionistRepository.deleteById(receptionistId);
		}
		return "Delete doctor id " +receptionistId;
	}
}
