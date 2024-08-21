package com.training.examples.q5;

import utility.Employee;

public class EmployeeData {

	public static void main(String[] args) {
        
        Employee employee = new Employee(101, "Sam", 1000);

        show(employee);
    }

  
    public static void show(Employee emp) {
     
        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: $" + emp.getSal());
    }
}
