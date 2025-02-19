package copy_constructor;

public class EmployDriver {

	public static void main(String[] args) {
		
		Employ e1 =  new Employ(103,"Jack");
		System.out.println("===================================");

		Employ e2 = new Employ(e1,"HCL");
		 
		
	}
}
