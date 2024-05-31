package com.example.demo.model;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    public CricketCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @PostConstruct
    public void doStartupStuff() {
        System.out.println("We're in doStrartUpStuff");
    }

    @PreDestroy
    public void doCleanupStuff() {
        System.out.println("We're in doCleanupStuff");
    }

    @Override
    public String getDailyWorkout() {
        return "practice 15 min bowling";
    }

}
