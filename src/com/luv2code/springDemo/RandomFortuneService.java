package com.luv2code.springDemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] fortunes = {
			"Fortune 1",
			"Forune 2",
			"Fortune 3"
	};
	
	private Random myRandom = new Random();
	
	@Override
	public String getDailyFortune() {
		int randomIdx = myRandom.nextInt(fortunes.length);		
		return fortunes[randomIdx];
	}

}
