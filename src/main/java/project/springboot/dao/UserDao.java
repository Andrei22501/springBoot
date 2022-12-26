package project.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.springboot.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {

}
