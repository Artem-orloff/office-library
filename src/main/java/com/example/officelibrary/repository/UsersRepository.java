package com.example.officelibrary.repository;

import com.example.officelibrary.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsersRepository extends JpaRepository<Users, Long> {
}
