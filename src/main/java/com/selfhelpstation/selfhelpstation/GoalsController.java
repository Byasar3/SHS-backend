package com.selfhelpstation.selfhelpstation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GoalsController {

    @Autowired
    GoalsService goalsService;

    // CREATE
    @PostMapping("/goal")
    public Goal createGoal(@RequestBody Goal goal){
        goalsService.addGoal(goal);
        return goal;
    }

    // READ

    // Get all the greetings
    @GetMapping("/goals")
    public List<Goal> getAllGoals(){
        return goalsService.getAllGoals();
    }

    // Get greeting by id
    @GetMapping("/goal/{id}")
    public Goal getGoalById(@PathVariable int id){
        return goalsService.getGoalById(id);
    }

    // UPDATE

    // DELETE

    // Delete greeting by id
    @DeleteMapping("goal/{id}")
    public String deleteGoalById(@PathVariable int id){
        goalsService.deleteGoalById(id);
        return "Goal has been deleted";
    }
 }
