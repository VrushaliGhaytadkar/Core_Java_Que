package com.training.examples.q26;

import utility.Employee;

/**
 * 26.
public class Demo {
	public static void m1(int i){
		System.out.println(i);
	}
	public static void main(String[] args) {
		//create Employee object here with 101,sam,1000 data
		//call m1 method and pass employee id as parameter
	}
}

 */
public class EmployeeData {

    public static void displayId(int id) {
        System.out.println(id);
    }

    public static void main(String[] args) {
       
        Employee emp = new Employee(101, "sam", 1000);

        displayId(emp.getId());
    }
}
