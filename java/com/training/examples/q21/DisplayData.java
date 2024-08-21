package com.training.examples.q21;

import utility.Employee;

/**
 * Ex: 21.
 public class Demo {
	public static void m1(Employee e){
		System.out.println("m1 method");
	}
	public static void main(String[] args) {
		//call m1 method from here
	}
}

 */
public class DisplayData {
	
	
		public static void display(Employee e){
			System.out.println("display method");
		}
		
		public static void main(String[] args) {
			Employee e = new Employee();
			display( e);
		}
	}
