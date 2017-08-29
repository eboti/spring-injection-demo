package com.example;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class Mercedes extends Car {

	public Mercedes() {
		super();
		brand = "Mercedes";
	}	

	@Override
	public String toString() {
		return "Mercedes [getBrand()=" + getBrand() + "]";
	}


}
