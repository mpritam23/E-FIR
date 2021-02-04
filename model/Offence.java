package com.demo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

import com.demo.model.FIR;

@Entity
@Table(name = "offence")
public class Offence {
	
	@Id
	@Column(name = "offence_id")
		String offence_id;
	
	@Column(name = "offence_type")
		String offence_type;
	
	@ManyToMany
	@JoinTable(
			name="FIR_Offence",
			joinColumns= {@JoinColumn(name="fir_id")},
			inverseJoinColumns= {@JoinColumn(name="offence_id")}
			)
	Set<FIR> firlist=new HashSet<>();
		
		public Offence() {
			super();
		}
		
		public Offence(String offence_id, String offence_type) {
			super();
			this.offence_id = offence_id;
			this.offence_type = offence_type;
		}
		
		public String getOffence_id() {
			return offence_id;
		}
		public void setOffence_id(String offence_id) {
			this.offence_id = offence_id;
		}
		public String getOffence_type() {
			return offence_type;
		}
		public void setOffence_type(String offence_type) {
			this.offence_type = offence_type;
		}

		@Override
		public String toString() {
			return "Offence [offence_id=" + offence_id + ", offence_type=" + offence_type + "]";
		}
		
		

}
