package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		// destroy() not working with above code
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
//		Samosa s1 = (Samosa) context.getBean("s1");
//		System.out.println(s1);
		
		// works only with abstract application context
		context.registerShutdownHook();
//		System.out.println("|<------------------------>|");
//		Pepsi p1 = (Pepsi) context.getBean("p1");
//		System.out.println(p1);
		
		// doubt why pepsi is being printed
		System.out.println("|<------------------------>|");
		Napkin n1 = (Napkin) context.getBean("n1");
		System.out.println(n1);
		
	}
}
