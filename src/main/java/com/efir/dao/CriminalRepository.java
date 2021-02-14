package com.efir.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.efir.model.Criminal;

@Repository
public interface CriminalRepository extends JpaRepository<Criminal, String>{

}