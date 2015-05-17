package CAMT.SE331.TermProject.Service.ServiceImpl;

import CAMT.SE331.TermProject.Dao.ActivityDao;
import CAMT.SE331.TermProject.Entity.Activity;
import CAMT.SE331.TermProject.Service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Pktaro on 5/5/2015.
 */
@Service
public class ActivityServiceImpl implements ActivityService{
    @Autowired
    ActivityDao activityDao;

    @Override
    public List<Activity> getActivities() {
        return activityDao.getActivities();
    }

    @Override
    public Activity getActivity(int id) {
        return activityDao.getActivity(id);
    }

    @Override
    public Activity createActivity(Activity activity) {
        return activityDao.addActivity(activity);
    }

    @Override
    public Activity updateActivity(Activity activity) {
        return activityDao.editActivity(activity);
    }

    @Override
    public Activity deleteActivity(Activity activity) {
        return activityDao.deleteActivity(activity);
    }
}
