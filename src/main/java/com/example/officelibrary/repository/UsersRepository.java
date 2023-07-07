package com.example.officelibrary.repository;

import com.example.officelibrary.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<User, Long> {
}
