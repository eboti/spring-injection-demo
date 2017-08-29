package com.example;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class Toyota extends Car {
	
	public Toyota() {
		super();
		brand = "Toyota";
	}

	@Override
	public String toString() {
		return "Toyota [getBrand()=" + getBrand() + "]";
	}
	
	

}
