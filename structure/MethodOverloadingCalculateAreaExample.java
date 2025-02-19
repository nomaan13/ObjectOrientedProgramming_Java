package structure;

public class MethodOverloadingCalculateAreaExample {

	public void area(int side) {
		System.out.println("Area is :" + side*side);
		
	}
	public void area(double radius) {
		System.out.println("Area is : "+ 3.14*radius*radius);
	}
	public void area(int length ,int bredth) {
		System.out.println("Area is : "+ length*bredth);
	}
	
	
	public static void main(String[] args) {
		MethodOverloadingCalculateAreaExample m2 = new MethodOverloadingCalculateAreaExample();
		
		m2.area(25);
		m2.area(21);
		m2.area(12, 6);
	}
}
