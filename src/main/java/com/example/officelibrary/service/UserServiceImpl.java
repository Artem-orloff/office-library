package com.example.officelibrary.service;

import com.example.officelibrary.model.User;
import com.example.officelibrary.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public void create(User users) {

        usersRepository.save(users);
    }

    @Override
    public List<User> findAll() {

        return usersRepository.findAll();
    }

    @Override
    public User getById(long userId){
//            return null;
        return usersRepository.getById(userId);
    }

    @Override
    public User read(long userId) {
        return usersRepository.getOne(userId);
    }

    @Override
    public boolean delete(long userId) {
        return false;
    }

    @Override
    public boolean update(User users, long userId){
        if (usersRepository.existsById(userId)){
            users.setUserId(userId);
            usersRepository.save(users);
            return true;
        }
        return false;
    }


}