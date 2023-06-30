package com.example.officelibrary.controller;

import com.example.officelibrary.exception.ResourceNotFoundException;
import com.example.officelibrary.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.officelibrary.service.UserService;

import java.util.List;
import java.util.Optional;

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
    @GetMapping("/user")
    public ResponseEntity<?> findUser(){
        List<Users> users = userService.findAll();//нужно сделать!!!
        return ResponseEntity.ok().body(users);
    }
    @GetMapping("/user/{id}")
    public ResponseEntity<Optional<Users>> getUserById(@PathVariable(value = "id") Long userId)
            throws ResourceNotFoundException {
        Optional<Users> users = userService.findById(userId);
        return ResponseEntity.ok().body(users);
    }
}
