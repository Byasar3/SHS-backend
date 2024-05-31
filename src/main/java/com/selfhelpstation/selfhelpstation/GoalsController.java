package com.selfhelpstation.selfhelpstation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GoalsController {

    @Autowired
    GoalsRepository goalsRepository;

    // CREATE
    @PostMapping("/goal")
    public Goal createGoal(@RequestBody Goal goal){
        goalsRepository.addGoal(goal);
        return goal;
    }

    // READ

    // Get all the greetings
    @GetMapping("/goals")
    public List<Goal> getAllGoals(){
        return goalsRepository.getAllGoals();
    }

    // Get greeting by id
    @GetMapping("/goal/{id}")
    public Goal getGoalById(@PathVariable int id){
        return goalsRepository.getGoalById(id);
    }

    // UPDATE

    // DELETE

    // Delete greeting by id
    @DeleteMapping("goal/{id}")
    public boolean deleteGoalById(@PathVariable int id){
        return goalsRepository.deleteGoalById(id);
    }
 }
