package com.kwizera.equipmentmanagement.repository;

import com.kwizera.equipmentmanagement.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    @Query("SELECT u from Users u WHERE u.email=: email")
    Users findByEmail(String email);

    @Query("SELECT u from Users u WHERE u.email=:email AND u.password=:password AND u.role=:role")
    Users findByEmailAndPassword(String email, String password, String role);
}
