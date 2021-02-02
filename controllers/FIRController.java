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

import com.demo.model.FIR;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/efir")
public class FIRController {
	@GetMapping("/firs")
	 public ResponseEntity<List<FIR>> getAllFIR(@RequestParam(required = false) String title) {
		return null;
		    
		  }
	@GetMapping("/firs/{id}")
	  public ResponseEntity<FIR> getFIRById(@PathVariable("id") long id) {
		return null;
	   
	  }
	@PostMapping("/policestations")
	  public ResponseEntity<FIR> addFIR(@RequestBody FIR fir) {
		return null;
	    
	  }

	  @PutMapping("/firs/{id}")
	  public ResponseEntity<FIR> updateFIR(@PathVariable("id") long id, @RequestBody FIR fir) {
		return null;
	    
	  }

	  @DeleteMapping("/firs/{id}")
	  public ResponseEntity<HttpStatus> deleteFIR(@PathVariable("id") long id) {
		return null;
	
	  }

	  @DeleteMapping("/firs")
	  public ResponseEntity<HttpStatus> deleteAllFIR() {
		return null;
	    
	  }

	 
}
