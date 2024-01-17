package com.example.Hospital.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Hospital.Entity.Appointment;

public interface AppointmentsDao extends JpaRepository<Appointment, Long> {

}
