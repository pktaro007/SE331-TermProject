package CAMT.SE331.TermProject.Service;

import CAMT.SE331.TermProject.Entity.Activity;
import CAMT.SE331.TermProject.Entity.User;

/**
 * Created by Pktaro on 5/3/2015.
 */
public interface UserService {
    void register(User user);
    User login(String username, String password);
    void logout();
    User updateProfile();
    void sendMail(Activity activity);
}
