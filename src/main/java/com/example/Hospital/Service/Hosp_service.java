package com.example.Hospital.Service;

import java.lang.StackWalker.Option;
import java.util.Optional;

import com.example.Hospital.DTO.AppointmentsDto;
import com.example.Hospital.DTO.DoctorsDetailsDTO;
import com.example.Hospital.DTO.Host_dto;
import com.example.Hospital.DTO.Host_patient;
import com.example.Hospital.DTO.PatientsDetailsDto;

public interface Hosp_service {
	Long add_details(Host_dto host_dto);
	
	
	
//	String get_details(Host_dto host_dto);
	
	
	
	Optional<Host_patient> get_details(Long id);
	
	
	String saveDDetails(DoctorsDetailsDTO doctordetailsdto);
	Optional<DoctorsDetailsDTO> getdoctorsdetail(Long id);



	String savepatientDetails(PatientsDetailsDto patientsdetails);



	Optional<PatientsDetailsDto> getpatientsdetails(Long id);



	String bookappointment(AppointmentsDto appoinmentsdto);



	Optional<AppointmentsDto> getappointment(Long id);
	
	
	
	

	
}
