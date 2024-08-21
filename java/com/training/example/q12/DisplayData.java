package com.training.example.q12;

/*12. In below example, try to print total variable in different ways which explains different ways to call static variable
public class Demo {
	private static int total = 10;
	public static void main(String[] args) {
		//print total in different ways
	}
}
*/

public class DisplayData {
    private static int total = 10;
    
    public static void main(String[] args) {
        // Directly accessing the static variable within the same class
        System.out.println(total);

        //Accessing the static variable using the class name
        System.out.println(DisplayData.total);

        //Accessing the static variable using an instance
        DisplayData d = new DisplayData();
        System.out.println(d.total); // This works but is not preferred for static variables
    }

}


