package com.springcore.spel;

import java.beans.Expression;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/config.xml");

		Demo d1 = context.getBean("d", Demo.class);
		System.out.println(d1);
		
		SpelExpressionParser temp = new SpelExpressionParser();
		org.springframework.expression.Expression exp = temp.parseExpression("22+44");
		System.out.println(exp.getValue());
	}
}	
