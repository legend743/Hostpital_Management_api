package com.example.Hospital.DTO;

import java.util.Date;

public class AppointmentsDto {

	private Long appointmentId;
    private Long doctorId;
    private Long patientId;
    private Date appointmentTime;
    private String status;
    private String patientName;
    
    
    
    
    
    
	public AppointmentsDto() {
		super();
	}

	public AppointmentsDto(Long appointmentId, Long doctorId, Long patientId, Date appointmentTime, String status,
			String patientName) {
		super();
		this.appointmentId = appointmentId;
		this.doctorId = doctorId;
		this.patientId = patientId;
		this.appointmentTime = appointmentTime;
		this.status = status;
		this.patientName = patientName;
	}

	public Long getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(Long appointmentId) {
		this.appointmentId = appointmentId;
	}
	public Long getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(Long doctorId) {
		this.doctorId = doctorId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public Long getPatientId() {
		return patientId;
	}
	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}
	public Date getAppointmentTime() {
		return appointmentTime;
	}
	public void setAppointmentTime(Date appointmentTime) {
		this.appointmentTime = appointmentTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
    
    
}
