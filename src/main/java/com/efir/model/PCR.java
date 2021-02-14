package com.efir.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "_pcr")
public class PCR {
	
	@Id
	@Column(name = "id")
	  String id;
	
	@Column(name = "police_id")
	  String police_id;
	
		
		  @ManyToOne
		  
		  @JoinColumn(name="ps_id",referencedColumnName = "id") private
		  PoliceStation _ps;
		 
	@Column(name = "priority")
	  String priority;
	
	@Column(name = "status")
	  String status;
	
	public PCR() {
		System.out.println("in PCR");
	}

	public PCR(String id, String police_id, String status) {
		super();
		this.id = id;
		this.police_id = police_id;
		this.status = status;
		
	}

	public String getid() {
		return id;
	}

	public void setid(String id) {
		this.id = id;
	}

	public String getPolice_id() {
		return police_id;
	}

	public void setPolice_id(String police_id) {
		this.police_id = police_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "PCR [id=" + id + ", police_id=" + police_id + ", status=" + status
				+ "]";
	}
	  
	
	
	  
}
