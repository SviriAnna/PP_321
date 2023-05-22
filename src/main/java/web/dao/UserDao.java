package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    public List<User> getAllUsers();

    public void saveUser(User user);
    public User showUserById(int id);
    public void update(int id, User user);
    public void delete(int id);
}
