package com.example.crudapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.crudapp.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
