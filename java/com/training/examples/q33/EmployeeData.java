package com.training.examples.q33;

import utility.Employee;
/**
 * 33.
 
public class Demo {
	public static void show(){
	}
	public static void process(){
		
	}
	public static void main(String[] args) {
		//do required changes in main,process and show method
		//create empty employee object here
		//add data into that empty object using process method
		//display employee object with data in show method
	}
}
*/
public class EmployeeData {

	    
	    public static void process(Employee emp) {
	        emp.setId(101);        
	        emp.setName("Sam");    
	        emp.setSal(1000);  
	    }

	 
	    public static void show(Employee emp) {
	        System.out.println(emp); 
	    }

	    public static void main(String[] args) {
	       
	        Employee emp = new Employee();

	        process(emp);

	        show(emp);
	    }
	}
