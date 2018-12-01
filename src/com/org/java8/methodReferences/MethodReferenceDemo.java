package com.org.java8.methodReferences;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import com.org.java8.model.Employee;

/**
 * Things to cover.
 * 
 * What are Method references?
 * What are the different types of method references which I can use?
 * What are the benefits of method reference?
 * Things to cover in stream -> How stream handles the instance details
 * @author pulgupta
 *
 */
public class MethodReferenceDemo {
	
	public static void main(String[] args) {
		Employee jane = new Employee("Jane", 2600);
		
		//Method reference of an instance
		Supplier<String> supplier = jane::getName;
		System.out.println(supplier.get());
		
		//Method reference of a class
		Function<Employee, Integer> function = Employee::getSalary;
		System.out.println(function.apply(jane));
		
		//Method reference of a static method
		Consumer<String> consumer = Employee::about;
		consumer.accept("test data");
		
	}
}
