package com.selfhelpstation.selfhelpstation;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GoalsController {

    List<String> goals = new ArrayList<>();

    {
        goals.addAll(List.of("goal1", "goal2", "goal3"));
    }

    // CEATE

    // READ

    // Get all the greetings
    @GetMapping("/goals")
    public List<String> getAllGoals(){
        return goals;
    }

    // Get greeting by id
    @GetMapping("/goal/{id}")
    public String getGoalById(@PathVariable int id){
        if (id > goals.size() - 1 || id < 0){
            return "NOT FOUND";
        }
        return goals.get(id);
    }

    // UPDATE

    // DELETE

    // Delete greeting by id
    @DeleteMapping("goal/{id}")
    public boolean deleteGoalById(@PathVariable int id){
        // CHECK BOUNDS
        if (id > goals.size() -1 || id < 0){
            return false;
        }
        goals.remove(id);
        return true;
    }
 }
