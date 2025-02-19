package constructor_overloading;

public class Car {
	String name;
	long price;
	
	Car(){
				
	}
	
	Car(String name, long price){
		this.name=name;
		this.price=price;
		
	}
	Car(String name){
		this.name=name;
	}
	
	Car(long price){
		this.price=price;
	}

}
