package com.efir.service;

import java.util.List;

import com.efir.model.Citizen;
import com.efir.model.Register;

public interface AuthenticationService {

	Register addUser(Register r);

	List<Register> getAll();

}
