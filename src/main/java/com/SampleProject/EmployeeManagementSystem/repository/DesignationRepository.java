package com.SampleProject.EmployeeManagementSystem.repository;

import com.SampleProject.EmployeeManagementSystem.entity.Designation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DesignationRepository extends JpaRepository<Designation, Long> {
}
