package com.cdac.efir.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdac.efir.model.LodgeComplaintReq;

@Repository
public interface LodgeComplaintReqRepository extends JpaRepository<LodgeComplaintReq, String>{

}