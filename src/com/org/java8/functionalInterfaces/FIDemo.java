package com.org.java8.functionalInterfaces;

import java.util.Comparator;
import java.util.concurrent.Callable;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.org.java8.model.Employee;

/**
 * Things to cover
 * What is functional interface?
 * What is a default method? Show default methods of Comparator
 * What are pure functional interface?
 * Is it any good to create a pure functional interface?
 * Can we create our own FI's and use them with Lambdas?
 * 
 * @author pulgupta
 *
 */
public class FIDemo {

	//OLD
	Runnable runnable = null;
	Callable<String> callable = null;
	Comparator<Employee> comparator = null;
	Comparable<Employee> comparable = null;
	
	//NEW
	Supplier<String> supplier = null;
	Consumer<String> consumer = null;
	Predicate<String> predicate = null;
	Function<String, String> function = null;
}
