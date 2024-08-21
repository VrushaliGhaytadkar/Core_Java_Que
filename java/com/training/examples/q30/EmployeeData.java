package com.training.examples.q30;

import utility.Employee;

/**
 * 30. public class Demo {
	public static void m1(){
		//create Employee object here and return
		//do required changes in m1 method to do this task
	}


	public static void main(String[] args) {
		//call m1 method and catch returned employee object here
		//display returned employee data here
	}
}

}

 */
public class EmployeeData {
	public static Employee display() {
       
        return new Employee(101, "Sam", 1000);
    }

    public static void main(String[] args) {
        // Call display method
        Employee emp = display();

        // Display the returned employee data
        System.out.println(emp);
    }
}
