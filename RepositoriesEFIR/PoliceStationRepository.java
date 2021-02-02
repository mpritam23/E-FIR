package com.cdac.efir.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdac.efir.model.PoliceStation;

@Repository
public interface PoliceStationRepository extends JpaRepository<PoliceStation, String>{

}