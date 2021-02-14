package com.efir.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.efir.model.Address;

@Repository
public interface AddresssRepository extends JpaRepository<Address, String>{

}