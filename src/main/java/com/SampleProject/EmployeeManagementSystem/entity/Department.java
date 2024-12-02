package com.SampleProject.EmployeeManagementSystem.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "Department")

public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deptId;
    private String deptName;

    private boolean isActive;
    private String createdBy;
    private LocalDateTime CreatedDate;
    private String updatedBy;
    private LocalDateTime updatedDate;
}
