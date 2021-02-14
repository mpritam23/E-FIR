package com.efir.service;

import java.util.List;

import com.efir.model.Citizen;

public interface CitizenService {

	Citizen addCitizen(Citizen citizen);

	List<Citizen> getAll();

	Citizen getById(String id);

}
