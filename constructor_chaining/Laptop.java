package constructor_chaining;

public class Laptop {
	int ram;
	String color;
	double price;
	String comp;
	
	public Laptop() {
	}
	
	Laptop(int ram){
		this.ram=ram;
	}
	Laptop(int ram,String color){
		this(ram);
		this.color=color;
	}
	Laptop(int ram,String color,Double price){
		this(ram,color);
		this.price= price;
	}
	Laptop(int ram , String color,Double price,String comp){
		this(ram,color,price);
		this.comp=comp;
	}

}
