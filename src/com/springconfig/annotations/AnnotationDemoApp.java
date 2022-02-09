package com.springconfig.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		
		//load the spring config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	
			//retrieve bean from spring container
		Coach coach=context.getBean("tennisCoach",Coach.class);
		
		System.out.println("Workout for Tennis:"+ " " +coach.getDailyWorkout());
		
		//close the context
		context.close();

	}

}
