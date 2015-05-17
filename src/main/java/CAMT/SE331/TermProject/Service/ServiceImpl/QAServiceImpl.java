package CAMT.SE331.TermProject.Service.ServiceImpl;

import CAMT.SE331.TermProject.Dao.QADao;
import CAMT.SE331.TermProject.Entity.QA;
import CAMT.SE331.TermProject.Service.QAService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Pktaro on 5/5/2015.
 */
public class QAServiceImpl implements QAService {
    @Autowired
    QADao qaDao;

    @Override
    public QA createQA(QA qa) {
        return qaDao.addQA(qa);
    }

    @Override
    public QA updateQA(QA qa) {
        return qaDao.editQA(qa);
    }

    @Override
    public List<QA> getQAs() {
        return qaDao.getQAs();
    }
}
