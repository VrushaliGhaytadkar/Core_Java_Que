package com.training.examples.q31;

import utility.Employee;

/**
 * 31.
public class Demo {
	public static Object m1(){
		//create Employee object here and return
		//don’t change m1 method prototype i.e return type or access specifier
	}
	public static void main(String[] args) {
		//call m1 method and catch returned employee object here
		//display returned employee data here
	}
}

 */
public class EmployeeData {
	
	public static Object display(){
		 return new Employee(101, "Sam", 1000);
	}
	
	public static void main(String[] args) {
		
            Object obj = display();

            Employee emp = (Employee) obj;
           
            System.out.println(emp);
        
    }
		

}
