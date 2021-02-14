package com.efir.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "_notification")
public class Notification {
	
	@Id
	@Column(name = "id")
		int id;
	
	@Column(name = "content")
		String content;
	
	@Column(name = "flag")
		String flag;
	
	@Column(name = "sender_id")
		String sender_id;
	
	@Column(name = "receiver_id")
		String receiver_id;
	
	@Column(name = "header")
		String header;
	
		
		  @OneToMany(mappedBy="noti") Set<PoliceStation> reg=new HashSet<>();
		 
		
		public Notification() {
			super();
		}
		
		public Notification(int id, String content, String flag, String sender_id, String receiver_id,
				String header) {
			super();
			this.id = id;
			this.content = content;
			this.flag = flag;
			this.sender_id = sender_id;
			this.receiver_id = receiver_id;
			this.header = header;
		}
		public int getid() {
			return id;
		}
		public void setid(int id) {
			this.id = id;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public String getFlag() {
			return flag;
		}
		public void setFlag(String flag) {
			this.flag = flag;
		}
		public String getSender_id() {
			return sender_id;
		}
		public void setSender_id(String sender_id) {
			this.sender_id = sender_id;
		}
		public String getReceiver_id() {
			return receiver_id;
		}
		public void setReceiver_id(String receiver_id) {
			this.receiver_id = receiver_id;
		}
		public String getHeader() {
			return header;
		}
		public void setHeader(String header) {
			this.header = header;
		}

		@Override
		public String toString() {
			return "Notification [id=" + id + ", content=" + content + ", flag=" + flag
					+ ", sender_id=" + sender_id + ", receiver_id=" + receiver_id + ", header=" + header + "]";
		}
		
		
		
		
}
