package com.jahadenglish.springAnnotation;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		
		return "Swim 1000 meter today";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
