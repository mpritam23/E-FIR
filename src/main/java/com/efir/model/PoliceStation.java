package com.efir.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


@Entity
@Table(name = "_police_station")
public class PoliceStation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "PoliceStationIdSeq")
	@GenericGenerator(name = "PoliceStationIdSeq",
						strategy = "com.efir.model.SequenceIdGenerator",
						parameters = {
								@Parameter(name=SequenceIdGenerator.INCREMENT_PARAM,value="9999"),
								@Parameter(name=SequenceIdGenerator.VALUE_PREFIX_PARAMETER,value="C" ),
								@Parameter(name=SequenceIdGenerator.NUMBER_FORMAT_PARAMETER,value="%04d")
						}
	)
	String id;
	
	@Column(name = "complaint_req_id")
	String complaint_req_id;
	
	@Column(name = "complaint_id")
	String complaint_id;
	
	@Column(name = "ps_name")
	String ps_name;
	
	@Column(name = "head")
	String head;
	
	@Column(name = "no_of_staff")
	int no_of_staff;
	
	@Column(name = "contact_no")
	int contact_no;
	
	@Column(name = "complaint_date")
	Date complaint_date;
	
	@Column(name = "priority")
	String priority;
	
	@Column(name = "remarks")
	String remarks;
	
	@Column(name = "role")
	String role;
	
	/*@OneToMany(mappedBy="ps")
	Set<Police> pol=new HashSet<>();*/
	
	@OneToMany(mappedBy="ps")
	private Set<FIR> firs=new HashSet<>();
	
	@OneToOne
	@JoinColumn(name="address_id")
	Address addr;
	
	
	
	@ManyToOne
	@JoinColumn(name="notification_id")
	Notification noti;
	
	
	 
	public PoliceStation() {
		super();
	}
	public PoliceStation(String id, String complaint_id, String ps_name, String head,String complaint_req_id,
			int no_of_staff, int contact_no, Date complaint_date, String priority, String remarks,
			String role) {
		super();
		this.id = id;
		this.complaint_req_id = complaint_req_id;
		this.complaint_id = complaint_id;
		this.ps_name = ps_name;
		this.head = head;
		this.no_of_staff = no_of_staff;
		this.contact_no = contact_no;
		this.complaint_date = complaint_date;
		this.priority = priority;
		this.remarks = remarks;
		this.role = role;
	}
	public String getid() {
		return id;
	}
	public void setid(String id) {
		this.id = id;
	}
	/*public String getComplaint_req_id() {
		return complaint_req_id;
	}
	public void setComplaint_req_id(String complaint_req_id) {
		this.complaint_req_id = complaint_req_id;
	}*/
	public String getComplaint_id() {
		return complaint_id;
	}
	public void setComplaint_id(String complaint_id) {
		this.complaint_id = complaint_id;
	}
	public String getPs_name() {
		return ps_name;
	}
	public void setPs_name(String ps_name) {
		this.ps_name = ps_name;
	}
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	public int getNo_of_staff() {
		return no_of_staff;
	}
	public void setNo_of_staff(int no_of_staff) {
		this.no_of_staff = no_of_staff;
	}
	public int getContact_no() {
		return contact_no;
	}
	public void setContact_no(int contact_no) {
		this.contact_no = contact_no;
	}
	public Date getComplaint_date() {
		return complaint_date;
	}
	public void setComplaint_date(Date complaint_date) {
		this.complaint_date = complaint_date;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "PoliceStation [id=" + id + ", complaint_req_id=" + ", complaint_id="
				+ complaint_id + ", ps_name=" + ps_name + ", head=" + head + ", no_of_staff=" + no_of_staff
				+ ", contact_no=" + contact_no + ", complaint_date=" + complaint_date + ", priority=" + priority
				+ ", remarks=" + remarks + ", role=" + role + "]";
	}
	  
	  

}
