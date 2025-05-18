package com.kwizera.equipmentmanagement.controllers;

import com.kwizera.equipmentmanagement.entities.Equipment;
import com.kwizera.equipmentmanagement.entities.Requests;
import com.kwizera.equipmentmanagement.services.EquipmentServices;
import com.kwizera.equipmentmanagement.services.RequestServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/requests")
@RequiredArgsConstructor
public class RequestController {
    private final RequestServices requestServices;

    @GetMapping
    public ResponseEntity<List<Requests>> findAll() {
        return ResponseEntity.ok(requestServices.getAllRequests());
    }

    @PostMapping
    public ResponseEntity<Requests> create(@RequestBody Requests requests) {
        return ResponseEntity.ok(requestServices.createRequest(requests));
    }
}
