package com.example.demo;

public class topic {

	private String name;
	int age,regno;
	public topic(String name, int age, int regno) {
		super();
		this.name = name;
		this.age = age;
		this.regno = regno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	
	
}
