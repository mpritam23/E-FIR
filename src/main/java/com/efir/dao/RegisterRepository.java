package com.efir.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.efir.model.Register;


@Repository
public interface RegisterRepository extends JpaRepository<Register, String>{

}