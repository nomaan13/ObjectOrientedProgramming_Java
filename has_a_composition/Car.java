package has_a_composition;

public class Car {

	String name = "BMW";
	double price ;
	
	Engine e  = new Engine(60,6,"Petrol");
	
//	Engine e2 = new Engine(80,8,"Disel");
	
	Car(){
		
	}
	
	Car(String name, double price){
		this.name = name;
		this.price=price;
	}
	
	Car(String name, double price,Engine e){
		this.name= name;
		this.price=price;
		this.e=e;
		
	}
	
	public void displayCar() {
		System.out.println("Car name is : " + name);
		System.out.println("Car price is : " + price);
		e.displayEngine();
		
	}
	
}
