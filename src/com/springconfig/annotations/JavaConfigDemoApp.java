package com.springconfig.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		
		//load the spring config file from a Java class
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
	
	    //retrieve bean from spring container
		Coach coach=context.getBean("tennisCoach",Coach.class);
		
		//Setter Injection Method will be automatically called
		
		//calling class method
		System.out.println("Workout for Tennis:"+ " " +coach.getDailyWorkout());
		
		//call method to get daily fortune for Dependency Injection using constructor injection
		System.out.println("Daily fortune service using constructor injection :"+coach.getDailyFortune());
		
		//close the context
		context.close();

	}
}
