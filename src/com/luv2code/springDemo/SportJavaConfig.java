package com.luv2code.springDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.luv2code.springDemo")
//@PropertySource("classpath:sports.properties")
public class SportJavaConfig {

	@Bean
	public FortuneService sadfFortuneService() {
		return new SadFortuneService(); 
	}
	
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadfFortuneService());
	}
}
