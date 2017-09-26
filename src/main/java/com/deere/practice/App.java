package com.deere.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.deere.practice.config.BeanConfiguration;
import com.deere.practice.greeting.Diwali;
import com.deere.practice.greeting.TopGreeting;

/**
 * Hello world! String
 * 
 */

@SpringBootApplication
public class App  {
	
	@Autowired
	private TopGreeting greeting ;
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		ApplicationContext context= new AnnotationConfigApplicationContext(BeanConfiguration.class);
		Diwali d = context.getBean("diwali",Diwali.class);
		System.out.println(d.say());
	}
	
}
