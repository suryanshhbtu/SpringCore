package com.springcore.ci;

public class Addition {

	// order matter if string constructor is missing, else it will be called first
	// we can do index, type customization in xml file
	int a, b;
	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Constructor : (int, int)");
	}
	public Addition(double a, double b) {
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("Constructor : (double, double)");
	}
	public Addition(String a, String b) {
		this.a = 11;
		this.b = 11;
		System.out.println("Constructor : (String, String)");
	}
	@Override
	public String toString() {
		return "Addition [a=" + a + ", b=" + b + "]";
	}
	
}
