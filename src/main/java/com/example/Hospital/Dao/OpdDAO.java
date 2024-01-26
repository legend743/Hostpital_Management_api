package com.example.Hospital.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Hospital.Entity.OPDPatientEntity;

public interface OpdDAO extends JpaRepository<OPDPatientEntity, Long> {

}
