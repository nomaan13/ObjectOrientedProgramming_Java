package oops_abstraction;

public abstract class Vehicle {
	
	int yom;
	String color ;
	
	Vehicle() {}
	
	Vehicle(int yom,String color){
		this.yom=yom;
		this.color=color;
	}
//Concrete methods
	public void start() {
		System.out.println("Start the car");
	}
	public void accelerate() {
		System.out.println("Accelerate the car");
	}
//Abstract methods
	public  abstract void drive();
	public abstract void stop();
	
}
