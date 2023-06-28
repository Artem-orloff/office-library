package com.example.officelibrary.repository;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import model.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, Integer>  {
    static Object getOne(long id) {
        return null;
    }
}
