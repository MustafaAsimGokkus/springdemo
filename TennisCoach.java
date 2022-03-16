package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    @Qualifier("happyFortuneService")
	@Autowired //even though it is private spring will set this value behind the scenes
	private FortuneService fortuneService;
	
	
	//@Autowired //Spring will scan for a component that implements FortuneService interface. 
	           // HappyFortuneService meets the requirement
//	public TennisCoach(FortuneService theFortuneService) {
//		this.fortuneService=theFortuneService;
//	}
	
//	public TennisCoach() {
//		System.out.println(">>TennisCoach: Inside default constructor");
//	}
	
	//define a setter method
//	@Autowired
//	public void setFortuneService(FortuneService theFortuneService ) {
//		System.out.println(">>TennisCoach: Inside setFortuneService()");
//		fortuneService = theFortuneService;
//	}
	
//	@Autowired
//	public void doSomeCrazyStuff(FortuneService theFortuneService) {
//		System.out.println(">>TennisCoach: Inside setFortuneService()");
//		this.fortuneService = theFortuneService;
//	}
	
	
	@Override
	public String getDailyWorkOut() {
		
		return "Practice your backhand volley";
	}

	

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
