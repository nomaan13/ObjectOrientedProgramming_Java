package oops_abstraction_example;

public class Driver {

	public static void main(String[] args) {
		Car c1 = new Car();
		Bike b1 = new Bike(2);
		
		c1.display();
		c1.show();
		System.out.println("********************************************");
		
		b1.DisplayBike();
		
		

		
	}
}
