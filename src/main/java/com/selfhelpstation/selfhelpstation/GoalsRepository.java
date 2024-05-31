package com.selfhelpstation.selfhelpstation;

import java.util.ArrayList;
import java.util.List;

public class GoalsRepository {

    // array list of goals
    private final List<Goals> goals = new ArrayList<>();

    // CREATE
    // add a goal
    public void addGoal(Goals goal){
        goals.add(goal);
    }
}
