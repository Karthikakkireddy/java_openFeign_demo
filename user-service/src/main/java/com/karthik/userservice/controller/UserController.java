package com.karthik.userservice.controller;


import com.karthik.userservice.domain.Users;
import com.karthik.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController
{

    private final UserService userService;

    @PostMapping("/users")
    public ResponseEntity<Users> registerUser(@RequestBody Users users)
    {
        Users savedUser = userService.registerUsers(users);

        return ResponseEntity.ok(savedUser);
    }

    @GetMapping("/users")
    public ResponseEntity<List<Users>> registerUser()
    {
        List<Users> users = userService.getUsers();

        return ResponseEntity.ok(users);
    }
}
