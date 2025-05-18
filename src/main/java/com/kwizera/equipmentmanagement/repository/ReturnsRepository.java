package com.kwizera.equipmentmanagement.repository;

import com.kwizera.equipmentmanagement.entities.Equipment;
import com.kwizera.equipmentmanagement.entities.Returns;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReturnsRepository extends JpaRepository<Returns, Long> {

}
