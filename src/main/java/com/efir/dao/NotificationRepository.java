package com.efir.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.efir.model.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Integer>{

}