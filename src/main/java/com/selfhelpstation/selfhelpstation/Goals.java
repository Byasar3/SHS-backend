package com.selfhelpstation.selfhelpstation;

import java.time.LocalDate;
import java.util.Random;

public class Goals {

    private long id = new Random().nextLong();
    private String goalName;
    private String goalDescription;
    private LocalDate dateCreated = LocalDate.now();
    private LocalDate endDate;
    private boolean repeat;

    public Goals(){

    }

    public Goals(long id, String goalName, String goalDescription, LocalDate dateCreated, LocalDate endDate, boolean repeat) {
        this.id = id;
        this.goalName = goalName;
        this.goalDescription = goalDescription;
        this.dateCreated = dateCreated;
        this.endDate = endDate;
        this.repeat = repeat;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGoalName() {
        return goalName;
    }

    public void setGoalName(String goalName) {
        this.goalName = goalName;
    }

    public String getGoalDescription() {
        return goalDescription;
    }

    public void setGoalDescription(String goalDescription) {
        this.goalDescription = goalDescription;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public boolean isRepeat() {
        return repeat;
    }

    public void setRepeat(boolean repeat) {
        this.repeat = repeat;
    }
}
