package com.efir.controller;

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

import com.efir.model.Criminal;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/efir")
public class CriminalController {
	@GetMapping("/criminals")
	 public ResponseEntity<List<Criminal>> getAllPolice(@RequestParam(required = false) String title) {
		return null;
		    
		  }
	@GetMapping("/criminals/{id}")
	  public ResponseEntity<Criminal> getCriminalById(@PathVariable("id") long id) {
		return null;
	   
	  }
	@PostMapping("/criminals")
	  public ResponseEntity<Criminal> addCriminal(@RequestBody Criminal criminal) {
		return null;
	    
	  }

	  @PutMapping("/criminals/{id}")
	  public ResponseEntity<Criminal> updateCriminal(@PathVariable("id") long id, @RequestBody Criminal criminal) {
		return null;
	    
	  }

	  @DeleteMapping("/criminals/{id}")
	  public ResponseEntity<HttpStatus> deleteCriminal(@PathVariable("id") long id) {
		return null;
		
	   
	  }

	  @DeleteMapping("/criminals")
	  public ResponseEntity<HttpStatus> deleteAllCriminals() {
		return null;
	   
	  }

	  @GetMapping("/criminals/...")
	  public ResponseEntity<List<Criminal>> findByFIR() {
		return null;
	   
	  }
}
