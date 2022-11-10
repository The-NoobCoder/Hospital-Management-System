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

import com.example.hospitalmanagementsystem.entity.Appointment;
import com.example.hospitalmanagementsystem.service.AppointmentService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class AppointmentRestController {
	AppointmentService appointmentService;

	@Autowired
	public AppointmentRestController(AppointmentService appointmentService) {
		super();
		this.appointmentService = appointmentService;
	}
	
	@GetMapping("/appointment")
	public List<Appointment> findAll(){
		return appointmentService.getAllAppointment();
	}
	
	@GetMapping("/appointment/{appointment_id}")
	public Appointment getAppointmentById(@PathVariable int appointment_id)
	{
		Appointment appointment=appointmentService.getAppointmentById(appointment_id);
		return appointment;
	}
	
	@PostMapping("/appointment")
	public Appointment addAppointment(@RequestBody Appointment appointment)
	{
		appointment.setAppointmentId(0);
		Appointment appointment2=appointmentService.save(appointment);
		System.out.println(appointment.getAppointmentId());
		return appointment2;
	}
	
	@PutMapping("/appointment")
	public Appointment updateAppointment(@RequestBody Appointment appointment) {
		appointmentService.save(appointment);
		return appointment;
	}
	@DeleteMapping("/appointment/{appointment_id}")
	public String delete(@PathVariable int appointment_id)
	{
		String message=appointmentService.delete(appointment_id);
		return message;
	}
	
	
	

}
