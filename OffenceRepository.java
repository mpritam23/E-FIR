package com.cdac.efir.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdac.efir.model.Offence;

@Repository
public interface OffenceRepository extends JpaRepository<Offence, String>{

}