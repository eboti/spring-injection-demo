package com.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfiguration {

	@Bean
	@Scope("prototype")
	public MyBean2 myBean2(){
		return new MyBean2();
	}
	
	@Bean
	public MyBean3 myBean3(){
		return new MyBean3();
	}
	
	@Bean
	public MyBean4 myBean4(){
		return new MyBean4(myBean2());
	}
	
	@Bean
	@Qualifier("five")
	public MyBean5 myBean5(){
		return new MyBean5("5");
	}
	
	@Bean
	@Qualifier("fiftyfive")
	public MyBean5 myBean55(){
		return new MyBean5("55");
	}

}
