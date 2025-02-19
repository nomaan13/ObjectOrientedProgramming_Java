package game_war;

import java.util.Scanner;

public class Game {
	
	public  Weapon pressButton() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the score:");
		int n = sc.nextInt();
		
		if (n<=300) {
			System.out.println("You got the Knife");
			
			return new Knife();
			
		}
		else if (n<=500) {
			System.out.println("Press 1 for Knife or Press 2 for Gun");
			int option=sc.nextInt();
			
			switch(option) {
				case  1: 
					System.out.println("You have Seleted Knife!!!");
					return  new Knife();
				
				case 2: 
					System.out.println("You have selected Gun");
					return new Gun();
				
				default: 
					System.out.println("Please select a valid option!!");
					return null;
					}			
		}
		
		else {
			System.out.println("You got Boomb");
			return new Bomb();
		}
		
		
	}

}
