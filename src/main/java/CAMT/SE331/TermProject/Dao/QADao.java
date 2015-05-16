package CAMT.SE331.TermProject.Dao;

import CAMT.SE331.TermProject.Entity.QA;

import java.util.List;

/**
 * Created by Pktaro on 5/3/2015.
 */
public interface QADao {
    QA addQA(QA qa);
    QA editQA(QA qa);
    List<QA> getQAs();
}
