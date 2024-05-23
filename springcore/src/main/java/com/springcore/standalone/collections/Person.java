package com.springcore.standalone.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Properties;

public class Person {

	private List<String> friends;
	private HashMap<String, Integer> fees;
	private Properties properties;

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public List<String> getFriends() {
		return friends;
	}

	public HashMap<String, Integer> getFees() {
		return fees;
	}

	public void setFees(HashMap<String, Integer> fees) {
		this.fees = fees;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", fees=" + fees + ", properties=" + properties + "]";
	}

	
	
}
