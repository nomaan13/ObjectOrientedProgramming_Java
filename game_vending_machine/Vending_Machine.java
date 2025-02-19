package game_vending_machine;

import java.util.Scanner;

public class Vending_Machine {
	Scanner sc = new Scanner(System.in);

	public Bevrage getBevrage() {
		System.out.println("Enter Money in multiple of 10");
		int m = sc.nextInt();
		
		if (m<=120) {
			System.out.println("Congratulations you got a Coffee!!!");
			switch (m) {
			case 100: 
				System.out.println("You got a Small Coffee");
				return new Coffee();
			case 110: 
				System.out.println("You got a Medium Coffee");
				return new Coffee();

			case 120: 
				System.out.println("You got a Large Coffee");
				return new Coffee();

			default:
				System.out.println("You dont have enough money");
				return null;
			}
			
			
		}
		
		else if (m<=200) {
			System.out.println("Congratulations yout got a Juice");
			
		}
		
		else {
			System.out.println("Congratulations you got a Wine");
		}
		
		return null;
	}
}
