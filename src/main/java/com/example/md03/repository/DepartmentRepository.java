package com.example.md03.repository;

import com.example.md03.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

// Kế thừa JpaRepository để có sẵn save, findAll, findById...
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}