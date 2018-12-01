package com.org.java8.oldway;

import com.org.java8.model.Employee;
import com.org.java8.model.EmployeeData;

/**
 * Things to cover
 * This is one more pattern where we can see that old way of working is bad
 * We will show the new way of working in the lambdas section
 * @author pulgupta
 *
 */
public class IterativeFiltering {
	
	private static Employee[] employees = EmployeeData.employees;
	
	public void getEmployeeWithMinSalFivehundred() {
		for (Employee employee : employees) {
			if(employee.getSalary()>500)
				System.out.println(employee.getName());
				
		}
	}
	

	public void getEmployeeWithMinSaltwentyFivehundred() {
		for (Employee employee : employees) {
			if(employee.getSalary()>2500)
				System.out.println(employee.getName());
				
		}
	}
	
	//We can quickly say that we can do this in a better way if we 
	//pass a param into the function which determine the minimum salary requirement
	public void getEmployeeWithNameStartWithJ() {
		for (Employee employee : employees) {
			if(employee.getName().startsWith("J"))
				System.out.println(employee.getName());
				
		}
	}
	
	public static void main(String args[]) {
		
		IterativeFiltering itf = new IterativeFiltering();
		System.out.println("Employees with more than 500 dollar salary");
		itf.getEmployeeWithMinSalFivehundred();
		System.out.println("Employees with more than 2500 dollar salary");
		itf.getEmployeeWithMinSaltwentyFivehundred();
		System.out.println("Employees whose name starts with J");
		itf.getEmployeeWithNameStartWithJ();
	}
}
