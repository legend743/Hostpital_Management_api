package com.example.Hospital.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Hospital.Entity.UltraSoundEntity;
import com.example.Hospital.Service.ultrasoundService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/ultrasound")
public class UltraSoundController {
	@Autowired
	private ultrasoundService Ultrasoundservice;
	@PostMapping("/save-us-report")
	
	public String saveUltraSoundReport(@RequestBody UltraSoundEntity ultrasoundentity){
		
		try {
			
			return   Ultrasoundservice.saveUsDetails(ultrasoundentity);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return "details saved successfully";
	
}
}
