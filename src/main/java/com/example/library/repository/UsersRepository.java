package com.example.library.repository;

import com.example.library.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UsersRepository extends JpaRepository<User, Long>  {
//    List<Author> findByPublished(boolean published);

//    List<Author> findByTitleContaining(String title);
}