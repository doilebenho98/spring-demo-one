package com.luancode.springdemo;

public class BaseballCoach implements Coach {
  
	// define a private filed for the dependency
	public FortuneService fortuneService;
	
	// defien a constructor for  dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 miuntes on batting practice";
		
	}

	@Override
	public String getDailyFortune() {
		
		// use my fortuneService to get Fortune
		
		return fortuneService.getFortune();
	}
}
