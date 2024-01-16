package com.example.Hospital.ServiceImpl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Hospital.DTO.DoctorsDetailsDTO;
import com.example.Hospital.DTO.Host_dto;
import com.example.Hospital.DTO.Host_patient;
import com.example.Hospital.Dao.DoctorDetailsDao;
import com.example.Hospital.Dao.Hosp_Dao;
import com.example.Hospital.Entity.DoctorsDetails;
import com.example.Hospital.Entity.Hosp_Entity;
import com.example.Hospital.Service.Hosp_service;
@Service
public class Host_serv_Impl implements Hosp_service {
	@Autowired
	private Hosp_Dao hosp_dao;
	
	@Autowired
	private DoctorDetailsDao doctorDao;
	
	
	private static final Logger logger = LoggerFactory.getLogger(Host_serv_Impl.class);

	
	
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
	
	//------------------------------------get request of patients-------------------------------------------------------
  
	 @Override
	    public Optional<Host_patient> get_details(Long id) {
	        return hosp_dao.findById(id).map(this::convertEntityToDTO);
	    }

	    private Host_patient convertEntityToDTO(Hosp_Entity entity) {
	    	Host_patient dto = new Host_patient();
	        BeanUtils.copyProperties(entity, dto);
	        return dto;
	    }

	    
	  //--------------------------------------this is save doctor details code------------------------------------------------
			@Override
			public String saveDDetails(DoctorsDetailsDTO doctordetailsdto) {
				 System.out.println("DTO Values: " + doctordetailsdto.toString());
			    DoctorsDetails doctordetails = new DoctorsDetails();
			    logger.debug("Received request to save doctor details: {}", doctordetailsdto);
			    doctordetails.setName(doctordetailsdto.getName());
			    doctordetails.setAddress(doctordetailsdto.getAddress());
			    doctordetails.setAge(doctordetailsdto.getAge());
			    doctordetails.setExperience_in_years(doctordetailsdto.getExperience_in_years());
			    doctordetails.setGender(doctordetailsdto.getGender());
			    doctordetails.setHospital_id(doctordetailsdto.getHospital_id());
			    doctordetails.setSpecialization(doctordetailsdto.getSpecialization());
			    doctordetails.setRegistration(doctordetailsdto.getRegistration());
			    doctordetails.setHospital_ward(doctordetailsdto.getHospital_ward());
			    doctordetails.setTreated_Patient(doctordetailsdto.getTreated_Patient());
			    doctordetails.setTiming(doctordetailsdto.getTiming());
			    doctordetails.setWorking_days(doctordetailsdto.getWorking_days());
			    System.out.println("Entity Values: " + doctordetails.toString());
			    logger.info("Doctor details saved successfully");
			    doctorDao.save(doctordetails);
			    return "Details saved successfully";
			
			
		}

			@Override
			public Optional<DoctorsDetailsDTO> getdoctorsdetail(Long id) {
			    return doctorDao.findById(id).map(this::convertDoctorEntityToDTO);
			}

			private DoctorsDetailsDTO convertDoctorEntityToDTO(DoctorsDetails entity) {
			    DoctorsDetailsDTO dto = new DoctorsDetailsDTO();
			    dto.setName(entity.getName());
			    dto.setSpecialization(entity.getSpecialization());
			    dto.setGender(entity.getGender());
			    dto.setAge(entity.getAge());
			    dto.setAddress(entity.getAddress());
			    dto.setExperience_in_years(entity.getExperience_in_years());
			    dto.setTreated_Patient(entity.getTreated_Patient());
			    dto.setRegistration(entity.getRegistration());
			    dto.setWorking_days(entity.getWorking_days());
			    dto.setTiming(entity.getTiming());
			    dto.setHospital_id(entity.getHospital_id());
			    dto.setHospital_ward(entity.getHospital_ward());
			    
			    return dto;
			}


	
	}



	    
	    

