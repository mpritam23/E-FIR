package com.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.model.Police;

public class PCRController {
	@GetMapping("/police")
	 public ResponseEntity<List<Police>> getAllPolice(@RequestParam(required = false) String title) {
		return null;
		    
		  }
	 @GetMapping("/police/{id}")
	  public ResponseEntity<Police> getPoliceById(@PathVariable("id") long id) {
		return null;
	   
	  }
	 @GetMapping("/police/{Ps_id}")
	  public ResponseEntity<Police> getByPSId(@PathVariable("Ps_id") long id) {
		return null;
	   
	  }
	  @GetMapping("/police/..")
	  public ResponseEntity<List<Police>> findByPSId() {
		return null;
	   
	  }
}
