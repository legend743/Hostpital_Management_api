package com.example.Hospital.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Hospital.Entity.Appointment;
@Repository

public interface AppointmentsDao extends JpaRepository<Appointment, Long> {

	@Query("SELECT MAX(a.patient_id) FROM Appointment a")
    Long findMaxPatientId();

}
