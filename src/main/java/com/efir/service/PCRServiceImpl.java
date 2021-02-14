package com.efir.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.efir.dao.PCRRepository;

@Service
public class PCRServiceImpl implements PCRService {

	@Autowired
	private PCRRepository pDao;
}
