package com.cdac.efir.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.cdac.efir.model.Address;

@Repository
public interface AddresssRepository extends JpaRepository<Address, String>{

}