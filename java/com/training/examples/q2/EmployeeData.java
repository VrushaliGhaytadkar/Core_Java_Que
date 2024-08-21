package com.training.examples.q2;

import utility.Employee;

public class EmployeeData {

	
	  public static void main(String[] args) {
	        Employee employee = new Employee(101, "Sam", 1000);

	        // Display the data using getter methods
	        System.out.println("Employee ID: " + employee.getId());
	        System.out.println("Employee Name: " + employee.getName());
	        System.out.println("Employee Salary: " + employee.getSal());

	   
	    }
}
