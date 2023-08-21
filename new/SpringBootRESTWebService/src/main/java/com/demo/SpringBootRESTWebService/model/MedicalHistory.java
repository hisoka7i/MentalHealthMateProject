package com.demo.SpringBootRESTWebService.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name="Medical_history_table")
public class MedicalHistory {
@Id	
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int Medical_id;
private String familyHistory;
private String Allergies;
@OneToOne
private Users user3;
@OneToMany(cascade=CascadeType.REMOVE)
private List<Diagnosis> diagnosis;


}
