package com.efir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.efir.model.Citizen;
import com.efir.service.CitizenService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CitizenController {
	
	@Autowired
	CitizenService cService;
	
	@GetMapping("")
	 public List<Citizen> getAllCitizens() {
		return cService.getAll();
		    
		  }
	
	 @GetMapping("/citizen/{id}")
	  public Citizen getCitizenById(@PathVariable("id") String id) {
		return cService.getById(id);
	   
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
