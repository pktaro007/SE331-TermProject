package CAMT.SE331.TermProject.Service;

import CAMT.SE331.TermProject.Entity.Activity;
import CAMT.SE331.TermProject.Entity.User;

/**
 * Created by Pktaro on 5/3/2015.
 */
public interface UserService {
    User register(User user);
    User login(String username, String password);
    User logout();
    User updateProfile(User user);
    void sendMail(Activity activity);
}
