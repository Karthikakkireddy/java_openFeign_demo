package com.karthik.userservice.service;


import com.karthik.userservice.dao.UserRepository;
import com.karthik.userservice.domain.Users;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
}
