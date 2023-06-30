package com.example.officelibrary.controller;

import com.example.officelibrary.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.officelibrary.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/office-library")
public class UsersController {
    @Autowired
    UserService userService;

    @GetMapping("/users")
    public ResponseEntity<?> getAllUsers(){
        List<Users> users = userService.findAll();
        return ResponseEntity.ok().body(users);
    }
}
