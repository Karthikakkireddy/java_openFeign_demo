package com.karthik.department_service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "user-service", url = "http://localhost:8080")
public interface DepartmentClient
{
    @GetMapping("/user/department/{id}")
    public ResponseEntity<List<Integer>> getUsersByDepartment(@PathVariable Integer id);
}
