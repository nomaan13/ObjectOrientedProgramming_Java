package patternProgramming;


import java.util.Scanner;

public class RightAngleTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length ");
		int a = sc.nextInt();
		
	for(int i = 1 ; i<=a ;i++) {
		for (int j = 1 ; j<=i;j++) {
			System.out.print(" * ");
		}
		System.out.println();
		
	}
	
	
	System.out.println("##################################################################");

		for(int i = a ; i>=1 ;i--) {
			for (int j = 1 ; j<=i;j++)  {
				System.out.print(" * ");
			}
			System.out.println();
			
		}
		sc.close();		
		
		
	}

}
