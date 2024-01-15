package com.example.Hospital.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Hospital.DTO.DoctorsDetailsDTO;
import com.example.Hospital.DTO.Host_dto;
import com.example.Hospital.DTO.Host_patient;
import com.example.Hospital.Entity.DoctorsDetails;
import com.example.Hospital.Service.Hosp_service;

//@RestController
//@RequestMapping("/")
//public class Hosp_Controller {
//	@Autowired
//	private Hosp_service hospService;
//	
//	@PostMapping("/add_details")
//	public Long add_details(@RequestBody Host_dto hostDto) {
//		return hospService.add_details(hostDto);
//		
//		
//	}
//	@Autowired
//	@GetMapping("/get_details/{id}")
//	public Optional<Hosp_Entity> getDetails(@PathVariable Long id) {
//		return hospService.get_details(id);
//	}
//	
//	
//
//}
@RestController
@RequestMapping("/hospital")
public class Hosp_Controller {

    @Autowired
    private Hosp_service hospService;

    @PostMapping("/add_details")
    public Long addDetails(@RequestBody Host_dto hostDto) {
        return hospService.add_details(hostDto);
    }

//    @GetMapping("/get_details/{id}")
//    public Optional<Host_patient> getDetails(@PathVariable Long id) {
//        return hospService.get_details(id);
//    }
    @GetMapping("/get_details/{id}")
    public ResponseEntity<Host_patient> getDetails(@PathVariable Long id) {
        Optional<Host_patient> responseDTO = hospService.get_details(id);
        return responseDTO.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
    
    
    @PostMapping("/doctordetails")
    public String saveD_details(@RequestBody DoctorsDetailsDTO doctordetailsdto) {
    	return hospService.saveDDetails(doctordetailsdto);
    	 
    }
}
