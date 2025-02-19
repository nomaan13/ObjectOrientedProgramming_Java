package oops_encapsulation;

public class Employ_Driver {

	public static void main(String[] args) {
		Employ e1 = new Employ();
		

		System.out.println(e1.getName());
		System.out.println(e1.getRoll_no());
		
		System.out.println("******************************************");
		System.out.println("After setting the values to name & rollno");	
		System.out.println("******************************************");
		
		//Set values using setter() method
		e1.setName("Nomaan Khan");
		e1.setRoll_no(33);
		
		//Getting values using getter() method
		System.out.println(e1.getName());
		System.out.println(e1.getRoll_no());
		
		

	}
}
