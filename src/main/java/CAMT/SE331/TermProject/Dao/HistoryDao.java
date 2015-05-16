package CAMT.SE331.TermProject.Dao;


import CAMT.SE331.TermProject.Entity.History;

/**
 * Created by Pktaro on 5/3/2015.
 */
public interface HistoryDao {
    History getHistory(String language);
    History editHistory(History history);
}
