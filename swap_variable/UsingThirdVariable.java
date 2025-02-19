package swap_variable;

public class UsingThirdVariable {
	
	public static void main(String[] args) {
	
		int a = 10;
		int b = 30;
		int c;
		
		System.out.println("value of a = " + a+"\nValue of b = "+b);

		
		c = a;
		a=b;
		b=c;
		
	
		System.out.println("****************After swaping values are************************" );
		System.out.println("value of a = " + a+"\nValue of b = "+b);
}
}
