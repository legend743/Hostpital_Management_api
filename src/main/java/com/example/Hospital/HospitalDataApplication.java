package com.example.Hospital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
		info=@Info(
				title="Hospital-Api",
				version="1.0..0",
				description="Hospital Management apis",
				contact=@Contact(
						name="Mohd Faisal",
						email="fmohd743@gmail.com")
				)
		
		)
public class HospitalDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalDataApplication.class, args);
	}

}
