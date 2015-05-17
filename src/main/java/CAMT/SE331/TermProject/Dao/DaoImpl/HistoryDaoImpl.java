package CAMT.SE331.TermProject.Dao.DaoImpl;

import CAMT.SE331.TermProject.Dao.HistoryDao;
import CAMT.SE331.TermProject.Entity.History;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by GolfPapilio on 5/5/15.
 */
@Repository
public class HistoryDaoImpl implements HistoryDao {
    private Set<History> histories;

    public HistoryDaoImpl(){
        History[] initHistory={
                new History(1,"language1","history1")
        };
        histories = new TreeSet<History>(Arrays.asList(initHistory));
    }

    @Override
    public History getHistory(String language) {
        return null;
    }

    @Override
    public History editHistory(History history) {
        return null;
    }
}
