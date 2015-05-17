package CAMT.SE331.TermProject.Service.ServiceImpl;

import CAMT.SE331.TermProject.Dao.HistoryDao;
import CAMT.SE331.TermProject.Entity.History;
import CAMT.SE331.TermProject.Service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Pktaro on 5/5/2015.
 */
public class HistoryServiceImpl implements HistoryService{
    @Autowired
    HistoryDao historyDao;
    @Override
    public History getHistory(String language) {
        return historyDao.getHistory(language);
    }

    @Override
    public History updateHistory(History history) {
        return historyDao.editHistory(history);
    }
}
