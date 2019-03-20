package com.jahadenglish.springAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration 
//@ComponentScan("com.jahadenglish.springAnnotation")
public class SportConfig {
		
	
	//define a sadfortune service
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
	//define bean for swim coach and inject dependencies

}
