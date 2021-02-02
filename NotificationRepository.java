package com.cdac.efir.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdac.efir.model.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, int>{

}