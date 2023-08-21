package com.demo.SpringBootRESTWebService.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.SpringBootRESTWebService.dao.SiteGeneratedRepo;
import com.demo.SpringBootRESTWebService.model.SiteGeneratedReport;


@Service
@Transactional
public class SiteGenReportImpl implements SiteGenReportI {
	
	@Autowired
	SiteGeneratedRepo sgr;

	@Override
	public List<SiteGeneratedReport> getAllReports() {
		// TODO Auto-generated method stub
		return sgr.findAll();
	}

	

}
