package CAMT.SE331.TermProject.Dao.DaoImpl;

import CAMT.SE331.TermProject.Dao.DhammaDao;
import CAMT.SE331.TermProject.Entity.Dhamma;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by GolfPapilio on 5/5/15.
 */
@Repository
public class DhammaDaoImpl implements DhammaDao{
    private Set<Dhamma> dhammas;

    public DhammaDaoImpl(){
        Dhamma[] initDhamma={
            new Dhamma(1,"Dhamma1","date1")
        };
        dhammas = new TreeSet<Dhamma>(Arrays.asList(initDhamma));
    }

    @Override
    public Dhamma addDhamma(Dhamma dhamma) {
        return null;
    }

    @Override
    public Dhamma editDhamma(Dhamma dhamma) {
        return null;
    }

    @Override
    public Dhamma deleteDhamma(Dhamma dhamma) {
        return null;
    }
}
