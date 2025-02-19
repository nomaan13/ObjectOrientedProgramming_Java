package method_overriding;

public class Driver {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		v1.start();
		
		Vehicle v2 = new Car();
		v2.start();
		
		Vehicle v3 = new ElectricCar();
		v3.start();
		
}
}
