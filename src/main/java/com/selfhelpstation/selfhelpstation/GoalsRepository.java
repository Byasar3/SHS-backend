package com.selfhelpstation.selfhelpstation;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GoalsRepository {

    // array list of goals
    private final List<Goal> goals = new ArrayList<>();

    // CREATE
    // add a goal
    public void addGoal(Goal goal){
        goals.add(goal);
    }

    // READ
    // return all goals
    public List<Goal> getAllGoals(){
        return goals;
    }

    // return goal by id
    public Goal getGoalById(long id){
        for (Goal goal : goals){
            if (goal.getId() == id){
                return goal;
            }
        }
        return null;
    }

    // UPDATE

    // DELETE
    public boolean deleteGoalById(long id){
        return goals.removeIf(goal -> goal.getId() == id);
    }
}
