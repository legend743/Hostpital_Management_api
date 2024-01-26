package com.example.Hospital.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Hospital.DTO.OPDdto;
import com.example.Hospital.Entity.OPDPatientEntity;
import com.example.Hospital.Service.OpdService;

@RestController
@RequestMapping("/hospital")
public class OpdPatientsListController {
	@Autowired
	private OpdService opdservice;
	@PostMapping("/OpdPatients")
	public String opdPateints(@RequestBody OPDdto opddto){
		return opdservice.Savepatients(opddto);
		
		
	}

}
