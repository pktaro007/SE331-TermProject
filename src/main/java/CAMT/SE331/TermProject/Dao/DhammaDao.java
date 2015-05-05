package CAMT.SE331.TermProject.Dao;

import CAMT.SE331.TermProject.Entity.Dhamma;

/**
 * Created by Pktaro on 5/3/2015.
 */
public interface DhammaDao {
    void addDhamma(Dhamma dhamma);
    void editDhamma(Dhamma dhamma);
    void deleteDhamma(Dhamma dhamma);
}
