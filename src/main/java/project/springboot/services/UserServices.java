package project.springboot.services;

import org.springframework.transaction.annotation.Transactional;
import project.springboot.model.User;

import java.util.List;
import java.util.Optional;

public interface UserServices {
    List<User> listUsers();


    void update(int id, User user);

    void save(User user);
    void delete(int id);

    User show(int id);
}
