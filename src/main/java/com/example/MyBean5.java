package com.example;

import org.springframework.beans.factory.annotation.Value;


//inititalized in configuration java file
public class MyBean5 {

	private final String name;
	
	@Value("myfield")
	private String field;
	
	@Value("${something.value}")
	private String fieldAnother;
	
	
	public MyBean5(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getFieldAnother() {
		return fieldAnother;
	}

	public void setFieldAnother(String fieldAnother) {
		this.fieldAnother = fieldAnother;
	}

	@Override
	public String toString() {
		return "MyBean5 [name=" + name + ", field=" + field + ", fieldAnother="
				+ fieldAnother + "]";
	}	

}
