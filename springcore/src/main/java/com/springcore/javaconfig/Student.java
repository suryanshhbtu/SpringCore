package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Student {

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

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + "]";
	}
	
	
}
