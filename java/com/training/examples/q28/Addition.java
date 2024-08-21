package com.training.examples.q28;

/**
 * 28.
public class Demo {
	public static int m1(int i){
		System.out.println("m1 called");
		return i*i;
	}
	public static void main(String[] args) {
		//call m1 method and pass some number
		int total = 100 + use returned value here;
		System.out.println(total);
	}
}

 */
public class Addition {
	
		public static int findSquare(int num){
			System.out.println("findSquare method called");
			return num*num;
		}
		public static void main(String[] args) {
			int num=5;
			int total = 100+ findSquare(num);
			System.out.println(total);
			
			
		}
	
}
