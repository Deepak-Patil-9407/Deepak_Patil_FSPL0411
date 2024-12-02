package com.SampleProject.EmployeeManagementSystem.repository;

import com.SampleProject.EmployeeManagementSystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
