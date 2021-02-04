package com.demo.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "pcr")
public class PCR extends PoliceStation{
	
	@Id
	@Column(name = "complaint_req_id")
	  String complaint_req_id;
	
	@Column(name = "police_id")
	  String police_id;
	
	/*@Column(name = "ps_id")
	  //String ps_id;
	
	@Column(name = "priority")
	  String priority;*/
	
	@Column(name = "status")
	  String status;
	
	Set<LodgeComplaintReq> lodgeComplaint;
	
	public PCR() {
		System.out.println("in PCR");
	}

	public PCR(String complaint_req_id, String police_id, String status, Set<LodgeComplaintReq> lodgeComplaint) {
		super();
		this.complaint_req_id = complaint_req_id;
		this.police_id = police_id;
		this.status = status;
		this.lodgeComplaint = lodgeComplaint;
	}

	public String getComplaint_req_id() {
		return complaint_req_id;
	}

	public void setComplaint_req_id(String complaint_req_id) {
		this.complaint_req_id = complaint_req_id;
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

	public Set<LodgeComplaintReq> getLodgeComplaint() {
		return lodgeComplaint;
	}

	public void setLodgeComplaint(Set<LodgeComplaintReq> lodgeComplaint) {
		this.lodgeComplaint = lodgeComplaint;
	}

	@Override
	public String toString() {
		return "PCR [complaint_req_id=" + complaint_req_id + ", police_id=" + police_id + ", status=" + status
				+ ", lodgeComplaint=" + lodgeComplaint + "]";
	}
	  
	
	
	  
}
