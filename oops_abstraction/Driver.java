package oops_abstraction;

public class Driver {
	public static void main(String[] args) {
		
		//Up-casting
		Vehicle v1 = new ElectricCar();
		Car c1 = new ElectricCar();
		ElectricCar e1 = new ElectricCar();
		
		//Methods of Vehicle class
		v1.start();			
		v1.accelerate();
		v1.drive();
		v1.stop();
		
		System.out.println("***************************************************************************************");
		//Methods of parent class(VEhicle-class)
		c1.start();
		c1.accelerate();
		c1.drive();
		c1.stop();
		//Methods of car class
		c1.openGate();
		c1.playMusic();
		
		System.out.println("***************************************************************************************");
		System.out.println("Car company is : " + e1.name);
		e1.start();
		e1.accelerate();
		e1.drive();
		e1.stop();
		
		e1.openGate();
		e1.playMusic();
		
		System.out.println("***************************************************************************************");
		
		ElectricCar e2 = new ElectricCar(2022,"BMW","RED","Q3","nomaan");	//Assigning values through constructor
		e2.display();
		
		
	}

}
