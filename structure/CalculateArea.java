package structure;

public class CalculateArea {
	public double getArea(double radius) {
		return 3.14*radius*radius;
	}
	
	public double getArea(double length, double bredth) {
		return length * bredth;
	}
	public int getArea(int side) {
		return side*side;
	}
	
	public static void main(String[] args) {
		CalculateArea ca = new CalculateArea();
		
		System.out.println(ca.getArea(22.4));	;
		System.out.println(ca.getArea(5,4));
		System.out.println(ca.getArea(5));
	}
	

}
