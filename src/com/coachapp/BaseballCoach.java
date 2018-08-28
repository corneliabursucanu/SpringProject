package com.coachapp;

public class BaseballCoach implements Coach {

    //create private field with interface type for dependency injection;
    private FortuneService fortuneService;

    //define a constructor for dependency injection
    public BaseballCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Spend 30 minutes on batting practice";

    }

    @Override
    public String getDailyFortune(){
        return fortuneService.getFortune();
    }
}
