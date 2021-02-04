package com.demo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "citizen_register")
public class Citizen {
	@Id
	@Column(name = "citizen_id")
	String citizen_id;
	
	@Column(name = "citizen_name")
	 String citizen_name;
	
	@Column(name = "citizen_email")
	 String citizen_email;
	
	@Column(name = "citizen_contactNo")
	 String citizen_contactNo;
	
	@Column(name = "citizen_password")
	 String citizen_password;
	 
	@OneToMany(mappedBy="citizen")
	Set<Register> reg=new HashSet<>();
	 
	 
	public Citizen() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Citizen(String citizen_id, String citizen_name, String citizen_email, String citizen_contactNo,
			String citizen_password) {
		super();
		this.citizen_id = citizen_id;
		this.citizen_name = citizen_name;
		this.citizen_email = citizen_email;
		this.citizen_contactNo = citizen_contactNo;
		this.citizen_password = citizen_password;
	}


	public String getCitizen_id() {
		return citizen_id;
	}
	public void setCitizen_id(String citizen_id) {
		this.citizen_id = citizen_id;
	}
	public String getCitizen_name() {
		return citizen_name;
	}
	public void setCitizen_name(String citizen_name) {
		this.citizen_name = citizen_name;
	}
	public String getCitizen_email() {
		return citizen_email;
	}
	public void setCitizen_email(String citizen_email) {
		this.citizen_email = citizen_email;
	}
	public String getCitizen_contactNo() {
		return citizen_contactNo;
	}
	public void setCitizen_contactNo(String citizen_contactNo) {
		this.citizen_contactNo = citizen_contactNo;
	}
	public String getCitizen_password() {
		return citizen_password;
	}
	public void setCitizen_password(String citizen_password) {
		this.citizen_password = citizen_password;
	}


	@Override
	public String toString() {
		return "Citizen [citizen_id=" + citizen_id + ", citizen_name=" + citizen_name + ", citizen_email="
				+ citizen_email + ", citizen_contactNo=" + citizen_contactNo + ", citizen_password=" + citizen_password
				+ "]";
	}
	 
	 
	 
	 

}
