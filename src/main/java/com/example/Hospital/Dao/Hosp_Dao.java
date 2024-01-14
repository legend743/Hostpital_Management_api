package com.example.Hospital.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Hospital.Entity.Hosp_Entity;

public interface Hosp_Dao extends JpaRepository<Hosp_Entity, Long> {

//	Hosp_Entity findByNameANDbyAddressANDbyHospital(String name, String address, String hospital);

//	Hosp_Entity findByNameAndAddressAndHospital(String name, String address, String hospital);
	
	
	

}
