package oops_abstraction_interface;

public class ElectricCar implements Car {
	
	@Override
	public void start() {
		System.out.println("Start the ElectricCar!");		
	}
	
	@Override
	public void drive() {
		System.out.println("Start the ElectricCar!");
	}
	
	@Override
	public void stop() {
		System.out.println("Stop the ElectricCar!");
	}
	
	@Override
	public void openGate() {
		System.out.println("Open the gate of ElectricCar!");
	}
	
	@Override
	public void playSong() {
		System.out.println("Play song in ElectricCar!");
	}
}
