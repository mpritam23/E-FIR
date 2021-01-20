package com.demo.bean;

public class Notification {
		int notification_id;
		String content;
		String flag;
		String sender_id;
		String receiver_id;
		String header;
		
		public Notification() {
			super();
		}
		
		public Notification(int notification_id, String content, String flag, String sender_id, String receiver_id,
				String header) {
			super();
			this.notification_id = notification_id;
			this.content = content;
			this.flag = flag;
			this.sender_id = sender_id;
			this.receiver_id = receiver_id;
			this.header = header;
		}
		public int getNotification_id() {
			return notification_id;
		}
		public void setNotification_id(int notification_id) {
			this.notification_id = notification_id;
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
		
		
}
