package com.demo.SpringBootRESTWebService.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.SpringBootRESTWebService.model.Doctor_Appointment;

public interface Doctor_AppointmentRepo extends JpaRepository<Doctor_Appointment, Integer> {

	

}
