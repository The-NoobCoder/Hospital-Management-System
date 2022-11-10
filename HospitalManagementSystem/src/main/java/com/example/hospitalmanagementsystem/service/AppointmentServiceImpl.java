package com.example.hospitalmanagementsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hospitalmanagementsystem.entity.Appointment;
import com.example.hospitalmanagementsystem.repository.AppointmentRepository;

@Service
public class AppointmentServiceImpl implements AppointmentService {
	
	AppointmentRepository appointmentRepository;
	
	@Autowired
	public AppointmentServiceImpl(AppointmentRepository appointmentRepository) {
		super();
		this.appointmentRepository = appointmentRepository;
	}

	@Override
	public List<Appointment> getAllAppointment() {
		// TODO Auto-generated method stub
		return appointmentRepository.findAll();
	}

	
	@Override
	public Appointment save(Appointment appointment) {
		// TODO Auto-generated method stub
		appointmentRepository.save(appointment);
		return appointment;
		
		
	}

	@Override
	public String delete(int appointmentId) {
		// TODO Auto-generated method stub
		Appointment appointment=getAppointmentById(appointmentId);
		if(appointment !=null)
		{
			appointmentRepository.deleteById(appointmentId);
		}
		return "Delete appointment id"+appointmentId;
		
	}

	@Override
	public Appointment getAppointmentById(int appointmentId) {
		// TODO Auto-generated method stub
		Optional<Appointment>optional=appointmentRepository.findById(appointmentId);
		Appointment theAppointment =null;
		if(optional.isPresent())
		{
		theAppointment=optional.get();
		}
		else {
			throw new RuntimeException("Appointment id is not found :"+appointmentId);
		}
		return theAppointment;
	
	}
}
