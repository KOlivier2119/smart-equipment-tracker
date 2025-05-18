package com.kwizera.equipmentmanagement.controllers;

import com.kwizera.equipmentmanagement.entities.Allocation_logs;
import com.kwizera.equipmentmanagement.entities.Equipment;
import com.kwizera.equipmentmanagement.entities.Requests;
import com.kwizera.equipmentmanagement.services.AllocationServices;
import com.kwizera.equipmentmanagement.services.EquipmentServices;
import com.kwizera.equipmentmanagement.services.RequestServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/allocations")
@RequiredArgsConstructor
public class AllocationController {
    private final AllocationServices allocationServices;

    @GetMapping
    public ResponseEntity<List<Allocation_logs>> findAll() {
        return ResponseEntity.ok(allocationServices.findAllAllocationLogs());
    }

    @PostMapping
    public ResponseEntity<Allocation_logs> create(@RequestBody Allocation_logs allocation) {
        return ResponseEntity.ok(allocationServices.saveAllocationLog(allocation));
    }
}
