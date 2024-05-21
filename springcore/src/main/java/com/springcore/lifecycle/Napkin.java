package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Napkin {

	double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Napkin() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Napkin [price=" + price + "]";
	}

	
	// deprecared in java 9+ version, Since it comes along J2EE
	@PostConstruct
	public void hye() {
		System.out.println("Inside init() Method");
	}

	@PreDestroy
	public void bye() {
		System.out.println("Inside destroy() Method");
	}

	
}
