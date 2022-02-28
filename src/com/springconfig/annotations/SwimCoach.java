package com.springconfig.annotations;

import org.springframework.beans.factory.annotation.Value;

//No annotations as Component since we are doing complete java based config
public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//Properties file injection in fields
		@Value("${foo.email}")
		private String email;
		
		@Value("${foo.name}")
		private String name;
		
		
	//getters method to get value of email and name
	public String getEmail() {
		return email;
	}

	public String getName() {
		return name;
	}

	
	//costructor to inject dependencies
	public SwimCoach(FortuneService theFortuneService)
	{
		fortuneService=theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Swim 500m for warmup";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
