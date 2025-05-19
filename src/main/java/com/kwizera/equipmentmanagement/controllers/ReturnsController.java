package com.kwizera.equipmentmanagement.controllers;

import com.kwizera.equipmentmanagement.entities.Equipment;
import com.kwizera.equipmentmanagement.entities.Returns;
import com.kwizera.equipmentmanagement.services.EquipmentServices;
import com.kwizera.equipmentmanagement.services.RequestServices;
import com.kwizera.equipmentmanagement.services.ReturnsServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/returns")
@RequiredArgsConstructor
public class ReturnsController {
    private final ReturnsServices returnsServices;

    @PostMapping
    public ResponseEntity<Returns> createReturns(@RequestBody Returns returns) {
        return ResponseEntity.ok(returnsServices.createReturns(returns));
    }

    @GetMapping
    public ResponseEntity<List<Returns>> getAllReturns() {
        return ResponseEntity.ok(returnsServices.getAllReturns());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Returns> deleteReturns(@PathVariable Long id) {
        returnsServices.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
