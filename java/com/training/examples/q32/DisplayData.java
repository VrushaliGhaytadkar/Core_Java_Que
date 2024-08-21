package com.training.examples.q32;
/**
 * 32. In below program, try to call m1 method in different ways like with catching returned value,without catching returned value,call from expression i.e different ways which will show how to call non void methods
public class Demo {
	public static int m1(int i){
		return i*i;
	}
	public static void main(String[] args) {
		//call m1 method from here in different ways
	}
}

 */
public class DisplayData {
	public static int display(int i) {
        return i * i;
    }

    public static void main(String[] args) {
        // catch the returned value
        int result1 = display(5);  
        System.out.println("Result 1: " + result1); 

        // without catching the returned value
        display(10); 

        // Call display method within an expression
        int result2 = display(display(3));
        System.out.println("Result 2: " + result2); 
    }
}
