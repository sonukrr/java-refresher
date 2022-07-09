package com.luv2code.springDemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {

	// Field injection
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	@Value("${person.userName}")
	private String userName;
	
	@PostConstruct
	public void myCustomInitStuff() {
		System.out.println("Post constructor custom bean instantiation");
	}
	
	@PreDestroy
	public void myCleanUpStuff() {
		System.out.println("Pre bean destroy clean up stuff");
	}
	// setter injection
	/*
	 * @Autowired public void setFortuneService(FortuneService fortuneService) {
	 * this.fortuneService = fortuneService; }
	 */

	// construction injection
	/*
	 * @Autowired public TennisCoach(FortuneService fortuneService) {
	 * this.fortuneService = fortuneService; }
	 * 
	 */
	@Override
	public String getDailyWorkout() {
		return userName + ": Practice your right hand swing";
	}

	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}
}
