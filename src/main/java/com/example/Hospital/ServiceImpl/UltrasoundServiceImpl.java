package com.example.Hospital.ServiceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Hospital.Dao.ultrasoundDAo;
import com.example.Hospital.Entity.UltraSoundEntity;
import com.example.Hospital.Service.ultrasoundService;
@Service
public class UltrasoundServiceImpl implements ultrasoundService{

	@Autowired
	private ultrasoundDAo usdao;
	
	@Override
	public String saveUsDetails(UltraSoundEntity ultrasoundentity) {
		usdao.save(ultrasoundentity);
		return null;
	}
	

	

}
