package game_war;
import java.util.Scanner;
public class Player {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Game g1 = new Game();
		char ch;
		do {
			Weapon w = g1.pressButton();
			w.use();
			
			System.out.println("Press Y/y to play again!!");
			ch= sc.next().charAt(0);
			
		} while (ch=='Y' || ch=='y');
		
		
		System.out.println("Thank you!!!!!!!!!");
	
	}

}
