package com.kwizera.equipmentmanagement.repository;

import com.kwizera.equipmentmanagement.entities.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipmentRepository extends JpaRepository<Equipment, Long> {

}
