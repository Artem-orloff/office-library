package com.example.officelibrary.repository;

import java.awt.*;

public interface UserService {
    void create(User user);

    List<User> readAll();

    User read(int id);

    boolean update(User user, int id);

    boolean delete(int id);
}
