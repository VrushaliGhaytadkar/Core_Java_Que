package com.training.examples.q25;

import utility.Employee;

/**
 * 25.
public class Demo {
	public static void m1(Object o){
		//display employee data here
	}
	public static void main(String[] args) {
		//create Employee object here with 101,sam,1000 data
		//call m1 method by passing this Employee object
	}
}

 */
public class DisplayData {
	
	public static void displayEmployeeData(Object o) {
        
            	
   		   Employee e = (Employee) o;
   		   System.out.println("Employee ID: " + e.getId());
           System.out.println("Employee Name: " + e.getName());
           System.out.println("Employee Salary: " + e.getSal());
        
        
    }

    public static void main(String[] args) {
       
        Employee emp = new Employee(1,"John", 1005);

        displayEmployeeData(emp);
    }

}
