package com.efir.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "citizen_register")
public class Citizen {
	


	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "CitizenIdSeq")
	@GenericGenerator(name = "CitizenIdSeq",
						strategy = "com.efir.model.SequenceIdGenerator",
						parameters = {
								@Parameter(name=SequenceIdGenerator.INCREMENT_PARAM,value="9999"),
								@Parameter(name=SequenceIdGenerator.VALUE_PREFIX_PARAMETER,value="C" ),
								@Parameter(name=SequenceIdGenerator.NUMBER_FORMAT_PARAMETER,value="%04d")
						}
	)
	private String id;
	
	@Column(name = "citizen_name")
	private String citizen_name;
	
	@Column(name = "citizen_email")
	private String citizen_email;
	
	@Column(name = "citizen_contactNo")
	private String citizen_contactNo;
	@Column(name = "citizen_password")
	private String citizen_password;
	


	public Citizen() {
		super();
		
	}
	
	
	public Citizen( String id,String citizen_name, String citizen_email, String citizen_contactNo,
			String citizen_password) {
		super();
		this.id = id;
		this.citizen_name = citizen_name;
		this.citizen_email = citizen_email;
		this.citizen_contactNo = citizen_contactNo;
		this.citizen_password=citizen_password;
	}


	public String getCitizen_password() {
		return citizen_password;
	}


	public void setCitizen_password(String citizen_password) {
		this.citizen_password = citizen_password;
	}
	public String getid() {
		return id;
	}


	public void setid(String id) {
		this.id = id;
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


	@Override
	public String toString() {
		return "Citizen [ id= "+ id +",citizen_name=" + citizen_name + ", citizen_email="
				+ citizen_email + ", citizen_contactNo=" + citizen_contactNo +  "]";
	}
	 
	 
	 
	 

}
