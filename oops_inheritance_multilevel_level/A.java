package oops_inheritance_multilevel_level;

public class A {
	int  p = 10;
	int  i = 100;
	
	
	public void test() {
		int p = 11;
		int m = 121;
		
		System.out.println("p value from test method is : " + p);
		System.out.println("m value from test method is : " + m);
		System.out.println("value of global non-static variable p is :"+ this.p );
		System.out.println("value of global non-static variable p is :"+ this.i );
		
		
	}
	
}
