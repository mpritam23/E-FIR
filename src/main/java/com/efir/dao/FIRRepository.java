package com.efir.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.efir.model.FIR;

@Repository
public interface FIRRepository extends JpaRepository<FIR, String>{

}