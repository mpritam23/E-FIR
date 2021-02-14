package com.efir.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.efir.dao.FIRRepository;

@Service
public class FIRServiceImpl implements FIRService {

	@Autowired
	private FIRRepository fDao;
	
}
