package com.efir.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.efir.dao.CitizenRepository;
import com.efir.model.Citizen;

@Service
@Transactional()
public class CitizenServiceImpl implements CitizenService {

	@Autowired
	CitizenRepository cDao;

	@Override
	public Citizen addCitizen(Citizen citizen) {
		return cDao.saveAndFlush(citizen);
	}

	@Override
	public List<Citizen> getAll() {
		return cDao.findAll();
	}

	@Override
	public Citizen getById(String citizen_id) {
		
		return cDao.findOne(citizen_id);
	}
}
