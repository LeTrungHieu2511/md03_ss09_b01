package com.example.md03.service;

import com.example.md03.dto.DepartmentDTO;
import com.example.md03.entity.Department;
import com.example.md03.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    // Inject repository qua constructor
    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    // Chuyển DTO sang Entity rồi lưu xuống database
    public Department create(DepartmentDTO dto) {
        Department department = new Department();
        department.setName(dto.getName().trim());
        department.setDescription(dto.getDescription());
        return departmentRepository.save(department);
    }
}