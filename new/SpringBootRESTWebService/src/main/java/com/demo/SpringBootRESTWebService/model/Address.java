package com.demo.SpringBootRESTWebService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@Entity(name="address_table")
public class Address {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="add_id")
private int Add_id;
private String city;
private String street;
private int pinCode;
@OneToOne
private Users user1;



}
