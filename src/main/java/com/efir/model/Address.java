package com.efir.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {
	@Id
	@Column(name = "id")
	String id;
	
	@Column(name = "street")
	String street;
	
	@Column(name = "city")
	String city;
	
	@Column(name = "taluka")
	String taluka;
	
	@Column(name = "district")
	String district;
	
	@Column(name = "state")
	String state;
	
	@Column(name = "pincode")
	int pincode;
	
	
	  @OneToOne(mappedBy="addr") private PoliceStation ps;
	 
	
	public Address() {
		super();
		
	}

	public Address(String id, String street, String city, String taluka, String district, String state,
			int pincode) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
		this.taluka = taluka;
		this.district = district;
		this.state = state;
		this.pincode = pincode;
	}

	
	public String getid() {
		return id;
	}

	public void setid(String id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTaluka() {
		return taluka;
	}

	public void setTaluka(String taluka) {
		this.taluka = taluka;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", city=" + city + ", taluka=" + taluka
				+ ", district=" + district + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	
}
