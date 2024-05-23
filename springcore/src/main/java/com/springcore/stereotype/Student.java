package com.springcore.stereotype;


import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("abc")
@Scope("prototype")
public class Student {

	@Value("Suryansh")
	private String name;
	
	@Value("12")
	private int standard;
	
	@Value("#{cities}")
	private List<String> city;
	@Override
	public String toString() {
		return "Student [name=" + name + ", standard=" + standard + ", city=" + city + "]";
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
	public List<String> getCity() {
		return city;
	}
	public void setCity(List<String> city) {
		this.city = city;
	}
	
	
}
