package copy_constructor;

public class Laptop {
	
	String name;
	long price;
	int ram;

//============================================No Argument Constructor====================================================
	 public Laptop() {
		// TODO Auto-generated constructor stub
	}
//============================================No Argument Constructor====================================================
	 
//============================================ Argument Constructor====================================================	 
	public Laptop(String name , long price, int ram) {
		this.name=name;
		this.price=price;
		this.ram=ram;
		
	}
//============================================End Argument Constructor====================================================	
	
//============================================Start Copy Constructor=====================================================
	public Laptop(Laptop lp) {
		name = lp.name;
		price = lp.price;
		ram = lp.ram;
}
//=============================================End Copy Constructor=====================================================	
	
	public void displayLaptop() {
		System.out.println("Laptop name is : " + name );
		System.out.println("Laptop price is : " + price );
		System.out.println("Laptop ram is : " + ram );
		

		

	}

}
