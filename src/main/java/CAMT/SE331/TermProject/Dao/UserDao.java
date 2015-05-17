package CAMT.SE331.TermProject.Dao;

import CAMT.SE331.TermProject.Entity.User;

import java.util.List;

/**
 * Created by Pktaro on 5/3/2015.
 */
public interface UserDao {
    List<User> getUsers();
    User getUser(int id);
    User getUser(String username, String password);
    void addUser(User user);
    void editUser(User user);
    void deleteUser(User user);
}
