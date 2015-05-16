package CAMT.SE331.TermProject.Dao.DaoImpl;

import CAMT.SE331.TermProject.Dao.UserDao;
import CAMT.SE331.TermProject.Entity.User;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by GolfPapilio on 5/5/15.
 */
@Repository
public class UserDaoImpl implements UserDao {
    private Set<User> users;

    public UserDaoImpl(){
        User[] initUser={
                new User(1,"username1","password1","status1","firstName1","lastName1","email1","tel1")
        };
        users = new TreeSet<User>(Arrays.asList(initUser));
    }

    @Override
    public List<User> getUsers() {
        return null;
    }

    @Override
    public User getUser(int id) {
        return null;
    }

    @Override
    public User getUser(String username, String password) {
        return null;
    }

    @Override
    public User addUser(User user) {
        return null;
    }

    @Override
    public User editUser(User user) {
        return null;
    }

    @Override
    public User deleteUser(User user) {
        return null;
    }
}
