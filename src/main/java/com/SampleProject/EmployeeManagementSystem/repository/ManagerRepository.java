package com.SampleProject.EmployeeManagementSystem.repository;
import com.SampleProject.EmployeeManagementSystem.entity.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepository extends JpaRepository<Manager, Long> {
}
