package com.springcore.autowire;

public class Emp {

	private Address address;

	
	public Emp() {
		super();
		System.out.println("Inside address constructor");
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	
}
