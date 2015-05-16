package CAMT.SE331.TermProject.Service;

import CAMT.SE331.TermProject.Entity.Activity;

import java.util.List;

/**
 * Created by Pktaro on 5/3/2015.
 */
public interface ActivityService {
    List<Activity> getActivities();
    Activity getActivity(int id);
    Activity createActivity(Activity activity);
    Activity updateActivity(Activity activity);
    Activity deleteActivity(Activity activity);
}
