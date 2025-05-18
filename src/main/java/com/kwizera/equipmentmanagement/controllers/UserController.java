package com.kwizera.equipmentmanagement.controllers;

import com.kwizera.equipmentmanagement.entities.Users;
import com.kwizera.equipmentmanagement.services.UserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserServices userServices;

    @PostMapping("/login")
    public ResponseEntity<Users> login(@RequestBody Users user) {
        return ResponseEntity.ok(userServices.login(user));
    }

    @PostMapping("/register")
    public ResponseEntity<Users> register(@RequestBody Users user) {
        return ResponseEntity.ok(userServices.createUser(user));
    }
}
