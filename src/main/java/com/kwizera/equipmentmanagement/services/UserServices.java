package com.kwizera.equipmentmanagement.services;

import com.kwizera.equipmentmanagement.entities.Users;
import com.kwizera.equipmentmanagement.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServices {
    private final UserRepository userRepository;

    public Users createUser(Users user) {
        return userRepository.save(user);
    }

    public Users findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public Users login(Users users) {
        if(users.getEmail().equals(users.getPassword()))
        return userRepository.findByEmailAndPassword(users.getEmail(), users.getPassword(), users.getRole());
        else return null;
    }

    public List<Users> findAllUsers() {
        return userRepository.findAll();
    }

    public Users updateUser(Users user, Long id) {
        return userRepository.findById(id).map(p-> {
            p.setName(user.getName());
            p.setEmail(user.getEmail());
            p.setRole(user.getRole());
            p.setPassword(user.getPassword());
            return userRepository.save(p);
        }).orElseThrow(() -> new RuntimeException("User not found"));
    }

}
