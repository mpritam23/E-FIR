package com.cdac.efir.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdac.efir.model.FIR;

@Repository
public interface FIRRepository extends JpaRepository<FIR, String>{

}