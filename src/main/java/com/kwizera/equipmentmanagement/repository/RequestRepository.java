package com.kwizera.equipmentmanagement.repository;

import com.kwizera.equipmentmanagement.entities.Equipment;
import com.kwizera.equipmentmanagement.entities.Requests;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepository extends JpaRepository<Requests, Long> {

}
