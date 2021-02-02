package com.cdac.efir.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdac.efir.model.Register;

@Repository
public interface RegisterRepository extends JpaRepository<Register, String>{

}