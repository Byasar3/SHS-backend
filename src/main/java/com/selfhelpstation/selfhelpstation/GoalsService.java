package com.selfhelpstation.selfhelpstation;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GoalsService {

    @Autowired
    GoalsRepository goalsRepository;

    // CREATE

    public void addGoal(Goal goal){
        goalsRepository.save(goal);
    }

    // READ

    public List<Goal> getAllGoals(){
        return goalsRepository.findAll();
    }

    public Goal getGoalById(long id){
        Optional<Goal> goal = goalsRepository.findById(id);
        // needs error /exception handling
        return goal.get();
    }

    // UPDATE

    // DELETE
    @Transactional
    public void deleteGoalById(long id){
        // need repo method
    }
}
