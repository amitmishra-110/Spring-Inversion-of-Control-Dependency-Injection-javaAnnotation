package com.springconfig.annotations;

import org.springframework.stereotype.Component;
//Helper class

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return  "Today is your Lucky day";
	}

}
