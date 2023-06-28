package com.example.officelibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, Integer>{
    static Object getOne(int id);

    boolean existsById(int id);

    void deleteById(int id);
}
