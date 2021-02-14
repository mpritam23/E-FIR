package com.efir.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.efir.dao.PoliceStationRepository;

@Service
public class PoliceStationServiceImpl implements PoliceStationService {

	@Autowired
	private PoliceStationRepository pDao; 
}
