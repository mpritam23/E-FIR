package com.efir.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.efir.model.PCR;


@Repository
public interface PCRRepository extends JpaRepository<PCR, String>{

}