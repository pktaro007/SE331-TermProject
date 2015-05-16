package CAMT.SE331.TermProject.Service.ServiceImpl;

import CAMT.SE331.TermProject.Dao.DhammaDao;
import CAMT.SE331.TermProject.Entity.Dhamma;
import CAMT.SE331.TermProject.Service.DhammaService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Pktaro on 5/5/2015.
 */
public class DhammaServiceImpl implements DhammaService{
    @Autowired
    DhammaDao dhammaDao;
    @Override
    public Dhamma createDhamma(Dhamma dhamma) {
        return dhammaDao.addDhamma(dhamma);
    }

    @Override
    public Dhamma updateDhamma(Dhamma dhamma) {
        return dhammaDao.editDhamma(dhamma);
    }

    @Override
    public Dhamma deleteDhamma(Dhamma dhamma) {
        return dhammaDao.deleteDhamma(dhamma);
    }
}
