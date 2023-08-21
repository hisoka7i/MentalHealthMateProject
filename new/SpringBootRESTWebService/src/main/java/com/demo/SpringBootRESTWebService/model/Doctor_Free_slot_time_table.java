package com.demo.SpringBootRESTWebService.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@Entity
@Table(name="Free_slot")
public class Doctor_Free_slot_time_table {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int slotId;
private int slot;
@ManyToOne
private Doctor doctor1;

	
}