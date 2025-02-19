package oops_abstraction;

public abstract class Car extends Vehicle{	
	//Contain total 4+2 method
	
	String comp;
	String model;
	
	Car() {
		
	}
	
	Car(int yom,String color,String comp,String model){
		
		super(yom,color);		
		this.comp=comp;
		this.model=model;
		
		}
	
	public void show() {
		System.out.println("Year of manufacture of(YOM) car is : " + super.yom );
		System.out.println("Color of  car is : " + super.color);
		
	}
	
	
	
	//Abstract method
	public abstract void openGate();
	
	//Concrete Method
	public void playMusic() {
		System.out.println("Play the music");
	}
	

	
}
