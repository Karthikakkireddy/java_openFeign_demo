package com.karthik.department_service.controller;

import com.karthik.department_service.domain.Department;
import com.karthik.department_service.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DepartmentController
{
    private final DepartmentService departmentService;
    @PostMapping("/department")
    public ResponseEntity<Department> createDepartment(@RequestBody Department department)
    {
        Department savedDepartment = departmentService.createDepartment(department);
        return ResponseEntity.ok(savedDepartment);
    }
}
