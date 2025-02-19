package oops_inheritance_single_level;

public class Dog extends Animal {
	int c =5;
	int d = 20;
	
	
	public void displayC() {
		int a = 23;
		System.out.println("Value of a is :"+a);
		System.out.println("Value of c is :"+c);
		System.out.println("Value of d is :"+d);
		System.out.println("Value of a from class Animal is  :"+ super.a);
		
		
	}

}
