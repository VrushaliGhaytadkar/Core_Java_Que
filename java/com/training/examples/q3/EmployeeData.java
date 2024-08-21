package com.training.examples.q3;

import utility.Employee;

public class EmployeeData {
	
	public static void maing(String args[]) {
	    Employee employee = new Employee(); 
	     employee.setId(101);
	     employee.setName("Sam");
	     employee.setSal(1000);

	      System.out.println("Employee ID: " + employee.getId());
	      System.out.println("Employee Name: " + employee.getName());
	      System.out.println("Employee Salary: $" + employee.getSal());
	}

}

