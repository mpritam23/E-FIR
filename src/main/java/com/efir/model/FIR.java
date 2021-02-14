package com.efir.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "_fir")
public class FIR {
	@Id
	@Column(name = "id")
	String id;
	
	@Column(name = "offence_id")
	  String offence_id;
	
	@Column(name = "complaint_id")
	  String complaint_id;
	
	@Column(name = "fir_date")
	  Date fir_date;
	
	@Column(name = "assigned_to")
	  String assigned_to;
	
	@Column(name = "status")
	  String status;
	
	@Column(name = "priority")
	  String priority;
	
	@Column(name = "complaint_date")
	  Date complaint_date;
	
	@Column(name = "remarks")
	  String remarks;
	
		
		  public Set<Offence> getOff() { return off; }
		  
		  public void setOff(Set<Offence> off) { this.off = off; }
		  
		  public Set<Criminal> getCr() { return cr; }
		  
		  public void setCr(Set<Criminal> cr) { this.cr = cr; }
		 

	@Column(name = "action_taken")
	  String action_taken;
	
	@Column(name = "section_of_ipc")
	  String section_of_ipc;
	
	@Column(name = "fir_flag")
	  int fir_flag;
	
	@Column(name = "accused")
	  String accused;
	  
		
		  @ManyToOne
		  
		  @JoinColumn(name="ps_id") PoliceStation ps;
		  
		  @ManyToMany(mappedBy="firlist") private Set<Offence> off=new HashSet<>();
		  
		  @ManyToMany(mappedBy="fir") private Set<Criminal> cr=new HashSet<>();
		 
	  
	  public FIR()
	  {
		super();
	  }

		public FIR(String id, String offence_id, String complaint_id, Date fir_date,
				String assigned_to, String status, String priority, Date complaint_date, String remarks,
				String action_taken, String section_of_ipc, int fir_flag, String accused) {
			super();
			this.id = id;
			this.offence_id = offence_id;
			this.complaint_id = complaint_id;
			this.fir_date = fir_date;
			this.assigned_to = assigned_to;
			this.status = status;
			this.priority = priority;
			this.complaint_date = complaint_date;
			this.remarks = remarks;
			this.action_taken = action_taken;
			this.section_of_ipc = section_of_ipc;
			this.fir_flag = fir_flag;
			this.accused = accused;
		}

		public String getid() {
			return id;
		}

		public void setid(String id) {
			this.id = id;
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

		public String getAccused() {
			return accused;
		}

		public void setAccused(String accused) {
			this.accused = accused;
		}

		@Override
		public String toString() {
			return "FIR [id=" + id + ", offence_id=" + offence_id + ", complaint_id=" + complaint_id
					+ ", fir_date=" + fir_date + ", assigned_to=" + assigned_to + ", status="
					+ status + ", priority=" + priority + ", complaint_date=" + complaint_date + ", remarks=" + remarks
					+ ", action_taken=" + action_taken + ", section_of_ipc=" + section_of_ipc + ", fir_flag=" + fir_flag
					+ ", accused=" + accused + "]";
		}
		
		
	
		  
	  
}
