package association_composition;

public class Car {
	String name ;
	int price;
	int model;
	
	Engine  e = new Engine(80,"Petrol",5);
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	Car(String name,int price,int model){
		this.name=name;
		this.price=price;
		this.model=model;
	}
	
	public void displayCarDetails() {
		System.out.println("Car name is "+ name);
		System.out.println("Car price is "+ price);
		System.out.println("Car model is "+ model);
		e.displayEngine();
		
	}

}
