package com.example.Hospital.Entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="appointments")
public class Appointment {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long appointmentId;

	    @ManyToOne
	    @JoinColumn(name = "doctor_id")
	    private DoctorsDetails doctor;
	    @Column(name="patient id")
	    private Long patient_id;
	    
	    @Column(name = "appointment_time")
	    @Temporal(TemporalType.TIMESTAMP)
	    private Date appointmentTime;

	    @Column(name = "status")
	    private String status;
	    
	    @Column(name="patient name")
	    private String patientName;
	    

		public Long getAppointmentId() {
			return appointmentId;
		}

		public void setAppointmentId(Long appointmentId) {
			this.appointmentId = appointmentId;
		}

		public DoctorsDetails getDoctor() {
			return doctor;
		}

		public void setDoctor(DoctorsDetails doctor) {
			this.doctor = doctor;
		}

		public Long getPatient_id() {
			return patient_id;
		}

		public void setPatient_id(Long patient_id) {
			this.patient_id = patient_id;
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

		public String getPatientName() {
			return patientName;
		}

		public void setPatientName(String patientName) {
			this.patientName = patientName;
		}
	   
}
