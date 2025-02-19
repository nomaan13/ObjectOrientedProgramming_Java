package oops_abstraction_interface;
public class Driver {
	public static void main(String[] args) {		
		Vehicle v1 = new ElectricCar();
		
		v1.start();
		v1.drive();
		v1.stop();
		
		System.out.println("****************************************************");
		
		Vehicle v2 = new Bike();
		v2.start();
		v2.drive();
		v2.stop();
		
		System.out.println("****************************************************");
		
		Car v3 = new SUV();
		v3.start();
		v3.drive();
		v3.stop();
		v3.openGate();
		v3.playSong();
		
		
		
	}

}
