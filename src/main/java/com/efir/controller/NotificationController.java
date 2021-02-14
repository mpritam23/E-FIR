package com.efir.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.efir.model.Notification;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/efir")
public class NotificationController {
	@GetMapping("/notifications")
	 public ResponseEntity<List<Notification>> getAllNotifications(@RequestParam(required = false) String title) {
		return null;
		    
		  }
	@GetMapping("/notifications/{id}")
	  public ResponseEntity<Notification> getNotificationById(@PathVariable("id") long id) {
		return null;
	   
	  }
	@DeleteMapping("/notifications/{id}")
	  public ResponseEntity<HttpStatus> deleteNotification(@PathVariable("id") long id) {
		return null;
	   
	  }
	@GetMapping("/notifications/flag")
	  public ResponseEntity<List<Notification>> findByFlag() {
		return null;
	  
	  }

}
