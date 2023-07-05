package com.example.officelibrary.service;

import com.example.officelibrary.model.Users;
//import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void create(Users users);
    List<Users> findAll();
    Optional<Users> findById(long userid);
    Users read(long userid);

    boolean delete(long userid);

    boolean deleteById(long userid);

    boolean update(Users users, long userid);

    boolean deleteById(Long userid);

//    @Bean
//    public ModelMapper getMapper();


}