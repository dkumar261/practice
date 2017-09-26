package com.deere.practice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.deere.practice.greeting.Diwali;
import com.deere.practice.greeting.Greeting;
import com.deere.practice.greeting.Holi;
import com.deere.practice.greeting.TopGreeting;

@Configuration
public class BeanConfiguration {

	@Bean
	public Greeting holi(){
		Holi holi = new Holi();
		return holi;
	}
	
	@Bean
	public Greeting diwali(){
		Diwali diwali = new Diwali();
		return diwali;
	}
	
	@Bean
	public TopGreeting topGreeting(){
		TopGreeting topGreeting =new  TopGreeting();
		topGreeting.setGreeting(diwali());
		return topGreeting;
	}
}