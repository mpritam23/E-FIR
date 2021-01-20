package com.demo.bean;

import java.util.Date;

public class FIR {
	
	String fir_id;
	  String offence_id;
	  String complaint_id;
	  String ps_id;
	  Date fir_date;
	  String assigned_to;
	  String status;
	  String priority;
	  Date complaint_date;
	  String remarks;
	  String action_taken;
	  String section_of_ipc;
	  int fir_flag;
	  
	  	public FIR() {
		super();
	}
	
	public FIR(String fir_id, String offence_id, String complaint_id, String ps_id, Date fir_date, String assigned_to,
			String status, String priority, Date complaint_date, String remarks, String action_taken,
			String section_of_ipc, int fir_flag) {
		super();
		this.fir_id = fir_id;
		this.offence_id = offence_id;
		this.complaint_id = complaint_id;
		this.ps_id = ps_id;
		this.fir_date = fir_date;
		this.assigned_to = assigned_to;
		this.status = status;
		this.priority = priority;
		this.complaint_date = complaint_date;
		this.remarks = remarks;
		this.action_taken = action_taken;
		this.section_of_ipc = section_of_ipc;
		this.fir_flag = fir_flag;
	}
	public String getFir_id() {
		return fir_id;
	}
	public void setFir_id(String fir_id) {
		this.fir_id = fir_id;
	}
	public String getOffence_id() {
		return offence_id;
	}
	public void setOffence_id(String offence_id) {
		this.offence_id = offence_id;
	}
	public String getComplaint_id() {
		return complaint_id;
	}
	public void setComplaint_id(String complaint_id) {
		this.complaint_id = complaint_id;
	}
	public String getPs_id() {
		return ps_id;
	}
	public void setPs_id(String ps_id) {
		this.ps_id = ps_id;
	}
	public Date getFir_date() {
		return fir_date;
	}
	public void setFir_date(Date fir_date) {
		this.fir_date = fir_date;
	}
	public String getAssigned_to() {
		return assigned_to;
	}
	public void setAssigned_to(String assigned_to) {
		this.assigned_to = assigned_to;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public Date getComplaint_date() {
		return complaint_date;
	}
	public void setComplaint_date(Date complaint_date) {
		this.complaint_date = complaint_date;
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
	public String getSection_of_ipc() {
		return section_of_ipc;
	}
	public void setSection_of_ipc(String section_of_ipc) {
		this.section_of_ipc = section_of_ipc;
	}
	public int getFir_flag() {
		return fir_flag;
	}
	public void setFir_flag(int fir_flag) {
		this.fir_flag = fir_flag;
	}
	  
	  
}
