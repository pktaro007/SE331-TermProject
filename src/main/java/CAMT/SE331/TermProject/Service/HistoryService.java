package CAMT.SE331.TermProject.Service;

import CAMT.SE331.TermProject.Entity.History;

/**
 * Created by Pktaro on 5/4/2015.
 */
public interface HistoryService {
    History getHistory(String language);
    void updateHistory(History history);
}
