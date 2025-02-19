package constructor_chaining;

public class LaptopUser {

	public static void main(String[] args) {
		Laptop l1 = new Laptop(4,"Black");
		l1.price=45000;
		l1.comp="HP";
		
		System.out.println("Ram is : "+l1.ram + "\nCompany is :"+ l1.comp + "\nColor is :"+ l1.color +"\nPrice is :"+l1.price);
	}
}
