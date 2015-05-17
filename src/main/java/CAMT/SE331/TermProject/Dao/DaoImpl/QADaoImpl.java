package CAMT.SE331.TermProject.Dao.DaoImpl;

import CAMT.SE331.TermProject.Dao.QADao;
import CAMT.SE331.TermProject.Entity.QA;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by GolfPapilio on 5/5/15.
 */
@Repository
public class QADaoImpl implements QADao {
    private Set<QA> qas;

    public QADaoImpl(){
        QA[] initQA={
                new QA(1,"status1","quesion1","answer1")
        };
        qas = new TreeSet<QA>(Arrays.asList(initQA));
    }
    @Override
    public QA addQA(QA qa) {
        return null;
    }

    @Override
    public QA editQA(QA qa) {
        return null;
    }

    @Override
    public List<QA> getQAs() {
        return null;
    }
}
