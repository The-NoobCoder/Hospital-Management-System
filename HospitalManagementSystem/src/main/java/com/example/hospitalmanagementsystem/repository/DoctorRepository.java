package com.example.hospitalmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hospitalmanagementsystem.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

}
