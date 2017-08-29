package com.example;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class Mazda extends Car {
	
	private String myNullString = null;

	public Mazda() {
		super();
		brand = "Mazda";
	}
	
	

	@Override
	public void setBrand(String brand) {
		myNullString.contains(brand);
	}



	@Override
	public String toString() {
		return "Mazda [getBrand()=" + getBrand() + "]";
	}


}
