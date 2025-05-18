package com.kwizera.equipmentmanagement.services;

import com.kwizera.equipmentmanagement.entities.Allocation_logs;
import com.kwizera.equipmentmanagement.entities.Equipment;
import com.kwizera.equipmentmanagement.repository.AllocationRepository;
import com.kwizera.equipmentmanagement.repository.EquipmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AllocationServices {
private final AllocationRepository allocationRepository;

public List<Allocation_logs> findAllAllocationLogs() {
    return allocationRepository.findAll();
}

public Allocation_logs saveAllocationLog(Allocation_logs allocationLog) {
    return allocationRepository.save(allocationLog);
}

}
