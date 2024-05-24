package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Value;

public class Student {

	private Samosa samosa;
	
	
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	@Value("Suryansh Srivastava")
	private String name;
	
	@Value("1001")
	private String rollNo;

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private String getRollNo() {
		return rollNo;
	}

	private void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		samosa.display();
		return "Student [name=" + name + ", rollNo=" + rollNo + "]";
	}
	
	
}
