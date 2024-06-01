package com.example.demo.model;

public class SwimCoach implements Coach{

    public SwimCoach() {
        System.out.println("In Constrictor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 m as warmup";
    }
}
