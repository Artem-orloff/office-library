package com.example.library.service;

import com.example.library.model.User;

import java.util.List;

public interface UsersService {
    void create(User user);
    List<User> findAll();
    User getById(Long user_id);
    User read(long user_id);
    boolean update(User user, long user_id);
    boolean delete(long user_id);

}
