package com.efir.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.efir.model.LodgeComplaintReq;

@Repository
public interface LodgeComplaintReqRepository extends JpaRepository<LodgeComplaintReq, String>{

}