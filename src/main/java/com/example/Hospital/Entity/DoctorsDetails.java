package com.example.Hospital.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
//@Data
//@Getter
//@Setter
@Table(name="Doctors_details")
public class DoctorsDetails {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
@Column(name="name")
private String name;
@Column(name="Specialization")
private String Specialization;
@Column(name="gender")
private String gender;
@Column(name="age")
private int age;
@Column(name="Address",length = 255)
private String Address;
@Column(name="Experience_in_years",length = 255)
private int Experience_in_years;
@Column(name="treated_Patient",length = 40)
private String treated_Patient;
@Column(name="registration")
private String registration;
@Column(name="working_days")
private String working_days;
@Column(name="timing")
private String timing;
@Column(name="Hospital_id")
private String Hospital_id;
@Column(name="Hospital_ward")
private String Hospital_ward;
@OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
private List<Appointment> appointments;


//first i have used lombok for making getter setter and constrctor but it is not working hence i decided to write my own getter setters

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
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
//public DoctorsDetails(long id, String name, String specialization, String gender, int age, String address,
//		int experience_in_years, String treated_Patient, String registration, String working_days, String timing,
//		String hospital_id, String hospital_ward) {
//	super();
//	this.id = id;
//	this.name = name;
//	Specialization = specialization;
//	this.gender = gender;
//	this.age = age;
//	Address = address;
//	Experience_in_years = experience_in_years;
//	this.treated_Patient = treated_Patient;
//	this.registration = registration;
//	this.working_days = working_days;
//	this.timing = timing;
//	Hospital_id = hospital_id;
//	Hospital_ward = hospital_ward;
//}
//public DoctorsDetails() {
//	super();
//}









}
