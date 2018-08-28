package com.coachapp;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Just run 5k";
    }

    @Override
    public String getDailyFortune(){
        return "just do it " + fortuneService.getFortune();

    }

}
