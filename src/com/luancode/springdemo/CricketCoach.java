package com.luancode.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	// add new fileds for emailAdderss and team
	private String emailAdderss	;
	private String tema;
	

	//creat a no-arg constuctor
	public CricketCoach() {
		System.out.println("CricketCoach: insdes a no-arg constuctor");
	}
	
	
	//our setter metthod
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: insdes setter metthod - setFortuneService");
		this.fortuneService = fortuneService;
	}




	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public String getEmailAdderss() {
		return emailAdderss;
	}


	public void setEmailAdderss(String emailAdderss) {
		System.out.println("CricketCoach: insdes setter metthod - EmailAdderss");
		this.emailAdderss = emailAdderss;
	}


	public String getTema() {
		return tema;
	}


	public void setTema(String tema) {
		System.out.println("CricketCoach: insdes setter metthod - tema");
		this.tema = tema;
	}

}
