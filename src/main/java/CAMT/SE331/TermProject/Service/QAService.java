package CAMT.SE331.TermProject.Service;

import CAMT.SE331.TermProject.Entity.QA;

import java.util.List;

/**
 * Created by Pktaro on 5/4/2015.
 */
public interface QAService {
    void createQA(QA qa);
    void updateQA(QA qa);
    List<QA> getQAs();
}
