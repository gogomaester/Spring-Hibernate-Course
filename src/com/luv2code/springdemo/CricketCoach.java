package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	// create no arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: Inside no arg constructor.");
	}
	
	// setter method for injections
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println("CricketCoach: Inside the setter method. setFortuneService");
		this.fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes a day.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune() + " You can do it!";
	}

}
