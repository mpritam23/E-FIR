package com.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/efir")
public class CivilianController {
	@GetMapping("/civilian")
	 public ResponseEntity<List<Civilian>> getAllCivilians(@RequestParam(required = false) String title) {
		    
		  }
	 @GetMapping("/civilian/{id}")
	  public ResponseEntity<Civilian> getCivilianById(@PathVariable("id") long id) {
	   
	  }

	  @PostMapping("/civilian")
	  public ResponseEntity<Civilian> addCivilian(@RequestBody Civilian civilian) {
	    
	  }

	  @PutMapping("/civilian/{id}")
	  public ResponseEntity<Civilian> updateCivilian(@PathVariable("id") long id, @RequestBody Civilian civilian) {
	    
	  }

	  @DeleteMapping("/civilian/{id}")
	  public ResponseEntity<HttpStatus> deleteCivilian(@PathVariable("id") long id) {
	   
	  }

	  @DeleteMapping("/civilian")
	  public ResponseEntity<HttpStatus> deleteAllCivilians() {
	   
	  }

	  @GetMapping("/civilian/...")
	  public ResponseEntity<List<Civilian>> findBy() {
	   
	  }
}
