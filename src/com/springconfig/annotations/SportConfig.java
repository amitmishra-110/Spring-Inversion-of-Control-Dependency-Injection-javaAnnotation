package com.springconfig.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


//Java Configuration for Spring container, Purely java no xml required.

@Configuration
@PropertySource("classpath:sport.properties")
//@ComponentScan("com.springconfig.annotations") -commenting to only create beans for classes define below
public class SportConfig {
	
	//This class helps to remove annotation such as @Component to create instance of class & @Autowired to inject dependency in class.
	
	//define method to expose bean
	@Bean
	public FortuneService sadFortuneService()
	{
		return new SadFortuneService();
	}
	
	
	//define bean for swimcoach and inject dependency for swimcoach
	@Bean
	public  Coach swimCoach()
	{
		return new SwimCoach(sadFortuneService());
	}
	
	
	
	
	
	

}
