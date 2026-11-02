package com.example.md03.controller;

import com.example.md03.dto.DepartmentDTO;
import com.example.md03.entity.Department;
import com.example.md03.service.DepartmentService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/departments")
public class DepartmentController {

    // Inject service qua constructor
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    // @RequestBody hứng JSON, @Valid kích hoạt kiểm tra lỗi; trả về 201 khi hợp lệ
    @PostMapping
    public ResponseEntity<Department> create(@Valid @RequestBody DepartmentDTO dto) {
        Department saved = departmentService.create(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }
}