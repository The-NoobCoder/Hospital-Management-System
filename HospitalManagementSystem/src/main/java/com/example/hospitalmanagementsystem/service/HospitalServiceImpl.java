package com.example.hospitalmanagementsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hospitalmanagementsystem.entity.Hospital;
import com.example.hospitalmanagementsystem.repository.HospitalRepository;


@Service
public class HospitalServiceImpl  implements HospitalService{
	
	HospitalRepository hospitalRepository;
	
	
	@Autowired
	public HospitalServiceImpl(HospitalRepository hospitalRepository) {
		super();
		this.hospitalRepository = hospitalRepository;
	}



	@Override
	public List<Hospital> findAll() {
		// TODO Auto-generated method stub
		return hospitalRepository.findAll();
	}



	@Override
	public Hospital save(Hospital hospital) {
		// TODO Auto-generated method stub
		hospitalRepository.save(hospital);
		return hospital;
	}



	@Override
	public Hospital findById(int hosId) {
		// TODO Auto-generated method stub
		Optional<Hospital>optional=hospitalRepository.findById(hosId);
		Hospital hospital=null;
		if(optional.isPresent())
		{
			hospital=optional.get();
		}
		else {
			throw new RuntimeException("hospital id is not present :"+hosId);
		}
		
		return hospital;
	}

	
	
	/*@Override
	//public List<Hospital> findAllByOrderByCityDesc() {
		// TODO Auto-generated method stub
		List<Hospital> sortByDesc=hospitalRepository.findAllHospitalByCityInDesc();
		if(sortByDesc.size()==0)
		{
			throw new RuntimeException("Hospital list is empty !!!");
		}
		return sortByDesc;
	}
*/
	

}
