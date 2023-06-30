package com.example.officelibrary.repository;

import com.example.officelibrary.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UsersRepository extends JpaRepository<Users, Long> {
}
