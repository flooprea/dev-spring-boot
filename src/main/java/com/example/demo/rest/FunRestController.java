package com.example.demo.rest;

import com.example.demo.model.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    private Coach myCoach;
    private Coach anotherCoach;

    @Autowired
    public FunRestController(@Qualifier("cricketCoach") Coach theCoach,
                             @Qualifier("cricketCoach") Coach theAnotherCoach) {
        myCoach = myCoach;
        anotherCoach = anotherCoach;
    }

    @GetMapping(path = "/dailyworkout")
    private String secondFunction() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check() {
        return "Comparing beans " + (myCoach == anotherCoach);
    }

    @GetMapping(path = "/fortune")
    private String returnFortune() {
        return "today is your lucky day";
    }

}
