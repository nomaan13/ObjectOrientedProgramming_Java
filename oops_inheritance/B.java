package oops_inheritance;

public class B extends A {

		int x=32;

		public void test() {
			int x = 90;
			System.out.println("Value of local x of class B : " + x);
			System.out.println("Value of global x of calss B:" + this.x);
			System.out.println("Value of x of calss A: " + super.x);
			System.out.println("*********************");
			demo();
		}
		
	}

