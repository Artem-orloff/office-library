package service;

import model.User;
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
    public List<User> findAll() {
        return null;
    }

    @Override
    public List<User>  readAll() {
        return userRepository.findAll();
    }

    @Override
    public User read(long id) {
        return (User) UserRepository.getOne(id);
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