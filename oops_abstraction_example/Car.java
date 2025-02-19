package oops_abstraction_example;

public class Car extends Vehicle {
	
	Car (){}
	Car(int no_of_tyres){
		super(no_of_tyres);
	}
	
	public void display() {
		System.out.println("Number of tyres in Car is : "+ super.no_of_tyres);
		
	}

	@Override
	public void start() {
		System.out.println("Start the Car with key!!!");
		
	}

	@Override
	public void accelerate() {
		System.out.println("Accelerate the Car!!!");
		
	}

	@Override
	public void drive() {
		System.out.println("Drive the Car!!!");
		
	}

	@Override
	public void stop() {
		System.out.println("Stop the Car!!!");
		
	}
	
	public void show() {
		
		start();
		
		accelerate();
		drive();
		stop();
		
	}

}
