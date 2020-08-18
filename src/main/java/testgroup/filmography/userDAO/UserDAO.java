package testgroup.filmography.userDAO;

import testgroup.filmography.model.User;

import java.util.List;

public interface UserDAO {
    List<User> allUsers();
    void add(User user);
    void delete(int id);
    void edit(User user);
    User getById(int id);
}