package com.SampleProject.EmployeeManagementSystem.repository;

import com.SampleProject.EmployeeManagementSystem.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
