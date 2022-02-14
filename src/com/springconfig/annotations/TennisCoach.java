package com.springconfig.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/*@Component("tennisCoach")*/
//using Default Bean Id here
@Component
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//Field Injection
	/*@Autowired
	private FortuneService fortuneService*/;
	
	
	//default constructor for tracing purpose
	public TennisCoach()
	{
		System.out.println("Inside default constructor");
	}
	
	//Constructor Injection with Qualifers for multiple implementation of helper classes for a single interface

	@Autowired
  public TennisCoach(@Qualifier("randomFortuneService")FortuneService theFortuneService) {
	  fortuneService=theFortuneService;
	  
	  }
	 

	
	//Setter Injection -Define setter method
	/*
	 * @Autowired public void setFortuneService(FortuneService fortuneService) {
	 * this.fortuneService=fortuneService;
	 * 
	 * System.out.println("Inside setter  method setFortuneService();"); }
	 */
	@Override
	public String getDailyWorkout() {
		return "Practice backhand volley";
		
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
		
	}

}
