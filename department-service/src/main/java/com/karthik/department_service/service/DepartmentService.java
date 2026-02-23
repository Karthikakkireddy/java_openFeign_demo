package com.karthik.department_service.service;

import com.karthik.department_service.client.DepartmentClient;
import com.karthik.department_service.dao.DepartmentRepository;
import com.karthik.department_service.domain.Department;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentService
{
    private final DepartmentRepository departmentRepository;
    private final DepartmentClient departmentClient;

    public Department createDepartment(Department department)
    {
        return departmentRepository.save(department);
    }

    public List<Integer> getUsers(Integer id)
    {
        return departmentClient.getUsersByDepartment(id).getBody();
    }
}
