
package com.crewsync.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "leaves")
public class Leave {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long employeeId;
    private LocalDate startDate;
    private LocalDate endDate;
    private String reason;
    private String status; // Pending, Approved, Rejected

    // Getters and Setters
}
