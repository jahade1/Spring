package com.jahadenglish.springAnnotation;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements FortuneService {

	@Override
	public String getFortune() {
		
		return null;
	}

}