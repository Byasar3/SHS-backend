package com.selfhelpstation.selfhelpstation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface GoalsRepository extends JpaRepository<Goal, Long> {

    // delete
    @Query
    void deleteGoalById(long id);
}
