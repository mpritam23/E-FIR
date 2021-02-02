package com.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public class PCRController {
	@GetMapping("/police")
	 public ResponseEntity<List<Police>> getAllPolice(@RequestParam(required = false) String title) {
		    
		  }
	 @GetMapping("/police/{id}")
	  public ResponseEntity<Police> getPoliceById(@PathVariable("id") long id) {
	   
	  }
	 @GetMapping("/police/{Ps_id}")
	  public ResponseEntity<Police> getByPSId(@PathVariable("Ps_id") long id) {
	   
	  }
	  @GetMapping("/police/..")
	  public ResponseEntity<List<Police>> findByPSId() {
	    ...
	  }
}
