package com.demo.bean;

import java.util.Date;

public class LodgeComplaintReq {
	

	String complaint_req_id;
	  String address_id;
	  Date complaint_date;
	  String username;
	  String id_proof_type;
	  String id_proof;
	  Date incident_date_time; //date and time datatype ?
	  String description;
	  int contact_no;
	  String email_id;
	  String loc_of_incident_id;
	  String remarks;
	  String action_taken;
	  
	public LodgeComplaintReq() {
		super();
	}
	
	public LodgeComplaintReq(String complaint_req_id, String address_id, Date complaint_date, String username,
			String id_proof_type, String id_proof, Date incident_date_time, String description, int contact_no,
			String email_id, String loc_of_incident_id, String remarks, String action_taken) {
		super();
		this.complaint_req_id = complaint_req_id;
		this.address_id = address_id;
		this.complaint_date = complaint_date;
		this.username = username;
		this.id_proof_type = id_proof_type;
		this.id_proof = id_proof;
		this.incident_date_time = incident_date_time;
		this.description = description;
		this.contact_no = contact_no;
		this.email_id = email_id;
		this.loc_of_incident_id = loc_of_incident_id;
		this.remarks = remarks;
		this.action_taken = action_taken;
	}
	public String getComplaint_req_id() {
		return complaint_req_id;
	}
	public void setComplaint_req_id(String complaint_req_id) {
		this.complaint_req_id = complaint_req_id;
	}
	public String getAddress_id() {
		return address_id;
	}
	public void setAddress_id(String address_id) {
		this.address_id = address_id;
	}
	public Date getComplaint_date() {
		return complaint_date;
	}
	public void setComplaint_date(Date complaint_date) {
		this.complaint_date = complaint_date;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getId_proof_type() {
		return id_proof_type;
	}
	public void setId_proof_type(String id_proof_type) {
		this.id_proof_type = id_proof_type;
	}
	public String getId_proof() {
		return id_proof;
	}
	public void setId_proof(String id_proof) {
		this.id_proof = id_proof;
	}
	public Date getIncident_date_time() {
		return incident_date_time;
	}
	public void setIncident_date_time(Date incident_date_time) {
		this.incident_date_time = incident_date_time;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getContact_no() {
		return contact_no;
	}
	public void setContact_no(int contact_no) {
		this.contact_no = contact_no;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getLoc_of_incident_id() {
		return loc_of_incident_id;
	}
	public void setLoc_of_incident_id(String loc_of_incident_id) {
		this.loc_of_incident_id = loc_of_incident_id;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getAction_taken() {
		return action_taken;
	}
	public void setAction_taken(String action_taken) {
		this.action_taken = action_taken;
	}
	  
}
