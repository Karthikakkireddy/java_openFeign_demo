package com.karthik.userservice.service;


import com.karthik.userservice.dao.UserRepository;
import com.karthik.userservice.domain.Users;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService
{

    private final UserRepository userRepository;
    public Users registerUsers(Users users)
    {
        return userRepository.save(users);
    }

    public List<Users> getUsers()
    {
        return userRepository.findAll();
    }

    public List<Integer> getUsersByDept(Integer deptId)
    {
//        List<Users> users = userRepository.findAll();
//
//        List<Integer> userIds = new ArrayList<>();
//
//        for(Users user : users)
//        {
//            if(deptId.equals(user.getDeptId()))
//            {
//                userIds.add(user.getId());
//            }
//        }

        List<Integer> userIds = userRepository.findUsersIdByDeptId(deptId);
        return userIds;
    }
}
