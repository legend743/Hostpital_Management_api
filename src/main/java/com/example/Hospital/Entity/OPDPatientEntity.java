package com.example.Hospital.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
public class OPDPatientEntity {
	@Column(name="patientName", length=30)
	private String pname;
	@Column(name="doctorname",length=30)
	private String dname;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="age", length=3)
	private int age;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public OPDPatientEntity(String pname, String dname, long id, int age) {
		super();
		this.pname = pname;
		this.dname = dname;
		this.id = id;
		this.age = age;
	}
	public OPDPatientEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
