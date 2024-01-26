package com.example.Hospital.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Hosptal Details")
public class Hosp_Entity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Long id;
	@Column(name="name") 
	private String name;
	@Column(name="hospital")
	private String hospital;
	@Column(name="address")
	private String address;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHospital() {
		return hospital;
	}
	public void setHospital(String hospital) {
		this.hospital = hospital;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
