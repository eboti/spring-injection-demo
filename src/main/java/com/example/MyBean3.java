package com.example;

import org.springframework.beans.factory.annotation.Autowired;

// inititalized in configuration java file
public class MyBean3 {

	private String name;
	
	@Autowired
	private MyBean2 myBean2;
	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
