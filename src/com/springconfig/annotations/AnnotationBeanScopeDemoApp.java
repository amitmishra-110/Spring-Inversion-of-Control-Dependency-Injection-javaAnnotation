package com.springconfig.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load the spring config file
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean from spring container
		
		Coach thecoach=context.getBean("tennisCoach",Coach.class);
		
		Coach alphaCoach=context.getBean("tennisCoach",Coach.class);
		
		//checking if same object
		
		boolean result;
		result= (thecoach==alphaCoach);
		System.out.println("Pointing to the same object"+" " +result);
		System.out.println("Memory location for the theCoach Object"+ thecoach);
		System.out.println("Memory location for the alphaCoach Object"+alphaCoach);
		
		
		//closing the context
		context.close();
	}

}
