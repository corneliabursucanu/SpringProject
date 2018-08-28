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

    //add an init method for the bean
    public void doStartupStuff(){
        System.out.println("this is the init method");
    }

    //add a destroy method for the bean
    public void destroyMethod(){
        System.out.println("this is the destroy method");
    }

}
