package com.example.hospitalmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hospitalmanagementsystem.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
