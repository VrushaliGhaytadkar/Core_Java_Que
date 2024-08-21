package com.training.examples.q14;
/*
 * 14.
public class Test {
	
public void show(){
		System.out.println("Hello world");
	}
}

public class Demo {
	public static void main(String[] args) {
		//call show method of Test class from here
	}
}
*/

class Greeting {
	public void show(){
		System.out.println("Hello world");
	}

}

public class ShowGreeting {

	public static void main(String[] args) {
      
        Greeting greeting = new Greeting();
        
        greeting.show();
    }
}
