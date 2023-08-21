package com.demo.SpringBootRESTWebService.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name="Doctor_table")
public class Doctor {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int doctor_id;
private String duserName;

private String doctor_name;
private String qualification;
private String email;
private String phone_no;
private String password;



}