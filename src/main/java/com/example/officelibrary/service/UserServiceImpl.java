package com.example.officelibrary.service;

import com.example.officelibrary.model.Users;
import com.example.officelibrary.repository.UsersRepository;
import jakarta.persistence.metamodel.SingularAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.stereotype.Service;

import java.io.Serializable;
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
    public boolean delete(long userid) {
        return false;
    }

    @Override
    public boolean deleteById(long userid) {
        return false;
    }


//    @Override
//    public boolean deleteById(long userid) {
//        if (usersRepository.existsById(userid)) {
//            usersRepository.deleteById(userid);
//            return true;
//        }
//        return false;
//    }

    @Override
    public boolean update(Users users, long userId){
        if (usersRepository.existsById(userId)){
            users.setUserId(userId);
            usersRepository.save(users);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteById(Long userid) {
        return false;
    }

}