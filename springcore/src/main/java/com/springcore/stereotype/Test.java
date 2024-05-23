package com.springcore.stereotype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/config.xml");

		Student s1 = context.getBean("abc", Student.class);
		System.out.println(s1.hashCode());
		
		Student s2 = context.getBean("abc", Student.class);
		System.out.println(s2.hashCode());
	}
}
