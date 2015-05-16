package CAMT.SE331.TermProject.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Pktaro on 5/3/2015.
 */
@Entity
public class Dhamma {
    @Id
    @GeneratedValue
    int id;
    String dhamma;
    String date;

    public Dhamma(int id, String dhamma, String date) {
        this.id = id;
        this.dhamma = dhamma;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDhamma() {
        return dhamma;
    }

    public void setDhamma(String dhamma) {
        this.dhamma = dhamma;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
