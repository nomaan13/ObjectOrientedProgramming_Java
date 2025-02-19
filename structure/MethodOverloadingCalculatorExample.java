package structure;

public class MethodOverloadingCalculatorExample {
	public int add(int a , int b) {
		return a+b;
	}
	public double add(double a ,double b) {
		return a+b;
		
	}
	
	public int product(int a , int b) {
		return a*b;
	}

	public double  product(double a , double b) {
		return a*b;
		
	}
	
	public static void main(String[] args) {
		MethodOverloadingCalculatorExample m1 = new MethodOverloadingCalculatorExample();
		
		double d1 =m1.add(1.5, 3.5);
		System.out.println(m1.add(51, 49));
		System.out.println(m1.product(20, 50));
		System.out.println(m1.product(5.5, 2.5));
		System.out.println(d1);
		
	}
}
