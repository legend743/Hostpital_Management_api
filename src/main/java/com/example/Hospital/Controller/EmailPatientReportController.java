package com.example.Hospital.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Hospital.Service.emailService;

@RestController
@RequestMapping("/sendmail")
public class EmailPatientReportController {
	
	@Autowired
	private emailService emailservice;
	
	@GetMapping("/mail")
	
	public String mailReport() {
		
		try {
			emailservice.sendmail();
			return "email send successfully";
		}catch(Exception e) {
			return "email send successfully";
		}
		
		
		
		
		
	}

}
