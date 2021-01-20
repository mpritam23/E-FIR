package com.demo.bean;

public class PCR {
	  String complaint_req_id;
	  String police_id;
	  String ps_id;
	  String priority;
	  String status;
	  
	  public PCR() {
		super();
	}
	  
	public PCR(String complaint_req_id, String police_id, String ps_id, String priority, String status) {
		super();
		this.complaint_req_id = complaint_req_id;
		this.police_id = police_id;
		this.ps_id = ps_id;
		this.priority = priority;
		this.status = status;
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
	public String getPs_id() {
		return ps_id;
	}
	public void setPs_id(String ps_id) {
		this.ps_id = ps_id;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	  
}
