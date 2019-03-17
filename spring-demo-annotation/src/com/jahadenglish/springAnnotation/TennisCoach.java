package com.jahadenglish.springAnnotation;

import org.springframework.stereotype.Component;

@Component("ThisDumbCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
	
		return "Practice your backhand volley";
	}

}
