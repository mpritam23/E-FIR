package com.demo.controller;

import java.util.List;

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

import com.demo.model.Citizen;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/efir")
public class CitizenController {
	@GetMapping("/citizen")
	 public ResponseEntity<List<Citizen>> getAllCitizens(@RequestParam(required = false) String title) {
		return null;
		    
		  }
	 @GetMapping("/citizen/{id}")
	  public ResponseEntity<Citizen> getCitizenById(@PathVariable("id") long id) {
		return null;
	   
	  }

	  @PostMapping("/citizen")
	  public ResponseEntity<Citizen> addCitizen(@RequestBody Citizen citizen) {
		return null;
	    
	  }

	  @PutMapping("/citizen/{id}")
	  public ResponseEntity<Citizen> updateCitizen(@PathVariable("id") long id, @RequestBody Citizen citizen) {
		return null;
	    
	  }

	  @DeleteMapping("/citizen/{id}")
	  public void deleteCivilian(@PathVariable("id") long id) {
	   
	  }

	  @DeleteMapping("/citizen")
	  public ResponseEntity<HttpStatus> deleteAllCitizens() {
		return null;
	   
	  }

	  @GetMapping("/citizen/...")
	  public ResponseEntity<List<Citizen>> findBy() {
		return null;
	   
	  }
}
