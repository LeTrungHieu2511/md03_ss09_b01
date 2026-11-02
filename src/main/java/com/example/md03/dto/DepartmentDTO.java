package com.example.md03.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class DepartmentDTO {

    // Tên bắt buộc nhập, dài 5-50 ký tự
    @NotBlank(message = "Tên phòng ban không được để trống")
    @Size(min = 5, max = 50, message = "Tên phòng ban phải từ 5 đến 50 ký tự")
    private String name;

    // Mô tả không bắt buộc, tối đa 100 ký tự
    @Size(max = 100, message = "Mô tả tối đa 100 ký tự")
    private String description;

    // Getter và setter
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}