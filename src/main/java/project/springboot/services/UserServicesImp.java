package project.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.springboot.dao.UserDao;
import project.springboot.model.User;

import java.util.List;

@Service
public class UserServicesImp implements UserServices {
    private final UserDao userDao;
    @Autowired
    public UserServicesImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }
    @Override
    @Transactional
    public void update(int id, User user){
        userDao.update(id,user);
    }
    @Override
    @Transactional
    public void save(User user) {
    userDao.save(user);
    }
    @Override
    public User show(int id){
      return userDao.show(id);
    }
    @Override
    @Transactional
    public void delete(int id) {
    userDao.delete(id);
    }
}
