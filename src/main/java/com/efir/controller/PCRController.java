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

import com.efir.model.Police;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class PCRController {
	

	 @GetMapping("/police/{Ps_id}")
	  public ResponseEntity<Police> getByPSId(@PathVariable("Ps_id") long id) {
		return null;
	   
	  }
	  @GetMapping("/police/..")
	  public ResponseEntity<List<Police>> findByPSId() {
		return null;
	   
	  }
}
