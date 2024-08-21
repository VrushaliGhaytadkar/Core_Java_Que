package com.training.examples.q23;

/**
 * public class Demo {
    public static void m1(Object o) {
        System.out.println("m1 method");
    }

    public static void main(String[] args) {
        // Call m1 method with an Object argument
        m1("Some String"); // Passing a String, which is also an Object
        m1(123);           // Passing an Integer, which is also an Object
        m1(new Object());  // Passing a new Object instance
    }
}

 */
public class DisplayData {
	
	    public static void display(Object o) {
	        System.out.println("display method");
	    }

	    public static void main(String[] args) {
	        // Call m1 method with an Object argument
	       
	    	display(new Object());  // Passing a new Object instance
	    }
	

}
