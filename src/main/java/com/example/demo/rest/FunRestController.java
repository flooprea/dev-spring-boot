package com.example.demo.rest;

import com.example.demo.model.Coach;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    private Coach myCoach;


    public FunRestController(@Qualifier("cricketCoachImpl") Coach myCoach) {
        this.myCoach = myCoach;
    }

    @GetMapping(path = "/dailyworkout")
    private String secondFunction() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping(path = "/fortune")
    private String returnFortune() {
        return "today is your lucky day";
    }

}
