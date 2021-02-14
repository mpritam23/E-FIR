package com.efir.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "_offence")
public class Offence {
	
	@Id
	@Column(name = "id")
		String id;
	
	@Column(name = "offence_type")
		String offence_type;
	
		
		  @ManyToMany
		  
		  @JoinTable( name="FIR_Offence", joinColumns= {@JoinColumn(name="fir_id")},
		  inverseJoinColumns= {@JoinColumn(name="offence_id")} ) Set<FIR> firlist=new
		  HashSet<>();
		 
		
		public Offence() {
			super();
		}
		
		public Offence(String id, String offence_type) {
			super();
			this.id = id;
			this.offence_type = offence_type;
		}
		
		public String getid() {
			return id;
		}
		public void setid(String id) {
			this.id = id;
		}
		public String getOffence_type() {
			return offence_type;
		}
		public void setOffence_type(String offence_type) {
			this.offence_type = offence_type;
		}

		@Override
		public String toString() {
			return "Offence [id=" + id + ", offence_type=" + offence_type + "]";
		}
		
		

}
