package com.training.examples.q24;

import utility.Employee;

/**
 * 24.
public class Demo {
	public static void m1(Employee e){
		//display data here
	}
	public static void main(String[] args) {
		//call m1 method from here
	}
}

 */
public class EmployeeData {
	public static void displayEmployeeData(Employee e) {
        // Display the Employee data
        
		System.out.println("Employee ID: " + e.getId());
        System.out.println("Employee Name: " + e.getName());
        System.out.println("Employee Salary: " + e.getSal());
        
    }

    public static void main(String[] args) {
        // Create an instance of Employee
        Employee emp = new Employee(1,"John", 12345);

        displayEmployeeData(emp);
    }
}
