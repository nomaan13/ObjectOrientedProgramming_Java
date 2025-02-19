package oops_abstraction_example;

public class Bike extends Vehicle {

	public Bike() {
		
	}
	
	Bike(int no_of_tyres){

		this.no_of_tyres = no_of_tyres;
	}
	@Override
	public void start() {
		System.out.println("Start the Bike with kick!!!");
		
	}

	@Override
	public void accelerate() {
		System.out.println("Accelerate the Bike!!!");
		
	}

	@Override
	public void drive() {
		System.out.println("Drive the Bike!!!");
		
	}

	@Override
	public void stop() {
		System.out.println("Stop the Bike!!!");
		
	}
	
	
	public void DisplayBike() {
		System.out.println("Total number of tyres is : " + no_of_tyres);
		start();
		accelerate();
		drive();
		stop();
		
	}

}
