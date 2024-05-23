package com.springcore.stereotype;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("abc")
public class Student {

	@Value("Suryansh")
	private String name;
	@Value("12")
	private int standard;
	@Override
	public String toString() {
		return "Student [name=" + name + ", standard=" + standard + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStandard() {
		return standard;
	}
	public void setStandard(int standard) {
		this.standard = standard;
	}
	
	
}
