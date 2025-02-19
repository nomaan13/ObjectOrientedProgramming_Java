package oops_inheritance_multilevel_level;

public class B extends A {
	int p = 12;
	int j = 124;
	
	public void test2() {
		int p= 20;
		int r = 33;
		
	
		
		
		
		System.out.println("value of global non-static variable p is :"+ p );
		System.out.println("value of r from test2 is :" + r);
		
		System.out.println("value of global non-static variable p is :"+ this.p );
		System.out.println("value of global non-static variable j is :"+ j );
		System.out.println("value of global non-static variable p is :"+ super.p );
	}

}
