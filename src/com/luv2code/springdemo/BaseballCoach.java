package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	
	// define a private field for Fortune
	private FortuneService fortuneService;
	
	// define a class constructor
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice.";
	}

	@Override
	public String getDailyFortune() {
		// use my fortune service to give the fortune
		return fortuneService.getFortune();
	}
	
}
