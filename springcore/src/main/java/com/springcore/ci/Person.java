package com.springcore.ci;

import java.util.List;

public class Person {
	private String name;
	private int age;
	private Certificate certi;
	private List<String> list;

	public Person(String name, int age, Certificate certi, List<String> list) {
		super();
		this.name = name;
		this.age = age;
		this.certi = certi;
		this.list = list;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", certi=" + certi + ", list=" + list + "]";
	}


}
