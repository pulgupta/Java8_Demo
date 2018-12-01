package com.org.java8.lambdas;

import java.util.function.Predicate;

import com.org.java8.model.Employee;
import com.org.java8.model.EmployeeData;


/**
 * Things to cover
 * What is a lambda?
 * What are the benefits of lambdas?
 * What are the consequences of these lambdas in terms of design and design patterns?
 * How are objects created for lambdas and in this way how do they differ from Anonymous classes?
 * How can we access instance variables, static variables, local variables of methods(which are effectively Final)?
 * 
 * @author pulgupta
 *
 */
public class LambdasExample {

	Employee[] ourEmployees = EmployeeData.employees;
	
	public void filter(Predicate<Employee> predicate) {
		for (Employee employee : ourEmployees) {
			if (predicate.test(employee)) {
				System.out.println(employee.getName());
			}
		}
	}
	
	public static void main( String args[] ) {
		LambdasExample le = new LambdasExample();
		System.out.println("Employees with more than 500 dollar salary");
		le.filter( e -> e.getSalary()>500);
		System.out.println("Employees with more than 2500 dollar salary");
		le.filter( e -> e.getSalary()>2500);
		System.out.println("Employees whose name starts with J");
		le.filter( e -> e.getName().startsWith("J"));
	
	
		
		
	}
	
}
