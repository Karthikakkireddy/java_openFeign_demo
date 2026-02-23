package com.karthik.department_service.controller;

import com.karthik.department_service.domain.Department;
import com.karthik.department_service.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/department/{id}")
    public ResponseEntity<List<Integer>> getUsersByDept(@PathVariable Integer id)
    {
        List<Integer> listOfUsers = departmentService.getUsers(id);
        return ResponseEntity.ok(listOfUsers);
    }
}
