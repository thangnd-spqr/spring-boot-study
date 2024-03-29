package com.learning.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // inject properties value coach.name team.name

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;
    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Coach: " + coachName + ", Team name: " + teamName;
    }

    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

    // expose new end point for "work out"
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "run 5k";
    }

    // expose new endpoint for "fortune"
    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "You are lucky today !!!";
    }

}
