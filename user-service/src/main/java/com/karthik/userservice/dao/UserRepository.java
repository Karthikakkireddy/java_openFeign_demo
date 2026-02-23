package com.karthik.userservice.dao;

import com.karthik.userservice.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<Users, Integer>
{
    @Query("SELECT u.id FROM Users u WHERE u.deptId = :id")
    List<Integer> findUsersIdByDeptId(Integer id);
}
