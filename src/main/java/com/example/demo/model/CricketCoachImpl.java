package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class CricketCoachImpl implements Coach {

    @Override
    public String getDailyWorkout() {
        return "practice 15 min bowling";
    }

}
