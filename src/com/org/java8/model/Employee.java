package com.org.java8.model;

public class Employee {
	
	private String name;
	private int salary;
	
	public Employee() {
	}
	
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public static void about(String inputData) {
		System.out.println("This is an employee class which we will be using for our demo purposes");
		System.out.println(inputData);
		
	}
	
	public int increment(int salary) {
		System.out.println("This is an increment call " + salary);
		return salary + 200;
	}
	
	

}
