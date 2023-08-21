package com.demo.SpringBootRESTWebService.model;

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
@Table(name="medication_table")
public class Medications {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int medication_id;
private String medicationName;
@ManyToOne
private Diagnosis diagnosis;
}
