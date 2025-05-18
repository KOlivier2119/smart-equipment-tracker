package com.kwizera.equipmentmanagement.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Allocation_logs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "equipment_id", referencedColumnName = "id")
    private Equipment equipment;  // Changed from Long to Equipment entity

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private Users user;  // Changed from Long to User entity

    private Date allocation_at;
    private String action;
}
