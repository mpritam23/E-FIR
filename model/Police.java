package com.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "police")
public class Police {

	@Id
	@Column(name = "police_id")
	String police_id;
	
	/*@Column(name = "ps_id")
	  String ps_id;*/
	
	@Column(name = "police_name")
	  String police_name;
	
	@Column(name = "senior_incharge")
	  String senior_incharge;
	
	@Column(name = "rank")
	  String rank;
	
	@Column(name = "doj")
	  Date doj;
	
	@Column(name = "dob")
	  Date dob;
	
	/*@ManyToOne
	@JoinColumn(name="ps_id")
	PoliceStation ps;*/
	
	@OneToOne
	@JoinColumn(name="ps_id")
	PoliceStation ps;
	  
	 public Police() {
		super();
	}
	public Police(String police_id, String police_name, String senior_incharge, String rank, Date doj,
			Date dob) {
		super();
		this.police_id = police_id;
		//this.ps_id = ps_id;
		this.police_name = police_name;
		this.senior_incharge = senior_incharge;
		this.rank = rank;
		this.doj = doj;
		this.dob = dob;
	}
	public String getPolice_id() {
		return police_id;
	}
	public void setPolice_id(String police_id) {
		this.police_id = police_id;
	}
	/*public String getPs_id() {
		return ps_id;
	}
	public void setPs_id(String ps_id) {
		this.ps_id = ps_id;
	}*/
	public String getPolice_name() {
		return police_name;
	}
	public void setPolice_name(String police_name) {
		this.police_name = police_name;
	}
	public String getSenior_incharge() {
		return senior_incharge;
	}
	public void setSenior_incharge(String senior_incharge) {
		this.senior_incharge = senior_incharge;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Police [police_id=" + police_id + ", police_name=" + police_name + ", senior_incharge="
				+ senior_incharge + ", rank=" + rank + ", doj=" + doj + ", dob=" + dob + ", ps=" + ps + "]";
	}
	
	  
}
