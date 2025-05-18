package com.kwizera.equipmentmanagement.controllers;

import com.kwizera.equipmentmanagement.entities.Equipment;
import com.kwizera.equipmentmanagement.services.EquipmentServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/equipments")
@RequiredArgsConstructor
public class EquipmentController {
    private final EquipmentServices equipmentServices;

    @GetMapping
    public ResponseEntity<List<Equipment>> findAll() {
        return ResponseEntity.ok(equipmentServices.getAllEquipments());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Equipment> findById(@PathVariable Long id) {
        return ResponseEntity.ok(equipmentServices.getEquipmentById(id));
    }

    @PostMapping
    public ResponseEntity<Equipment> create(@RequestBody Equipment equipment) {
        return ResponseEntity.ok(equipmentServices.createEquipment(equipment));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Equipment> update(@PathVariable Long id, @RequestBody Equipment equipment) {
        return ResponseEntity.ok(equipmentServices.updateEquipment(equipment, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Equipment> delete(@PathVariable Long id) {
        equipmentServices.deleteEquipment(id);
        return ResponseEntity.noContent().build();
    }
}
