package com.training.examples.q11;

/*11. In below example ,try to call show method in different ways which explains different ways to call static methods
public class Demo {
	public static void main(String[] args) {
		//call show method in different ways
	}
	public static void show(){
		System.out.println("show method");
	}
}
*/
public class EmplyeeData {

	public static void main(String[] args) {
		       //  Directly calling the static method from within the same class
		        show();

		        // Calling the static method using the class name
		        EmplyeeData.show();

		        // Calling the static method using an instance of the class
		        EmplyeeData emp = new EmplyeeData();
		        emp.show();  

		        
		    }

		 

		    public static void show() {
		        System.out.println("show method");
		    }


}
