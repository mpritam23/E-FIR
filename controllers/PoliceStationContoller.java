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

public class PoliceStationContoller {
	@GetMapping("/policestations")
	 public ResponseEntity<List<PoliceStation>> getAllPoliceStation(@RequestParam(required = false) String title) {
		    
		  }
	@GetMapping("/policestations/{id}")
	  public ResponseEntity<PoliceStation> getPoliceStationById(@PathVariable("id") long id) {
	   
	  }
	@PostMapping("/policestations")
	  public ResponseEntity<PoliceStation> addPoliceStation(@RequestBody PoliceStation policestation) {
	    
	  }

	  @PutMapping("/policestations/{id}")
	  public ResponseEntity<PoliceStation> updatePoliceStation(@PathVariable("id") long id, @RequestBody PoliceStation policestation) {
	    
	  }

	  @DeleteMapping("/policestations/{id}")
	  public ResponseEntity<HttpStatus> deletePoliceStation(@PathVariable("id") long id) {
	    ...
	  }

	  @DeleteMapping("/policestations")
	  public ResponseEntity<HttpStatus> deleteAllPoliceStation() {
	    ...
	  }

	  @GetMapping("/policestations/..")
	  public ResponseEntity<List<PoliceStation>> findByPublished() {
	    ...
	  }
}
