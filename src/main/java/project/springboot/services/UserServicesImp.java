package project.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.springboot.dao.UserDao;
import project.springboot.model.User;

import java.util.List;
import java.util.Optional;
@Service
public class UserServicesImp implements UserServices {
    private final UserDao userDao;
    @Autowired
    public UserServicesImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> listUsers() {
        return userDao.findAll();
    }


    @Override
    public User save(User user) {
        return userDao.save(user);
    }

    public User show(int id){
      return userDao.getOne(id);
    }
    @Override
    public void delete(int id) {
    userDao.deleteById(id);
    }
}
