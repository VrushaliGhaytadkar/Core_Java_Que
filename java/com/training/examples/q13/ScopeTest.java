package com.training.examples.q13;
/*13. public class Demo {
	int x = 10;
	public void show(){
		int x = 100;
		System.out.println(x);//do required changes at this line but output should be 100
		System.out.println(x);//do required changes at this line but output should be 10
	}
	public static void main(String[] args) {
		Demo d = new Demo();
		d.show();
	}	
}
*/
public class ScopeTest {


    int x = 10; // Instance variable

    public void show() {
        int x = 100; // Local variable

        // Printed the local variable x (should output 100)
        System.out.println(x);

        // Printed the instance variable x (should output 10)
        System.out.println(this.x);
    }

    public static void main(String[] args) {
    	ScopeTest var= new ScopeTest();
        var.show();
    }

}
