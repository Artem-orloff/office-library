package com.example.officelibrary.repository;

import com.example.officelibrary.repository.User;
import com.example.officelibrary.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void create(User user) {
        userRepository.save(user);
    }

    @Override
    public List<User>  readAll() {
        return userRepository.findAll();
    }

    @Override
    public User read(int author_id) {
        int user_id = 0;
        return (User) UserRepository.getOne(user_id);
    }

    @Override
    public boolean update(User user, int user_id) {
        if (userRepository.existsById(user_id)) {
            user.setId(user_id);
            userRepository.save(user);
            return true;
        }

        return false;
    }

    @Override
    public boolean delete(int author_id) {
        if (userRepository.existsById(author_id)) {
            userRepository.deleteById(author_id);
            return true;
        }
        return false;
    }
}