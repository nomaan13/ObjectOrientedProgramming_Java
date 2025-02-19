package structure;

public class Calculator {
	
	public int add(int a , int b) {
		return a+ b;
	}
	public double add(double a ,double b) {
		return a+b;
		
	}
	public int mul(int a ,int b) {
		return a*b;
		
	}
	public double mul(double a ,double b) {
		return a*b;
		
	}
	
	
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		
		System.out.println("Sum of two double is : "+c1.add(10.5, 9.5));
		System.out.println("Sum of two int is : "+c1.add(5, 25));
		System.out.println("multiplication of two int is: "+c1.add(20, 5));
		System.out.println("Multiplication of two double is : "+c1.add(5.0, 10.0));
		
		
	}

}
