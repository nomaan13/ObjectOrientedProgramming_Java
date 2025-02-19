package constructor_chaining;

public class FruitDriver {

	public static void main(String[] args) {
		Fruit f1 = new Fruit("mango" , 180);
		f1.displayFruit();

		
		Fruit f2= new Fruit("Apple",120,5,"Red");
		f2.displayFruit();
		
		Fruit f3 = new Fruit("Grapes");
		f3.displayFruit();
	}

}
