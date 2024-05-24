package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class JavaConfig {

	
	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
	@Bean
	public Student getStudent(Samosa samosa) {
		Student student = new Student(samosa);
		return student;
	}
}
