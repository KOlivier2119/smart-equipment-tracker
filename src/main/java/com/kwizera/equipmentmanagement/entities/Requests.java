package com.kwizera.equipmentmanagement.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Requests {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JoinColumn
    private Long user_id;
    @JoinColumn
    private Long equipment_id;
    private String purpose;
    private Date request_date;
    private String status;

    @OneToMany(mappedBy = "request")
    private List<Returns> returns;
}

