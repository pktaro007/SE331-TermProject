package CAMT.SE331.TermProject.Dao;

import CAMT.SE331.TermProject.Entity.Activity;

import java.util.List;

/**
 * Created by Pktaro on 5/3/2015.
 */
public interface ActivityDao {
    List<Activity> getActivities();
    Activity getActivity(int id);
    void addActivity(Activity activity);
    void editActivity(Activity activity);
    void deleteActivity(Activity activity);
}
