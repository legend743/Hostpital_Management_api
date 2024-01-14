package com.example.Hospital.ServiceImpl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Hospital.DTO.Host_dto;
import com.example.Hospital.DTO.Host_patient;
import com.example.Hospital.Dao.Hosp_Dao;

import com.example.Hospital.Entity.Hosp_Entity;
import com.example.Hospital.Service.Hosp_service;
@Service
public class Host_serv_Impl implements Hosp_service {
	@Autowired
	private Hosp_Dao hosp_dao;

	
	
	@Autowired
	@Override
	public Long add_details(Host_dto host_dto) {
//		Hosp_Entity existing_entry=hosp_dao.findByNameAndAddressAndHospital(host_dto.getName(),host_dto.getAddress(),host_dto.getHospital());
//			if (existing_entry!=null) {
//				return existing_entry.getId();
//			}
//			else {
		
		 Hosp_Entity host=new Hosp_Entity();
		 host.setName(host_dto.getName());
		 host.setAddress(host_dto.getAddress());
		 host.setHospital(host_dto.getHospital());
		 Hosp_Entity host_save=hosp_dao.save(host);
		 return host_save.getId();
		     	
			} 
//	}



//	public Optional<Host_patient> get_details(Long id) {
//		// TODO Auto-generated method stub
//		return patientdao.findById(id); 	 		
//		
//	}
  
	 @Override
	    public Optional<Host_patient> get_details(Long id) {
	        return hosp_dao.findById(id).map(this::convertEntityToDTO);
	    }

	    private Host_patient convertEntityToDTO(Hosp_Entity entity) {
	    	Host_patient dto = new Host_patient();
	        BeanUtils.copyProperties(entity, dto);
	        return dto;
	    }

}
