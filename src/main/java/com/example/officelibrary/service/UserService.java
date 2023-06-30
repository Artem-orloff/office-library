package com.example.officelibrary.service;

import com.example.officelibrary.model.Users;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void create(Users users);
    List<Users> findAll();
    Optional<Users> findById(long userid);
    Users read(long userid);

    boolean update(Users users, long userid);

    boolean delete(Long userid);


}