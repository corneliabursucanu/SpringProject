package com.coachapp;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String email;
    private String team;

    public CricketCoach(){}

    public void setEmail(String email){
        System.out.println("Setter email injection");
        this.email = email;
    }

    public void setTeam(String team){
        System.out.println("Setter team injection");
        this.team = team;
    }

    public void setFortuneService(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Practice fast bowling for 15 minutes";
    }
    public String getDailyFortune(){
        return fortuneService.getFortune();
    }

    public String getEmail(){
        return this.email;
    }

    public String getTeam(){
        return this.team;
    }
}
