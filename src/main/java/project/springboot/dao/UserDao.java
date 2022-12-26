package project.springboot.dao;

import org.springframework.stereotype.Component;
import project.springboot.model.User;

import java.util.List;

@Component
public interface UserDao {
    List<User> listUsers();

    void update(int id, User user);

    User show(int id);

    void delete(int id);

    void save(User user);
}

