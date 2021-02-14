package com.efir.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.efir.model.PoliceStation;



@Repository
public interface PoliceStationRepository extends JpaRepository<PoliceStation, String>{

}