package com.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/efir")
public class AuthenticationController {
	@GetMapping("/{id}")
	  public ResponseEntity<.....> getById(@PathVariable("id") long id) {
	   
	  }
	@GetMapping("/{id}")
	  public ResponseEntity<.....> getByRole(@PathVariable("id") long id) {
	   
	  }
}
