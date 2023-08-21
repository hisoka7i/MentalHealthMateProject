package com.demo.SpringBootRESTWebService.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity(name="User_Table")
public class Users {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String username;
private String name;
private String email;
private int age;
private String phoneno;
private char gender;
private String password;


public Users(int id, String username, String name, String email, int age, String phoneno, char gender,
		String password) {
	super();
	this.id = id;
	this.username = username;
	this.name = name;
	this.email = email;
	this.age = age;
	this.phoneno = phoneno;
	this.gender = gender;
	this.password = password;
}


@Override
public String toString() {
	return "Users [id=" + id + ", username=" + username + ", name=" + name + ", email=" + email + ", age=" + age
			+ ", phoneno=" + phoneno + ", gender=" + gender + ", password=" + password + "]";
}


public Users() {
	super();
}

}

