package com.efir.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.efir.model.Offence;


@Repository
public interface OffenceRepository extends JpaRepository<Offence, String>{

}