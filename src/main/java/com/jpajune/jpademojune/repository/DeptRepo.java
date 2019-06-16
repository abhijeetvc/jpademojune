package com.jpajune.jpademojune.repository;

import com.jpajune.jpademojune.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeptRepo extends JpaRepository<Department,Integer> {
}
