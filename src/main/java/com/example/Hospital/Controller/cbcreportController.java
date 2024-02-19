package com.example.Hospital.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Hospital.Entity.CBCReportEntity;
import com.example.Hospital.Service.PathlabService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
@RestController
@RequestMapping("/pathlab")
public class cbcreportController {
	@Autowired
	private PathlabService pathlabservice;
	
	@PostMapping("/cbcreport")
	
	public String cbcreport(@RequestBody CBCReportEntity cbcreport) {
		
		try {
			pathlabservice.savecbcdetails(cbcreport);
			return "report Submitted";
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
		return "report addded successfuly";
	}

}
