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
@Table(name="diagnosis_table")
public class Diagnosis {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int diagnosis_id;
private String diagnosis_name;
private Date date;
@ManyToOne
private MedicalHistory med;

}
