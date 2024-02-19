package com.example.Hospital.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cbcreport")
public class CBCReportEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="PatientName")
	private String PatientName;
	@Column(name="rbcount")
	private String rbcount;
	@Column(name="wbcount")
	private String wbcount;
	@Column(name="hemoglobin")
	private String hemoglobin;
	@Column(name="hematocrit")
	private String hematocrit;
	@Column(name="mch")
	private String mch;
	@Column(name="mvc")
	private String mvc;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRbcount() {
		return rbcount;
	}
	public void setRbcount(String rbcount) {
		this.rbcount = rbcount;
	}
	public String getWbcount() {
		return wbcount;
	}
	public void setWbcount(String wbcount) {
		this.wbcount = wbcount;
	}
	public String getHemoglobin() {
		return hemoglobin;
	}
	public void setHemoglobin(String hemoglobin) {
		this.hemoglobin = hemoglobin;
	}
	public String getHematocrit() {
		return hematocrit;
	}
	public void setHematocrit(String hematocrit) {
		this.hematocrit = hematocrit;
	}
	public String getMch() {
		return mch;
	}
	public void setMch(String mch) {
		this.mch = mch;
	}
	public String getMvc() {
		return mvc;
	}
	public void setMvc(String mvc) {
		this.mvc = mvc;
	}
	public String getPatientName() {
		return PatientName;
	}
	public void setPatientName(String patientName) {
		PatientName = patientName;
	}
	
	
}
