CREATE TABLE `address` (
  `address_id` varchar(8) NOT NULL,
  `street` varchar(45) NOT NULL,
  `city` varchar(45) NOT NULL,
  `taluka` varchar(45) NOT NULL,
  `district` varchar(45) NOT NULL,
  `state` varchar(45) NOT NULL,
  `pincode` int NOT NULL,
  PRIMARY KEY (`address_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `citizen_register` (
  `citizen_id` varchar(5) NOT NULL,
  `citizen_name` varchar(45) DEFAULT NULL,
  `citizen_email` varchar(45) DEFAULT NULL,
  `citizen_contactNo` varchar(45) DEFAULT NULL,
  `citizen_password` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`citizen_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `criminal` (
  `criminal_id` varchar(8) NOT NULL,
  `criminal_name` varchar(75) NOT NULL,
  `offence_id` varchar(10) NOT NULL,
  `fir_id` varchar(12) NOT NULL,
  `age` int NOT NULL,
  `gender` varchar(45) NOT NULL,
  `dob` date NOT NULL,
  `height` double NOT NULL,
  `weight` double NOT NULL,
  `picture` blob NOT NULL,
  `criminal_type` varchar(45) NOT NULL,
  PRIMARY KEY (`criminal_id`),
  UNIQUE KEY `criminal_id_UNIQUE` (`criminal_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `fir` (
  `fir_id` varchar(11) NOT NULL,
  `offence_id` varchar(8) NOT NULL,
  `complaint_id` varchar(11) NOT NULL,
  `ps_id` varchar(10) NOT NULL,
  `fir_date` date NOT NULL,
  `assigned_to` varchar(6) NOT NULL,
  `status` varchar(10) NOT NULL,
  `priority` varchar(10) NOT NULL,
  `complaint_date` date NOT NULL,
  `remarks` varchar(254) NOT NULL,
  `action_taken` varchar(254) NOT NULL,
  `section_of_ipc` varchar(254) NOT NULL,
  `fir_flag` int NOT NULL,
  `accused` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`fir_id`),
  KEY `ps_id_fk_idx` (`ps_id`),
  KEY `offence_id_fk_idx` (`offence_id`),
  KEY `assigned_to_fk_idx` (`assigned_to`),
  KEY `complaintfiled_id_fk_idx` (`complaint_id`),
  KEY `complainetfiled_date_fk_idx` (`complaint_date`),
  KEY `accused_fk_idx` (`accused`),
  CONSTRAINT `assigned_to_fk` FOREIGN KEY (`assigned_to`) REFERENCES `police` (`police_id`),
  CONSTRAINT `complainetfiled_date_fk` FOREIGN KEY (`complaint_date`) REFERENCES `police_station` (`complaint_date`),
  CONSTRAINT `complaintfiled_id_fk` FOREIGN KEY (`complaint_id`) REFERENCES `police_station` (`complaint_id`),
  CONSTRAINT `criminalid_fk` FOREIGN KEY (`accused`) REFERENCES `criminal` (`criminal_id`),
  CONSTRAINT `offence_id_fk` FOREIGN KEY (`offence_id`) REFERENCES `offence` (`offence_id`),
  CONSTRAINT `psid_fk` FOREIGN KEY (`ps_id`) REFERENCES `police_station` (`ps_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `lodge_complaint_req` (
  `complaint_req_id` varchar(12) NOT NULL,
  `address_id` varchar(8) NOT NULL,
  `complaint_date` date NOT NULL,
  `username` varchar(75) NOT NULL,
  `id_proof_type` varchar(45) NOT NULL,
  `id_proof` varchar(45) NOT NULL,
  `incident_date_time` datetime NOT NULL,
  `description` varchar(245) NOT NULL,
  `contact_no` bigint NOT NULL,
  `email_id` varchar(45) NOT NULL,
  `loc_of_incident_id` varchar(9) NOT NULL,
  `remarks` varchar(245) NOT NULL,
  `action_taken` varchar(245) NOT NULL,
  PRIMARY KEY (`complaint_req_id`),
  UNIQUE KEY `complaint_req_id_UNIQUE` (`complaint_req_id`),
  KEY `addrid_fk_idx` (`address_id`),
  KEY `loc_od_incident_fk_idx` (`loc_of_incident_id`),
  CONSTRAINT `addrid_fk` FOREIGN KEY (`address_id`) REFERENCES `address` (`address_id`),
  CONSTRAINT `loc_of_incident_fk` FOREIGN KEY (`loc_of_incident_id`) REFERENCES `address` (`address_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `notification` (
  `notification_id` int NOT NULL,
  `content` varchar(245) NOT NULL,
  `flag` varchar(45) NOT NULL,
  `sender_id` varchar(10) NOT NULL,
  `receiver_id` varchar(10) NOT NULL,
  `header` varchar(45) NOT NULL,
  PRIMARY KEY (`notification_id`),
  UNIQUE KEY `notification_id_UNIQUE` (`notification_id`),
  KEY `sender_fk_idx` (`sender_id`),
  KEY `receiver_fk_idx` (`receiver_id`),
  CONSTRAINT `receiver_fk` FOREIGN KEY (`receiver_id`) REFERENCES `police_station` (`ps_id`),
  CONSTRAINT `sender_fk` FOREIGN KEY (`sender_id`) REFERENCES `police_station` (`ps_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `offence` (
  `offence_id` varchar(8) NOT NULL,
  `offence_type` varchar(45) NOT NULL,
  PRIMARY KEY (`offence_id`),
  UNIQUE KEY `offence_id_UNIQUE` (`offence_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `pcr` (
  `complaint_req_id` varchar(12) NOT NULL,
  `police_id` varchar(6) NOT NULL,
  `ps_id` varchar(10) NOT NULL,
  `priority` varchar(10) DEFAULT NULL,
  `status` varchar(10) NOT NULL,
  PRIMARY KEY (`complaint_req_id`),
  UNIQUE KEY `complaint_req_id_UNIQUE` (`complaint_req_id`),
  KEY `ps_id_fk_idx` (`ps_id`),
  KEY `police_id_fk_idx` (`police_id`),
  CONSTRAINT `pcr_ps_id_fk` FOREIGN KEY (`ps_id`) REFERENCES `police_station` (`ps_id`),
  CONSTRAINT `police_id_fk` FOREIGN KEY (`police_id`) REFERENCES `police` (`police_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `police` (
  `police_id` varchar(6) NOT NULL,
  `ps_id` varchar(10) NOT NULL,
  `police_name` varchar(75) NOT NULL,
  `senior_incharge` varchar(6) NOT NULL,
  `rank` varchar(20) NOT NULL,
  `doj` date NOT NULL,
  `dob` date NOT NULL,
  PRIMARY KEY (`police_id`),
  UNIQUE KEY `police_id_UNIQUE` (`police_id`),
  KEY `ps_id_fk_idx` (`ps_id`),
  KEY `senior_ic_fk_idx` (`senior_incharge`),
  CONSTRAINT `ps_id_fk` FOREIGN KEY (`ps_id`) REFERENCES `police_station` (`ps_id`),
  CONSTRAINT `senior_ic_fk` FOREIGN KEY (`senior_incharge`) REFERENCES `police` (`police_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `police_station` (
  `ps_id` varchar(10) NOT NULL,
  `complaint_req_id` varchar(12) NOT NULL,
  `complaint_id` varchar(11) NOT NULL,
  `ps_name` varchar(45) NOT NULL,
  `head` varchar(6) NOT NULL,
  `no_of_staff` int NOT NULL,
  `contact_no` bigint NOT NULL,
  `complaint_date` date NOT NULL,
  `priority` varchar(10) NOT NULL,
  `remarks` varchar(254) NOT NULL,
  `address_id` varchar(8) NOT NULL,
  `role` varchar(10) NOT NULL,
  PRIMARY KEY (`ps_id`),
  KEY `addr_fk_idx` (`address_id`),
  KEY `complaint_req_fk_idx` (`complaint_req_id`),
  KEY `head_fk_idx` (`head`),
  KEY `complaint_date_fk_idx` (`complaint_date`),
  KEY `complaint_filed_id` (`complaint_id`),
  KEY `complaint_fild_date_idx` (`complaint_date`) /*!80000 INVISIBLE */,
  KEY `roles_fk_idx` (`role`),
  CONSTRAINT `addr_fk` FOREIGN KEY (`address_id`) REFERENCES `address` (`address_id`),
  CONSTRAINT `complaint_req_id_fk` FOREIGN KEY (`complaint_req_id`) REFERENCES `lodge_complaint_req` (`complaint_req_id`),
  CONSTRAINT `head_fk` FOREIGN KEY (`head`) REFERENCES `police` (`police_id`),
  CONSTRAINT `roles_fk` FOREIGN KEY (`role`) REFERENCES `register` (`role`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `register` (
  `id` varchar(10) NOT NULL,
  `password` varchar(45) NOT NULL,
  `role` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `role_idx` (`role`),
  CONSTRAINT `citizen_id_fk` FOREIGN KEY (`id`) REFERENCES `citizen_register` (`citizen_id`),
  CONSTRAINT `id_fk` FOREIGN KEY (`id`) REFERENCES `police_station` (`ps_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
