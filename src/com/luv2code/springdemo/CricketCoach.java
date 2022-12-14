package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	// Fortune service
	private FortuneService fortuneService;
	
	
	// Coach info
	private String emailAddress;
	private String team;

	// create no arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: Inside no arg constructor.");
	}
	
	// Setters
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		this.team = team;
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
	
	// Get contacts
	public String getContactInformation() {
		return ("E-mail: " + this.emailAddress + "\nTeam: " + this.team);
	}

}
