package constructor_overloading;

public class CarDriver {
	public static void main(String[] args) {
		Car c1 = new Car();
		
		System.out.println(c1);
		c1.name = "Maruti";
		c1.price=500000;
		
		System.out.println("Name is "+ c1.name);
		System.out.println("Price is "+ c1.price);
		
		Car c2 =new Car("Alto",40000);
		System.out.println("Name of car c2 = " + c2.name);
		System.out.println("Price of car c2 = " + c2.price);
	}
}
