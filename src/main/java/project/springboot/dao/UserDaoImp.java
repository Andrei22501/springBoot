package project.springboot.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import project.springboot.model.User;

import java.util.List;
@Component
public class UserDaoImp implements UserDao{
    @PersistenceContext
    private EntityManager entityManager;



    @Override
    @SuppressWarnings("unchecked")
    public List<User> listUsers() {
        String e = "from User";
        TypedQuery<User> query = entityManager.createQuery(e, User.class);
        return query.getResultList();
    }

    public User show(int id) {
        String e = "from User where id =" + id;
        TypedQuery<User> query = entityManager.createQuery(e, User.class);
        return query.getSingleResult();
    }

    public void update(int id, User user) {
        User userUpdate = show(id);
        userUpdate.setName(user.getName());
        userUpdate.setLastname(user.getLastname());
        userUpdate.setEmail(user.getEmail());
    }

    @Override
    public void delete(int id) {
        User user = entityManager.find(User.class, id);
        entityManager.remove(user);
    }

    @Override
    public void save(User user) {
        entityManager.persist(user);
    }
}
