package oops_abstraction_constructor;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		Loan l1 = new Personal_Loan();
		Loan l2 = new Home_Loan();
		l1.getEmi();
		l2.getEmi();
		System.out.println("********************************************************************************");
		
		
		
		Personal_Loan p1 = new Personal_Loan(564215,9,"Nomaan",24);
		p1.display();
		
		 
		
		
		

	}

}
