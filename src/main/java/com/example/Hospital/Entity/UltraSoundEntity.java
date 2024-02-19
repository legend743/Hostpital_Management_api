package com.example.Hospital.Entity;

import java.util.Date;

import org.hibernate.type.descriptor.jdbc.VarbinaryJdbcType;
import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ultrasoundReport")
public class UltraSoundEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int imageid;
	
	private String patientname;
	
	private Date captureDate;
	
	private VarcharJdbcType DicomRef;
	
	private VarcharJdbcType Maskfile;
	private VarbinaryJdbcType flags;
	
	
	public int getImageid() {
		return imageid;
	}
	public void setImageid(int imageid) {
		this.imageid = imageid;
	}
	public String getPatientname() {
		return patientname;
	}
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}
	public Date getCaptureDate() {
		return captureDate;
	}
	public void setCaptureDate(Date captureDate) {
		this.captureDate = captureDate;
	}
	public VarcharJdbcType getDicomRef() {
		return DicomRef;
	}
	public void setDicomRef(VarcharJdbcType dicomRef) {
		DicomRef = dicomRef;
	}
	public VarcharJdbcType getMaskfile() {
		return Maskfile;
	}
	public void setMaskfile(VarcharJdbcType maskfile) {
		Maskfile = maskfile;
	}
	public VarbinaryJdbcType getFlags() {
		return flags;
	}
	public void setFlags(VarbinaryJdbcType flags) {
		this.flags = flags;
	}
	
	
	
	
	
}
