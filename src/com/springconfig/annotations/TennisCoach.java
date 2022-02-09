package com.springconfig.annotations;

import org.springframework.stereotype.Component;

/*@Component("tennisCoach")*/
//using Default Bean Id here
@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice backhand volley";
		
	}

}
