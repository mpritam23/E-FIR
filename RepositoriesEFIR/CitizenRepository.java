package com.cdac.efir.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdac.efir.model.Citizen;

@Repository
public interface CitizenRepository extends JpaRepository<Citizen, String>{

}