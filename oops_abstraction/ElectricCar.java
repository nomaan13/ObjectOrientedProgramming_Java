package oops_abstraction;

public class ElectricCar extends Car {
	
	String name ;
	
	ElectricCar(){}
	
	ElectricCar(int yom,String color,String comp,String model,String name){
		super(yom,color,comp,model);
		this.name= name;
	}
	
	
	
	@Override
	public void drive() {
		System.out.println("Drive the ElectricCar");
	}
	
	@Override
	public void stop() {
		System.out.println("Stop the ElectricCar");
	}
	
	@Override
	public void openGate() {
		System.out.println("OPen the ElectricCargate ");
	}

	public void display() {
		show();
		System.out.println("Car company name is : " + super.comp);
		System.out.println("Car model is  : " + super.model);
		System.out.println("Car owner name is : " + this.name);
		
		
	}
}
