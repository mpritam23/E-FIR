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
public class CriminalController {
	@GetMapping("/criminals")
	 public ResponseEntity<List<Criminals>> getAllPolice(@RequestParam(required = false) String title) {
		    
		  }
	@GetMapping("/criminals/{id}")
	  public ResponseEntity<Criminals> getCriminalById(@PathVariable("id") long id) {
	   
	  }
	@PostMapping("/criminals")
	  public ResponseEntity<Criminals> addCriminals(@RequestBody Criminals criminal) {
	    
	  }

	  @PutMapping("/criminals/{id}")
	  public ResponseEntity<Criminals> updatePolice(@PathVariable("id") long id, @RequestBody Criminals criminal) {
	    
	  }

	  @DeleteMapping("/criminals/{id}")
	  public ResponseEntity<HttpStatus> deleteCriminals(@PathVariable("id") long id) {
	   
	  }

	  @DeleteMapping("/criminals")
	  public ResponseEntity<HttpStatus> deleteAllCriminals() {
	   
	  }

	  @GetMapping("/criminals/...")
	  public ResponseEntity<List<Criminals>> findByFIR() {
	   
	  }
}
