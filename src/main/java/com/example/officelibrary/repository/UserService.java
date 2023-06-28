package com.example.officelibrary.repository;

import java.awt.*;

import com.example.officelibrary.repository.User;

import java.util.List;

public interface UserService {
    void create(User user);
    List<User> readAll();
    User read(int user_id);
    boolean update(User userr, int user_id);
    boolean delete(int author_id);

}