package com.example.Hospital.DTO;

import org.springframework.stereotype.Repository;

import jakarta.persistence.Column;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Repository
//@Getter
//@Setter
//@Data
public class DoctorsDetailsDTO {
		private String name;
		private String Specialization;
		private String gender;
		private int age;
		private String Address;
		private int Experience_in_years;
		private String treated_Patient;
		private String registration;
		private String working_days;
		private String timing;
		private String Hospital_id;
		private String Hospital_ward;
	
		
		
		// first i have used lombok for making getter setter and constrctor but it is not working hence i decided to write my own getter setters
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSpecialization() {
			return Specialization;
		}
		public void setSpecialization(String specialization) {
			Specialization = specialization;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getAddress() {
			return Address;
		}
		public void setAddress(String address) {
			Address = address;
		}
		public int getExperience_in_years() {
			return Experience_in_years;
		}
		public void setExperience_in_years(int experience_in_years) {
			Experience_in_years = experience_in_years;
		}
		public String getTreated_Patient() {
			return treated_Patient;
		}
		public void setTreated_Patient(String treated_Patient) {
			this.treated_Patient = treated_Patient;
		}
		public String getRegistration() {
			return registration;
		}
		public void setRegistration(String registration) {
			this.registration = registration;
		}
		public String getWorking_days() {
			return working_days;
		}
		public void setWorking_days(String working_days) {
			this.working_days = working_days;
		}
		public String getTiming() {
			return timing;
		}
		public void setTiming(String timing) {
			this.timing = timing;
		}
		public String getHospital_id() {
			return Hospital_id;
		}
		public void setHospital_id(String hospital_id) {
			Hospital_id = hospital_id;
		}
		public String getHospital_ward() {
			return Hospital_ward;
		}
		public void setHospital_ward(String hospital_ward) {
			Hospital_ward = hospital_ward;
		}
}
