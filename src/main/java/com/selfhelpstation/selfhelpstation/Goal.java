package com.selfhelpstation.selfhelpstation;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.Random;

// creating an entity in db -> a table
@Entity
public class Goal {

    // setting primary key and letting database auto increment the values
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String goalName;
    private String goalDescription;
    private LocalDate dateCreated = LocalDate.now();
    private LocalDate endDate;
    private boolean goalRepeat;

    public Goal(){

    }

    public Goal(long id, String goalName, String goalDescription, LocalDate dateCreated, LocalDate endDate, boolean goalRepeat) {
        this.id = id;
        this.goalName = goalName;
        this.goalDescription = goalDescription;
        this.dateCreated = dateCreated;
        this.endDate = endDate;
        this.goalRepeat = goalRepeat;
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
        return goalRepeat;
    }

    public void setRepeat(boolean goalRepeat) {
        this.goalRepeat = goalRepeat;
    }
}
