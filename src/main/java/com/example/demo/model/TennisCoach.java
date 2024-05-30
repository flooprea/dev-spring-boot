package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice Serving";
    }
}
