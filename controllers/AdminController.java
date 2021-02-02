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
public class AdminController {
	@GetMapping("/police")
	 public ResponseEntity<List<Police>> getAllPolice(@RequestParam(required = false) String title) {
		    
		  }
	 @GetMapping("/police/{id}")
	  public ResponseEntity<Police> getPoliceById(@PathVariable("id") long id) {
	   
	  }

	  @PostMapping("/police")
	  public ResponseEntity<Police> addPolice(@RequestBody Police police) {
	    
	  }

	  @PutMapping("/police/{id}")
	  public ResponseEntity<Police> updatePolice(@PathVariable("id") long id, @RequestBody Police police) {
	    
	  }

	  @DeleteMapping("/police/{id}")
	  public ResponseEntity<HttpStatus> deletePolice(@PathVariable("id") long id) {
	   
	  }

	  @DeleteMapping("/tutorials")
	  public ResponseEntity<HttpStatus> deleteAllPolice() {
	   
	  }

	  @GetMapping("/tutorials/published")
	  public ResponseEntity<List<Police>> findByFIR() {
	   
	  }
	}
}
