package com.example.officelibrary.service;

import com.example.officelibrary.model.Users;
import com.example.officelibrary.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public void create(Users users) {

        usersRepository.save(users);
    }

    @Override
    public List<Users> findAll() {
        return usersRepository.findAll();
    }

    @Override
    public Optional<Users> findById(long userid){
        return usersRepository.findById(userid);
    }

    @Override
    public Users read(long userid) {
        return usersRepository.getOne(userid);
    }

    @Override
    public boolean update(Users users, long userid) {
        if (usersRepository.existsById(userid)){
            users.setUserId(userid);
            usersRepository.save(users);
            return true;
        }

        return false;
    }

    @Override
    public boolean delete(Long userid) {
        return false;
    }

//    @Override
//    public boolean delete(long userid) {
//        if (userRepository.existsById(userid)) {
//            userRepository.deleteById(userid);
//            return true;
//        }
//        return false;
//    }
}