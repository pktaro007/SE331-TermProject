package CAMT.SE331.TermProject.Dao;

import CAMT.SE331.TermProject.Entity.Dhamma;

/**
 * Created by Pktaro on 5/3/2015.
 */
public interface DhammaDao {
    Dhamma addDhamma(Dhamma dhamma);
    Dhamma editDhamma(Dhamma dhamma);
    Dhamma deleteDhamma(Dhamma dhamma);
}
