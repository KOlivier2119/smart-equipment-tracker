package com.kwizera.equipmentmanagement.services;

import com.kwizera.equipmentmanagement.entities.Equipment;
import com.kwizera.equipmentmanagement.repository.EquipmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EquipmentServices {
    private final EquipmentRepository equipmentRepository;

    public Equipment createEquipment(Equipment equipment) {
        return equipmentRepository.save(equipment);
    }

    public Equipment getEquipmentById(Long id) {
        return equipmentRepository.findById(id).orElse(null);
    }
    public List<Equipment> getAllEquipments() {
        return equipmentRepository.findAll();
    }

    public Equipment updateEquipment(Equipment equipment, Long id) {
        return equipmentRepository.findById(id).map(p-> {
            p.setName(equipment.getName());
            p.setType(equipment.getType());
            p.setQuantity(equipment.getQuantity());
            p.setStatus(equipment.getStatus());
            p.setLocation(equipment.getLocation());
            return equipmentRepository.save(p);
        }).orElseThrow(() ->new RuntimeException("Equipment Not Found"));

    }

    public void deleteEquipment(Long id) {
        equipmentRepository.deleteById(id);
    }
}
