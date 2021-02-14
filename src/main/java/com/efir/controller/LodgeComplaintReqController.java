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

import com.efir.model.LodgeComplaintReq;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/efir")
public class LodgeComplaintReqController {
	@GetMapping("/lodgecomplaintreq")
	 public ResponseEntity<List<LodgeComplaintReq>> getAllLodgeComplaintReq(@RequestParam(required = false) String title) {
		return null;
		    
		  }
	@GetMapping("/lodgecomplaintreq/{id}")
	  public ResponseEntity<LodgeComplaintReq> getLodgeComplaintReqById(@PathVariable("id") long id) {
		return null;
	   
	  }
	@PostMapping("/lodgecomplaintreq")
	  public ResponseEntity<LodgeComplaintReq> addLodgeComplaintReq(@RequestBody LodgeComplaintReq lodgecomplaintreq) {
		return null;
	    
	  }

	  @PutMapping("/lodgecomplaintreq/{id}")
	  public ResponseEntity<LodgeComplaintReq> updateLodgeComplaintReq(@PathVariable("id") long id, @RequestBody LodgeComplaintReq lodgecomplaintreq) {
		return null;
	    
	  }

	  @DeleteMapping("/lodgecomplaintreq/{id}")
	  public ResponseEntity<HttpStatus> deleteLodgeComplaintReq(@PathVariable("id") long id) {
		return null;
	   
	  }

	  @DeleteMapping("/lodgecomplaintreq")
	  public ResponseEntity<HttpStatus> deleteAllLodgeComplaintReq() {
		return null;
	   
	  }
}
