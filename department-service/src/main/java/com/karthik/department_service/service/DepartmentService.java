package com.karthik.department_service.service;

import com.karthik.department_service.dao.DepartmentRepository;
import com.karthik.department_service.domain.Department;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DepartmentService
{
    private final DepartmentRepository departmentRepository;

    public Department createDepartment(Department department)
    {
        return departmentRepository.save(department);
    }
}
