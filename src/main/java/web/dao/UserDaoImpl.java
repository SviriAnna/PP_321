package web.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.User;

import java.util.List;
@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        List<User> userList = entityManager.createQuery("select c FROM User c").getResultList();
        return userList;
    }
    @Override
    public User showUserById(int id) {
        return entityManager.find(User.class, id);
    }
    @Override
    public void saveUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void update(int id, User user) {
        User userWhoWillBeUpdate = showUserById(id);
        userWhoWillBeUpdate.setName(user.getName());
        userWhoWillBeUpdate.setLastname(user.getLastname());
        userWhoWillBeUpdate.setAge(user.getAge());
        userWhoWillBeUpdate.setSmoking(user.isSmoking());
        entityManager.merge(userWhoWillBeUpdate);
    }

    @Override
    public void delete(int id) {
        entityManager.remove(showUserById(id));
    }
}
