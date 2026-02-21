package com.karthik.userservice.controller;


import com.karthik.userservice.domain.Users;
import com.karthik.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController
{

    private final UserService userService;

    @GetMapping("/users")
    public ResponseEntity<List<Users>> getAllUsers()
    {
        List<Users> users = userService.getAllUsers();

        return ResponseEntity.ok(users);
    }
}
