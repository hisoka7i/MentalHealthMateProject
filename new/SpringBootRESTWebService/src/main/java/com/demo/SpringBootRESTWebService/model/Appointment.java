package com.demo.SpringBootRESTWebService.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@Entity
@Table(name="user_Appointment")
public class Appointment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int appointment_id;
private String dName;
private String dphoneno;
private Date time;
private String status;
@OneToOne(cascade=CascadeType.REMOVE)
private UserPayment payment;
@ManyToOne
private Users user2;
}
