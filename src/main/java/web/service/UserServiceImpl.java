package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;


import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Transactional
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
    @Transactional
    public void saveUser(User user) {
        userDao.saveUser(user);
    }
    @Transactional
    public User showUserById(int id){
        return userDao.showUserById(id);
    }
    @Transactional
    public void update(int id, User user){
        userDao.update(id, user);
    }
    @Transactional
    public void delete(int id) {
        userDao.delete(id);
    }
}
