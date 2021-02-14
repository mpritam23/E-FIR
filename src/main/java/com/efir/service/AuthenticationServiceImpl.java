package com.efir.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.efir.dao.RegisterRepository;
import com.efir.model.Register;

@Service
@Transactional()
public class AuthenticationServiceImpl implements AuthenticationService {

	@Autowired 
	RegisterRepository rDao;

	@Override
	public Register addUser(Register regUser) {
		
		return rDao.saveAndFlush(regUser);
	}

	@Override
	public List<Register> getAll() {
		
		return rDao.findAll();
	}
}
