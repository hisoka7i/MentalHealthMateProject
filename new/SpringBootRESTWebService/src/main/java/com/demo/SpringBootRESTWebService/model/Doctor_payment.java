package com.demo.SpringBootRESTWebService.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@Entity
@Table(name="DocPayment_table")
public class Doctor_payment {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int paymentId;
private double amount;
private boolean pay_status;
@OneToOne
private Doctor_Appointment dpayment;

	
}