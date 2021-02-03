package com.demo.model;

import java.util.Date;

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
	  
	  public PCR() {
		super();
	}
	  
	public PCR(String ps_id,int notification_id,String complaint_id,String ps_name,String head,int no_of_staff,int contact_no,Date complaint_date,String priority,String remarks,String address_id,String role,String complaint_req_id, String police_id, String status) {
		super(ps_id, complaint_id, ps_name, head,no_of_staff, contact_no, complaint_date, priority, remarks, address_id,role);
		this.complaint_req_id = complaint_req_id;
		this.police_id = police_id;
		//this.ps_id = ps_id;
		//this.priority = priority;
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
	/*public String getPs_id() {
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
	}*/
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "PCR [complaint_req_id=" + complaint_req_id + ", police_id=" + police_id + ", status=" + status
				+ ", ps_id=" + ps_id + ", notification_id=" + notification_id + ", complaint_id=" + complaint_id
				+ ", ps_name=" + ps_name + ", head=" + head + ", no_of_staff=" + no_of_staff + ", contact_no="
				+ contact_no + ", complaint_date=" + complaint_date + ", priority=" + priority + ", remarks=" + remarks
				+ ", address_id=" + address_id + ", role=" + role + ", pol=" + pol + ", reg=" + reg + ", addr=" + addr
				+ ", noti=" + noti + "]";
	}

	
	
	
	  
}
