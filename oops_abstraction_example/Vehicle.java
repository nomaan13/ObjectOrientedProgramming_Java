package oops_abstraction_example;

 public abstract class Vehicle {
	 int no_of_tyres ;
	 
	 public Vehicle() {
		
	}
	 
	 Vehicle (int no_of_tyres){
		 this.no_of_tyres= no_of_tyres; 
	 }
	 
	 public  abstract void start();
	 
	 public  abstract void accelerate();
	 
	 public  abstract void drive();
	 
	 public  abstract void stop();
	 
	 
	 

}
