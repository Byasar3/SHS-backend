package com.selfhelpstation.selfhelpstation;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import javax.annotation.PostConstruct;
import org.springframework.core.io.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.io.FileReader;
import java.io.*;
import java.time.LocalDate;

@Component
public class GoalsInitializer {
    private final GoalsRepository goalsRepository;

    @Value("classpath:goals.json")
    private Resource resourceFile;

    @Autowired
    public GoalsInitializer(GoalsRepository goalsRepository) {
        this.goalsRepository = goalsRepository;
    }

    @PostConstruct
    public void init(){
        JSONParser jsonParser = new JSONParser();
        try(FileReader reader = new FileReader(resourceFile.getFile())){
            Object obj = jsonParser.parse(reader);

            JSONArray jsonArray = (JSONArray) obj;

            for (Object goal : jsonArray){
                JSONObject goalsJSON = (JSONObject) goal;

                long id = (long) goalsJSON.get("id");
                String goalName = (String) goalsJSON.get("goal_name");
                String goalDescription = (String) goalsJSON.get("goal_description");
                LocalDate dateCreated = (LocalDate) goalsJSON.get("date_created");
                LocalDate endDate = (LocalDate) goalsJSON.get("end_date");
                Boolean repeat = (boolean) goalsJSON.get("repeat");

                goalsRepository.addGoal(new Goal(id, goalName, goalDescription, dateCreated, endDate, repeat));
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
