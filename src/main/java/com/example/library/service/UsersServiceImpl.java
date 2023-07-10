package com.example.library.service;

import com.example.library.model.User;
import com.example.library.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public void create(User user) {
        usersRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return usersRepository.findAll();
    }

    @Override
    public User getById(Long user_id) { return  usersRepository.getById(user_id); }

    @Override
    public User read(long user_id) {
        return usersRepository.getOne(user_id);
    }

    @Override
    public boolean update(User user, long user_id) {
        if (usersRepository.existsById(user_id)) {
            user.setUsersId(user_id);
            usersRepository.save(user);
            return true;
        }

        return false;
    }

    @Override
    public boolean delete(long user_id) {
        if (usersRepository.existsById(user_id)) {
            usersRepository.deleteById(user_id);
            return true;
        }
        return false;
    }
}