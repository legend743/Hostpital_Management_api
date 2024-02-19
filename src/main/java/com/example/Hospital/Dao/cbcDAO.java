package com.example.Hospital.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Hospital.Entity.CBCReportEntity;

public interface cbcDAO extends JpaRepository<CBCReportEntity, Integer>{

}
