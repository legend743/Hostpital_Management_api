package com.example.Hospital.DTO;

import jakarta.persistence.Column;

public class Host_patient {
	private Long id;
	@Column(name="name") 
	private String name;
	@Column(name="hospital")
	private String hospital;
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
	
}
