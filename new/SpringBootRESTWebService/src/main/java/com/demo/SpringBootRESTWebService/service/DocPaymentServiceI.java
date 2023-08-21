package com.demo.SpringBootRESTWebService.service;

import java.util.List;

import com.demo.SpringBootRESTWebService.model.Doctor_payment;

public interface DocPaymentServiceI {

	List<Doctor_payment> findAllPayment();

}
