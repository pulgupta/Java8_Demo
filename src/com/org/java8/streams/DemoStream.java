package com.org.java8.streams;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Stream;

import com.org.java8.model.Employee;
import com.org.java8.model.EmployeeData;

/**
 * The stream will traverse through the employees and will print the name of the employees 
 * who have salary more than 2500 dollars
 * 
 * Streams - (Creation methods, Intermediate Methods, Terminal methods)
 * Parallel Streams - benefits
 * Lazy evaluation in stream -> This means that suppose you create a stream, but that stream will not actually be used
 * till we have a terminal operation
 * What will happen if we have a stream and then few operation and then parallel?
 * 
 * @author pulgupta
 *
 */
public class DemoStream {
	
	
	static Employee[] ourEmployees = EmployeeData.employees;
	
	public static void main(String args[]) {
		
		//First Topic
		Arrays.stream(ourEmployees).filter(e -> e.getSalary()>2500)
									.map(Employee::getName)
									.sorted()
									.forEach(System.out::println);
		
		//Second Topic
		Arrays.stream(ourEmployees).parallel()
			.filter(e -> e.getSalary()>2500)
			.map(Employee::getName)
			.sorted()
			.forEach(System.out::println);
		
		//Third Topic
		Supplier<Double> supplier = () -> {
			System.out.println("in supplier");
			return Math.random();
		};
		
		Stream<Double> stream = Stream.generate(supplier);
		Stream<Double> newStream = stream.limit(10);
		//newStream.forEach(System.out::println);
	}
	

	
}
