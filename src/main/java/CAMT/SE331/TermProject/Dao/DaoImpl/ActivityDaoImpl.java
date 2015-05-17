package CAMT.SE331.TermProject.Dao.DaoImpl;

import CAMT.SE331.TermProject.Dao.ActivityDao;
import CAMT.SE331.TermProject.Entity.Activity;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * Created by Pktaro on 5/5/2015.
 */
@Repository
public class ActivityDaoImpl implements ActivityDao {
    private Set<Activity> activities;

    public ActivityDaoImpl() {
        Activity[] initActivity = {
                new Activity(1, "type1", "Name1", "desc1", "date1", "time1", "place1"),
                new Activity(2, "type2", "Name2", "desc2", "date2", "time2", "place2")
        };
        activities = new TreeSet<>(Arrays.asList(initActivity));
    }

    @Override
    public List<Activity> getActivities() {
        return new ArrayList<Activity>(activities);
    }

    @Override
    public Activity getActivity(int id) {
        return null;
    }

    @Override
    public Activity addActivity(Activity activity) {
        activity.setId((int) (activities.size() + 1));
        activities.add(activity);
        return activity;
    }

    @Override
    public Activity editActivity(Activity activity) {
        Activity toRemove = getActivity(activity.getId());
        if (toRemove == null) {
            return null;
        }
        if (!activities.remove(activity))
            return null;

        activities.add(activity);
        return activity;
    }

    @Override
    public Activity deleteActivity(Activity activity) {
        if (activities.remove(activity)) {
            return activity;
        } else {
            return null;
        }
    }
}
