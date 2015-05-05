package CAMT.SE331.TermProject.Entity;

import java.util.List;

/**
 * Created by Pktaro on 5/3/2015.
 */
public class RegisteredUser extends User {

    List<QA> questions;

    public RegisteredUser(int id, String username, String password, String status, String firstName, String lastName, String email, String tel, List<QA> questions) {
        super(id, username, password, status, firstName, lastName, email, tel);
        this.questions = questions;
    }

    public List<QA> getQuestions() {
        return questions;
    }

    public void setQuestions(List<QA> questions) {
        this.questions = questions;
    }
}
