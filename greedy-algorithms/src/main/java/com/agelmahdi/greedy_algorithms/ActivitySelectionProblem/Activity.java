package com.agelmahdi.greedy_algorithms.ActivitySelectionProblem;

public class Activity {
    private String activity;
    private int startTime;
    private int endTime;

    public Activity( String activityName,
             int startTime,
             int endTime){
        this.activity=activityName;
        this.startTime=startTime;
        this.endTime = endTime;

    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Activity: " + activity+", Start: "+ startTime+ ", End: "+endTime;
    }
}
