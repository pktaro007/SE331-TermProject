package CAMT.SE331.TermProject.Service.ServiceImpl;

import CAMT.SE331.TermProject.Dao.UserDao;
import CAMT.SE331.TermProject.Entity.Activity;
import CAMT.SE331.TermProject.Entity.User;
import CAMT.SE331.TermProject.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Pktaro on 5/5/2015.
 */
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public User register(User user) {
        return userDao.addUser(user);
    }

    @Override
    public User login(String username, String password) {
        return userDao.getUser(username, password);
    }

    @Override
    public User logout() {
        return null;
    }

    @Override
    public User updateProfile(User user) {
        return userDao.editUser(user);
    }

    @Override
    public void sendMail(Activity activity) {

    }
}
