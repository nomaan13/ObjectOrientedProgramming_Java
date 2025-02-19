package copy_constructor;

public class Driver {
	public static void main(String[] args) {
		

		Laptop l1 = new Laptop("HP",300000,8);
		l1.displayLaptop();
		
		System.out.println("******************************************************************************************");
		Laptop l2 = new Laptop(l1);
		l2.displayLaptop();
	}

}
