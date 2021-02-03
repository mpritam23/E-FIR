package com.demo.model;

import java.sql.Blob;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "criminal")
public class Criminal {
	
		@Id
		@Column(name = "criminal_id")
		String criminal_id;
		
		@Column(name = "criminal_name")
		String criminal_name;
		
		@Column(name = "offence_id")
		String offence_id;
		
		@Column(name = "fir_id")
		String fir_id;
		
		@Column(name = "age")
		int age;
		
		@Column(name = "gender")
		String gender;
		
		@Column(name = "dob")
		Date dob;
		
		@Column(name = "height")
		Double height;
		
		@Column(name = "weight")
		Double weight;
		
		@Column(name = "picture")
		Blob picture;   
		
		@Column(name = "criminal_type")
		String criminal_type;
		
		@ManyToMany
		@JoinTable(
				name="FIR_Criminal",
				joinColumns= {@JoinColumn(name="fir_id")},
				inverseJoinColumns= {@JoinColumn(name="criminal_id")}
				)
		Set<FIR> fir=new HashSet<>();
		
		public Criminal() {
			super();
			
		}
		
		public Criminal(String criminal_id, String criminal_name, String offence_id, String fir_id, int age,
				String gender, Date dob, Double height, Double weight, Blob picture, String criminal_type) {
			super();
			this.criminal_id = criminal_id;
			this.criminal_name = criminal_name;
			this.offence_id = offence_id;
			this.fir_id = fir_id;
			this.age = age;
			this.gender = gender;
			this.dob = dob;
			this.height = height;
			this.weight = weight;
			this.picture = picture;
			this.criminal_type = criminal_type;
		}
		public String getCriminal_id() {
			return criminal_id;
		}
		public void setCriminal_id(String criminal_id) {
			this.criminal_id = criminal_id;
		}
		public String getCriminal_name() {
			return criminal_name;
		}
		public void setCriminal_name(String criminal_name) {
			this.criminal_name = criminal_name;
		}
		public String getOffence_id() {
			return offence_id;
		}
		public void setOffence_id(String offence_id) {
			this.offence_id = offence_id;
		}
		public String getFir_id() {
			return fir_id;
		}
		public void setFir_id(String fir_id) {
			this.fir_id = fir_id;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public Date getDob() {
			return dob;
		}
		public void setDob(Date dob) {
			this.dob = dob;
		}
		public Double getHeight() {
			return height;
		}
		public void setHeight(Double height) {
			this.height = height;
		}
		public Double getWeight() {
			return weight;
		}
		public void setWeight(Double weight) {
			this.weight = weight;
		}
		public Blob getPicture() {
			return picture;
		}
		public void setPicture(Blob picture) {
			this.picture = picture;
		}
		public String getCriminal_type() {
			return criminal_type;
		}
		public void setCriminal_type(String criminal_type) {
			this.criminal_type = criminal_type;
		}

		@Override
		public String toString() {
			return "Criminal [criminal_id=" + criminal_id + ", criminal_name=" + criminal_name + ", offence_id="
					+ offence_id + ", fir_id=" + fir_id + ", age=" + age + ", gender=" + gender + ", dob=" + dob
					+ ", height=" + height + ", weight=" + weight + ", picture=" + picture + ", criminal_type="
					+ criminal_type + "]";
		}
		
		
}
