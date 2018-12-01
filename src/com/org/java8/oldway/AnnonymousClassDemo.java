package com.org.java8.oldway;

import java.util.Comparator;

import com.org.java8.model.Employee;
import com.org.java8.model.EmployeeData;

/**
 * Things to cover
 * Anonymous classes introduction
 * What anonymous class are bad way to program
 * @author pulgupta
 *
 */
public class AnnonymousClassDemo {
	
	public static void main(String args[]) {
		
		Employee[] employees = EmployeeData.employees;
		
		Employee employee1 = employees[0];
		Employee employee2 = employees[1];
		
		//Compare employees based on salary
		new Comparator<Employee>() {
			
			@Override
			public int compare(Employee o1, Employee o2) {
				if(o1.getSalary()==o2.getSalary())
					return 0;
				else if(o1.getSalary()>o2.getSalary())
					return 1;
				return -1;
			}
		}.compare(employee1, employee2);
		
		
		//Compare employee based on name
		new Comparator<Employee>() {
			
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
		}.compare(employee1, employee2);
		
	}

}
