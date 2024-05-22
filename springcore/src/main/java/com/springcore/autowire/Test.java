package com.springcore.autowire;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire/autoconfig.xml");
		
		Emp e = (Emp) context.getBean("emp");
		System.out.println(e);
	}
}
