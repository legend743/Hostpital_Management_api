package com.example.Hospital.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Hospital.DTO.OPDdto;
import com.example.Hospital.Dao.OpdDAO;
import com.example.Hospital.Entity.OPDPatientEntity;
import com.example.Hospital.Service.OpdService;

@Service
public class OpdServiceImpl implements OpdService{

	@Autowired
	private OpdDAO opdDao;
	
	

	@Override
	public String Savepatients( OPDdto opdto) {

		OPDPatientEntity opdentity=new OPDPatientEntity();
		opdentity.setPname(opdto.getPname());
		opdentity.setDname(opdto.getDname());
		opdentity.setAge(opdto.getAge());
		
		opdDao.save(opdentity);
		return "Saved Succesfully";
	}
	

}
