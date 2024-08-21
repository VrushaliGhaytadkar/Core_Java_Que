package com.training.examples.q34;

import java.util.Scanner;

import utility.Employee;

/**
 * 34. 
public class Demo {
	public static void main(String[] args) {
		//take data id,name,salary from user using scanner and display that data in show method
	}

	public void show(){
		//display data here by doing required changes
	}
}

 */
public class EmployeeData {
	
    public void show(Employee emp) {
        
        if (emp != null) {
            System.out.println("employee ID: " + emp.getId());
            System.out.println("employee Name: " +emp.getName());
            System.out.println("employee Salary: " + emp.getSal());
        } else {
            System.out.println("No employee data available.");
        }
    }
    
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);

     
     System.out.print("Enter employee ID: ");
     int id = scanner.nextInt();
     scanner.nextLine(); 

     System.out.print("Enter employee name: ");
     String name = scanner.nextLine();

     System.out.print("Enter employee salary: ");
     int salary = scanner.nextInt();

     Employee emp = new Employee(id, name, salary);
     
     EmployeeData empdata = new EmployeeData();
     
    
     empdata.show(emp);

     scanner.close();
     
	}
}
	
