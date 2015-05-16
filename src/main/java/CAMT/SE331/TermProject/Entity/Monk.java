package CAMT.SE331.TermProject.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

/**
 * Created by Pktaro on 5/3/2015.
 */
@Entity
public class Monk extends User {
    @Id
    @GeneratedValue
    List<Dhamma> dhammas;

    public Monk(int id, String username, String password, String status, String firstName, String lastName, String email, String tel, List<Dhamma> dhammas) {
        super(id, username, password, status, firstName, lastName, email, tel);
        this.dhammas = dhammas;
    }

    public List<Dhamma> getDhammas() {
        return dhammas;
    }

    public void setDhammas(List<Dhamma> dhammas) {
        this.dhammas = dhammas;
    }
}
