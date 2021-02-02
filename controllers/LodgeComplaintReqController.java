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

public class LodgeComplaintReqController {
	@GetMapping("/lodgecomplaintreq")
	 public ResponseEntity<List<LodgeComplaintReq>> getAllLodgeComplaintReq(@RequestParam(required = false) String title) {
		    
		  }
	@GetMapping("/lodgecomplaintreq/{id}")
	  public ResponseEntity<LodgeComplaintReq> getLodgeComplaintReqById(@PathVariable("id") long id) {
	   
	  }
	@PostMapping("/lodgecomplaintreq")
	  public ResponseEntity<LodgeComplaintReq> addLodgeComplaintReq(@RequestBody LodgeComplaintReq lodgecomplaintreq) {
	    
	  }

	  @PutMapping("/lodgecomplaintreq/{id}")
	  public ResponseEntity<LodgeComplaintReq> updateLodgeComplaintReq(@PathVariable("id") long id, @RequestBody LodgeComplaintReq lodgecomplaintreq) {
	    
	  }

	  @DeleteMapping("/lodgecomplaintreq/{id}")
	  public ResponseEntity<HttpStatus> deleteLodgeComplaintReq(@PathVariable("id") long id) {
	    ...
	  }

	  @DeleteMapping("/lodgecomplaintreq")
	  public ResponseEntity<HttpStatus> deleteAllLodgeComplaintReq() {
	    ...
	  }
}
