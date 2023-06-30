package com.example.officelibrary.service;

import com.example.officelibrary.model.Users;

import java.util.List;

public interface UserService {
    void create(Users users);
    List<Users> findAll();
    Users read(long userid);

    boolean update(Users users, long userid);

    boolean delete(Long userid);


}