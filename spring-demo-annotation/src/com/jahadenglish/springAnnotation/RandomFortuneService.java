package com.jahadenglish.springAnnotation;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	///create an array of strings
	private String[] data = {"beware of strangers", 
							 "go play the lottery today *wink wink*",
							 "blessed are the humble "};
	private Random r = new Random();
	
	@Override
	public String getFortune() {
		//pick a random fortune from the array
		int index = r.nextInt(data.length);
		String fortune = data[index];
		
		return fortune;
	}

}
