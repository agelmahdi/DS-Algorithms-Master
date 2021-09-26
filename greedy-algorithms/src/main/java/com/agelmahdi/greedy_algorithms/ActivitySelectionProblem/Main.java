package com.agelmahdi.greedy_algorithms.ActivitySelectionProblem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Activity> activities = new ArrayList<>();
        Activity a1 = new Activity("A1",0,6);
        Activity a2 = new Activity("A2",3,4);
        Activity a3 = new Activity("A3",1,2);
        Activity a4 = new Activity("A4",5,8);
        Activity a5 = new Activity("A5",5,7);
        Activity a6 = new Activity("A6",8,9);

        activities.add(a1);
        activities.add(a2);
        activities.add(a3);
        activities.add(a4);
        activities.add(a5);
        activities.add(a6);

        ActivitySelection activitySelection = new ActivitySelection(activities);
        activitySelection.maxNumberOfActivities();
    }
}
