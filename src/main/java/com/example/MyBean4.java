package com.example;


//inititalized in configuration java file
public class MyBean4 {

	private MyBean2 myBean2;
	
	
	public MyBean4(MyBean2 myBean2) {		
		this.myBean2 = myBean2;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
