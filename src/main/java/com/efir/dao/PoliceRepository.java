package com.efir.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.efir.model.Police;


@Repository
public interface PoliceRepository extends JpaRepository<Police, String>{

}