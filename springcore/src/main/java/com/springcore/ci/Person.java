package com.springcore.ci;

public class Person {
	private String name;
	private int age;
	private Certificate certi;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(String name, int age, Certificate certi) {
		super();
		this.name = name;
		this.age = age;
		this.certi = certi;
	}
	public Certificate getCerti() {
		return certi;
	}
	public void setCerti(Certificate certi) {
		this.certi = certi;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", certi=" + certi + "]";
	}
	
}
