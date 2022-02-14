package com.springconfig.annotations;

import java.util.Random;

import org.springframework.stereotype.Component;



//Demonstrating Qualifier annotation
@Component
public class RandomFortuneService implements FortuneService {
	
	private String data[]= {"Hi Amit Mishra","Hi Suman Mishra","Hi Sunil Mishra","Hi Sumeet Mishra"};
	
	private Random myRandom=new Random();

	@Override
	public String getFortune() {
		
		int index=myRandom.nextInt(data.length);
		return data[index];
	}

}
