package com.example.md03.entity;

import jakarta.persistence.*;

// Đánh dấu class là entity ánh xạ với bảng departments
@Entity
@Table(name = "departments")
public class Department {

    // Khóa chính tự tăng
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Tên phòng ban
    @Column(nullable = false, length = 50)
    private String name;

    // Mô tả phòng ban
    @Column(length = 100)
    private String description;

    // Getter và setter
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}