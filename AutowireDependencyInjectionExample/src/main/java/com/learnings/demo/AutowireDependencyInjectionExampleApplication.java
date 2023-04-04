package com.learnings.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AutowireDependencyInjectionExampleApplication {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context = SpringApplication.run(AutowireDependencyInjectionExampleApplication.class, args);
		Student s = context.getBean(Student.class);
		s.display();
	}

}
