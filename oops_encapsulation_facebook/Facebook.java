package oops_encapsulation_facebook;
import java.util.Scanner;
public class Facebook {
	private int pin=5055;
	private int pass1=2246 ;
	private String username ;
	private int password;
	
	public  String getUsername() {
		return username;
	}
	
	public 	void setUsername(String username) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the pin here: ");
		int e_pin = sc.nextInt();
		
		if (pin == e_pin) {
			System.out.println("Validation sucessfull!!");
			this.username = username;			
		}
		
		else {
			System.out.println("Please enter the valid pin !!!!!!!");		 
		}
		}

	
	public int getPassword() {
		
		
		return password;
	}
	
	public void setPassword(int password) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the pass: ");
		int pass =sc.nextInt();
		if (pass==pass1	) {
			System.out.println("Validation sucessfull!!!");
			this.password= password;
		}
		
		else {
			System.out.println("Enter pass in invalid!!!!!");
		}
		
	}

}
