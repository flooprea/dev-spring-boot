package com.example.demo.model;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice Serving";
    }
}
