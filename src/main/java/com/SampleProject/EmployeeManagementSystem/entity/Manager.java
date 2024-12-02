package com.SampleProject.EmployeeManagementSystem.entity;

import jakarta.persistence.*;
        import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@Table(name = "ManagerInfo")

public class Manager {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long managerId;

    private String ManagerName;
    private String address;
    private Date dateOfJoining;

    private boolean isActive;
    private String createdBy;
    private LocalDateTime createdDate;
    private String updatedBy;
    private LocalDateTime updatedDate;


}

