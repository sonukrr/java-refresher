package com.luv2code.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnotationsApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		TennisCoach myCoach = context.getBean("tennisCoach", TennisCoach.class);
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyFortune());

	}

}
