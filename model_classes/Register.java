package com.demo.bean;
@Entity
@Table(name = "register")
public class Register {
	
	@Id
	@Column(name = "id")
	 String id;
	
	@Column(name = "password")
	 String password;
	
	@Column(name = "role")
	 String role;
	 
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