package com.example.hospitalmanagementsystem.service;

import java.util.List;

import com.example.hospitalmanagementsystem.entity.Appointment;

public interface AppointmentService {
	
	public List<Appointment>getAllAppointment();
	public Appointment save(Appointment appointment);
	public String delete(int appointmentId);
	public Appointment getAppointmentById(int appointmentId);
}
