package com.training.examples.q7;

import utility.Employee;

public class EmployeeData {

	public static void main(String[] args) {
		
				Employee emp = new Employee(101, "sam", 1000);
				EmployeeData.show(emp);
				System.out.println(emp.getId()+" " + emp.getName() + " "+ emp.getSal());
			}

			public static void show(Employee ex) {
				System.out.println(ex.getId() + " " + ex.getName() + " " + ex.getSal());
				ex.setId(102);
			}
		
}
