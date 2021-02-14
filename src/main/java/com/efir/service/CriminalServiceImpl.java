package com.efir.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.efir.dao.CriminalRepository;

@Service
public class CriminalServiceImpl implements CriminalService {

	@Autowired
	private CriminalRepository cDao;
}
