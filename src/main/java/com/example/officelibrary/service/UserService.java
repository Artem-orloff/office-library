package com.example.officelibrary.service;

import com.example.officelibrary.model.User;

import java.util.List;

public interface UserService {
    void create(User users);
    List<User> findAll();

    User getById(long userid);

    User read(long userid);
    boolean delete(long userid);
    boolean update(User users, long userid);
}