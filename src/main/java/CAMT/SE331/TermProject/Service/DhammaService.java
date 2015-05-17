package CAMT.SE331.TermProject.Service;

import CAMT.SE331.TermProject.Entity.Dhamma;

/**
 * Created by Pktaro on 5/4/2015.
 */
public interface DhammaService {
    Dhamma createDhamma(Dhamma dhamma);
    Dhamma updateDhamma(Dhamma dhamma);
    Dhamma deleteDhamma(Dhamma dhamma);
}
