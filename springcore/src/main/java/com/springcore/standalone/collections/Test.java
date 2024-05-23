package com.springcore.standalone.collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/config.xml");
		
		Person p = (Person) context.getBean("p1");
		System.out.println(p);
	}
}
