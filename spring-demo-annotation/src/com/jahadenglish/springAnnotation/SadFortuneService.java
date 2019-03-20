package com.jahadenglish.springAnnotation;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "It clearly not your day bro";
	}

}
