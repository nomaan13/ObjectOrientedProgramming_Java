package structure;

import java.util.Scanner;

public class AgeLimitExceptionUser {

	public static void main(String[] args)  {
		
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your age here : ");
	int age= sc.nextInt();
	
	try {
	if(age<18) {
		throw new AgeLimitException () ; 
	}
	else {
		System.out.println("You are eligible to vote........");
	}}
	catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
}