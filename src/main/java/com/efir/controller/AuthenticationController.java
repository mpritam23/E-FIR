package com.efir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.efir.model.Citizen;
import com.efir.model.Register;
import com.efir.service.AuthenticationService;
import com.efir.service.CitizenService;

@CrossOrigin( origins="http://localhost:4200")
@RestController
public class AuthenticationController {

	@Autowired
	CitizenService cService;
	
	@Autowired
	AuthenticationService aService; 
	
	
	@GetMapping("/register")
	public List<Register> getAll(){
		return aService.getAll();
	}
	/*
	 * @GetMapping("/register/{id}") public List<Register> getUSerById(@PathVariable
	 * String id ){ return aService.getById(id); }
	 */
	
	@PostMapping(path="/citizen",headers="Accept=application/json")
	public Citizen addCitizen(@RequestBody Citizen citizen)
	{
		
		Citizen c=new Citizen(citizen.getid(),citizen.getCitizen_name(),citizen.getCitizen_email(),citizen.getCitizen_contactNo(),citizen.getCitizen_password());
		Citizen citizenRegistered=cService.addCitizen(c);
		System.out.println(citizenRegistered);
		Register r=new Register(citizenRegistered.getid(),citizenRegistered.getCitizen_password(),"citizen");
		System.out.println(citizenRegistered+"\n"+r);
		aService.addUser(r);
		return citizenRegistered;
	}
}
