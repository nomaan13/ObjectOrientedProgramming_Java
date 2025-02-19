package oops_inheritance;

public class A {
	
		int x = 12;
		public void demo() {
			int x = 20;
			System.out.println("Value of local x: " + x);
			System.out.println("Value of global x: "+ this.x);
			
		}
	}
