package com.SampleProject.EmployeeManagementSystem.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@Table(name = "EmployeeInfo")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;

    private String firstName;
    private String lastName;
    private String address;
    private Date DateOfJoining;

    private boolean isActive;
    private String createdBy;
    private LocalDateTime CreatedDate;
    private String updatedBy;
    private LocalDateTime updatedDate;

}
