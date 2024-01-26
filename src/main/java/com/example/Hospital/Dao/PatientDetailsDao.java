package com.example.Hospital.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Hospital.Entity.PatientDetails;

public interface PatientDetailsDao extends JpaRepository<PatientDetails, Long>{

}
