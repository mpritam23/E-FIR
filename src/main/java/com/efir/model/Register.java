package com.efir.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "register")
public class Register {
	
	@Id
	 private String id;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "role")
	private String role;
	 
	 public Register() {
		super();
	}
	public Register(String id, String password, String role) {
		super();
		this.id = id;
		this.password = password;
		this.role = role;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Register [id=" + id + ", password=" + password + ", role=" + role + "]";
	}
	 
	 

}
