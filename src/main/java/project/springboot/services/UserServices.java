package project.springboot.services;

import project.springboot.model.User;

import java.util.List;
import java.util.Optional;

public interface UserServices {
    List<User> listUsers();
    User save(User user);
    void delete(int id);

    User show(int id);
}
