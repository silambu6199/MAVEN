package com.POJOcls;

public class PojoTopic {
	
	//1)Declare the elements as private 
	//2)Generate Getters and Setters
	//3)Initialize the values and call in the execution Classes
	
	private int age;
	
	private String name;
	
	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
