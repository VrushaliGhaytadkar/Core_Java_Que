package com.training.examples.q27;

/**
 * 27.
public class Demo {
	public static int m1(int i){
		System.out.println("m1 called");
		return i*i;
	}
	public static void main(String[] args) {
		//call m1 method and pass some number
	}
}

 */
public class Square {
	public static int findSquare(int num){
		System.out.println("findSquare method called");
		return num*num;
	}
	public static void main(String[] args) {
		int num=5;
		findSquare(num);
		
	}
}
