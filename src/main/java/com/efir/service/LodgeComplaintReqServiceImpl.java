package com.efir.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.efir.dao.LodgeComplaintReqRepository;

@Service
public class LodgeComplaintReqServiceImpl implements LodgeComplaintReqService {

	@Autowired
	private LodgeComplaintReqRepository lDao;
	
}
