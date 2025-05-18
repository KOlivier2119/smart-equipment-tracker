package com.kwizera.equipmentmanagement.repository;

import com.kwizera.equipmentmanagement.entities.Allocation_logs;
import com.kwizera.equipmentmanagement.entities.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AllocationRepository extends JpaRepository<Allocation_logs, Long> {

}
