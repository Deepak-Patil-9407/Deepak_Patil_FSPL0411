package com.SampleProject.EmployeeManagementSystem.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@Table(name = "Designation")
public class Designation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long DesignationId;

    private String DesignationName;

    private boolean isActive;
    private String createdBy;
    private LocalDateTime CreatedDate;
    private String updatedBy;
    private LocalDateTime updatedDate;

}
