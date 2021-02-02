package com.cdac.efir.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdac.efir.model.PCR;

@Repository
public interface PCRRepository extends JpaRepository<PCR, String>{

}