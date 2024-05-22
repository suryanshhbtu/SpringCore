package com.springcore.lifecycle.copy;

public class Samosa {

	double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}

	public void hye() {
		System.out.println("Inside init() Method");
	}
	public void bye() {
		System.out.println("Inside destroy() Method");
	}
	
}
