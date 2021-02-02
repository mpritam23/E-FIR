package com.cdac.efir.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdac.efir.model.Police;

@Repository
public interface PoliceRepository extends JpaRepository<Police, String>{

}