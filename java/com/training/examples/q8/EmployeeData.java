package com.training.examples.q8;

import utility.Employee;

/*9.
public class Demo {
	public static void main(String[] args) {
		//create Employee object with 101,sam,1000 data
		//display this object data by passing to show method
		//add 100 bonus in salary 
		//display this object data by passing to show method
	}
	public static void show(){
		//do required changes in show method
	}
}
*/
public class EmployeeData {

	public static void main(String[] args) {
	
        Employee employee = new Employee(101, "Sam", 1000);

       
        show(employee);
        employee.setSal(employee.getSal() + 100);

        show(employee);
    }

    
    public static void show(Employee emp) {
       
        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSal());
        System.out.println(); // Add a blank line for readability
    }

	

}
