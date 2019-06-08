package com.jpajune.jpademojune.repository;

import com.jpajune.jpademojune.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
}
