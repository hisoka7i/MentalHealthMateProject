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
@Table(name="site_generated_table")
public class SiteGeneratedReport {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int siteGenRepId;
private int anxity;
private int hyperActivity;
private int schizophrenia;
private int ocd;
private int autism;
private int stress;
private int ptsd;
private int parenoia;
private Date date;

@ManyToOne
private Users user4;

@Override
public String toString() {
	return "SiteGeneratedReport [siteGenRepId=" + siteGenRepId + ", anxity=" + anxity + ", hyperActivity="
			+ hyperActivity + ", schizophrenia=" + schizophrenia + ", ocd=" + ocd + ", autism=" + autism + ", stress="
			+ stress + ", ptsd=" + ptsd + ", parenoia=" + parenoia + ", date=" + date + ", user4=" + user4 + "]";
}





}
