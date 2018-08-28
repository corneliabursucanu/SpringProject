package com.coachapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach anotherCoach = context.getBean("myCoach", Coach.class);

        //now we have Singleton Scope so we should have the same been so let's check is that's true
        // with prototype scope memory locations are not the same

        boolean result = theCoach == anotherCoach;

        System.out.println(result);

        System.out.println("Memory location for theCoach " + theCoach );
        System.out.println("Memory location for theCoach " + anotherCoach );

        context.close();
    }
}
