package com.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

public class NotificationController {
	@GetMapping("/notifications")
	 public ResponseEntity<List<Notification>> getAllNotifications(@RequestParam(required = false) String title) {
		    
		  }
	@GetMapping("/notifications/{id}")
	  public ResponseEntity<Notification> getNotificationById(@PathVariable("id") long id) {
	   
	  }
	@DeleteMapping("/notifications/{id}")
	  public ResponseEntity<HttpStatus> deleteNotification(@PathVariable("id") long id) {
	    ...
	  }
	@GetMapping("/notifications/flag")
	  public ResponseEntity<List<Notification>> findByFlag() {
	    ...
	  }

}
