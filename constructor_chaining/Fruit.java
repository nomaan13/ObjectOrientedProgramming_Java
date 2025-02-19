package constructor_chaining;

public class Fruit {
	String name;
	int price;
	double weight;
	String colour;
	
	Fruit(){
		System.out.println("Fruit object is created!!!!!!!");
		
		}
	
	Fruit(String name){
		this();
		this.name=name;
	}
	Fruit(String name, int price){
		this(name);
		this.price=price;
	}
	Fruit(String name, int price,double weight){
		this(name, price);
		this.weight=weight;
	}
	Fruit(String name,int price,double weight,String colour){
		this(name, price, weight);
		this.colour=colour;
	}
	
	public void displayFruit() {
		System.out.println("Fruit name : " + name);
		System.out.println("Fruit price : " + price);
		System.out.println("Fruit weight : "+ weight);
		System.out.println("Fruit colour: " + colour);
		System.out.println("Total cost of fruit is  : " + (price*weight)+" RS");
		System.out.println("***********************************************************");
	}

}
