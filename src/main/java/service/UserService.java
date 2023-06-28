package service;

import model.User;

import java.util.List;

public interface UserService {
    void create(User user);
    List<User> findAll();

    List<User>  readAll();

    User read(long id);
    boolean update(User user, int user_id);
    boolean delete(int author_id);


}