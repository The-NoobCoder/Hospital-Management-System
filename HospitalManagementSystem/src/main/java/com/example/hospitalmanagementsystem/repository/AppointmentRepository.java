package com.example.hospitalmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hospitalmanagementsystem.entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {

}
