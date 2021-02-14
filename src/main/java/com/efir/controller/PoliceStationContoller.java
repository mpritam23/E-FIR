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

import com.efir.model.PoliceStation;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class PoliceStationContoller {
	@GetMapping("/policestations")
	 public ResponseEntity<List<PoliceStation>> getAllPoliceStation(@RequestParam(required = false) String title) {
		return null;
		    
		  }
	@GetMapping("/policestations/{id}")
	  public ResponseEntity<PoliceStation> getPoliceStationById(@PathVariable("id") long id) {
		return null;
	   
	  }
	@PostMapping("/policestations")
	  public ResponseEntity<PoliceStation> addPoliceStation(@RequestBody PoliceStation policestation) {
		return null;
	    
	  }

	  @PutMapping("/policestations/{id}")
	  public ResponseEntity<PoliceStation> updatePoliceStation(@PathVariable("id") long id, @RequestBody PoliceStation policestation) {
		return null;
	    
	  }

	  @DeleteMapping("/policestations/{id}")
	  public ResponseEntity<HttpStatus> deletePoliceStation(@PathVariable("id") long id) {
		return null;
	   
	  }

	  @DeleteMapping("/policestations")
	  public ResponseEntity<HttpStatus> deleteAllPoliceStation() {
		return null;
	   
	  }

	  @GetMapping("/policestations/..")
	  public ResponseEntity<List<PoliceStation>> findByPublished() {
		return null;
	    
	  }
}
