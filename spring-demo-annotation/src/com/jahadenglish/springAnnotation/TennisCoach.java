package com.jahadenglish.springAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public TennisCoach() {
		System.out.println(">>Tennis Coach: inside default constructor ");
	}
	
	//create setter for setter injection
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">>Tennis Coach: inside setter method");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
	
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
