package com.example.officelibrary.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public void create(User user){
        userRepository.save(user);
    }

    @Override
    public List<users> readAll(){
        return (List<users>) userRepository.findAll();
    }

    @Override
    public User read(int id){
        return (User) userRepository.getOne(id);
    }

    @Override
    public boolean update(User user, int id){
        if (userRepository.existsById(id)){
            user.setId(id);
            userRepository.save(user);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(int id){
        if (userRepository.existsById(id)){
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
