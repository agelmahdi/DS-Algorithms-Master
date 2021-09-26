package com.agelmahdi.greedy_algorithms.ActivitySelectionProblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ActivitySelection {
    private ArrayList<Activity> activities = new ArrayList<>();

    public ActivitySelection(ArrayList<Activity> activities) {
        this.activities = activities;
    }

    private void sort() {

    }

    public void maxNumberOfActivities() {
        Comparator<Activity> comparator = new Comparator<Activity>() {
            @Override
            public int compare(Activity a1, Activity a2) {
                return a1.getEndTime() - a2.getEndTime();
            }
        };
        Collections.sort(activities, comparator);

        Activity previousActivity = activities.get(0);
        System.out.println(previousActivity);

        for (int i = 1; i < activities.size(); i++) {
            Activity selectedActivity = activities.get(i);

            if (selectedActivity.getStartTime() >= previousActivity.getEndTime()) {
                previousActivity = selectedActivity;
                System.out.println(selectedActivity);
            }
        }

    }
}
