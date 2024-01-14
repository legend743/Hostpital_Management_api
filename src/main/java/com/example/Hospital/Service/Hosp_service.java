package com.example.Hospital.Service;

import java.util.Optional;

import com.example.Hospital.DTO.Host_dto;
import com.example.Hospital.DTO.Host_patient;
import com.example.Hospital.Entity.Hosp_Entity;

public interface Hosp_service {
	Long add_details(Host_dto host_dto);
//	String get_details(Host_dto host_dto);
	Optional<Host_patient> get_details(Long id);
}
