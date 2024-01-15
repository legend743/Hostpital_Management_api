package com.example.Hospital.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Hospital.Entity.DoctorsDetails;

public interface DoctorDetailsDao  extends JpaRepository<DoctorsDetails, Long>{

}
