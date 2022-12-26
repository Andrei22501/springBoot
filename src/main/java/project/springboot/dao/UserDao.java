package project.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import project.springboot.model.User;

@Component
public interface UserDao extends JpaRepository<User, Integer> {

}
