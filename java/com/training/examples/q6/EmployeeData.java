package com.training.examples.q6;

import utility.Employee;

public class EmployeeData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Employee employee1 = new Employee(1, "Sam", 1000);
        Employee employee2 = new Employee(2, "Vrushali", 1500);

        show(employee1, employee2);
    }

    
    public static void show(Employee emp1, Employee emp2) {
        // Display the data for the first employee
        System.out.println("Employee 1:");
        System.out.println("ID: " + emp1.getId());
        System.out.println("Name: " + emp1.getName());
        System.out.println("Salary: " + emp1.getSal());

        
        System.out.println();

        // Display the data for the second employee
        System.out.println("Employee 2:");
        System.out.println("ID: " + emp2.getId());
        System.out.println("Name: " + emp2.getName());
        System.out.println("Salary: " + emp2.getSal());
    }

	
}
