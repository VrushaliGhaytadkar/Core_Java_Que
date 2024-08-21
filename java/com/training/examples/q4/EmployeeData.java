package com.training.examples.q4;

import utility.Employee;

public class EmployeeData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    Employee employee = new Employee(101, "Sam", 1000);

	        // Display the data using getter methods
	        System.out.println("Employee ID: " + employee.getId());
	        System.out.println("Employee Name: " + employee.getName());
	        System.out.println("Employee Salary: $" + employee.getSal());

	   

	}

}
