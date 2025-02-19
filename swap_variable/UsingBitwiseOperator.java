package swap_variable;

public class UsingBitwiseOperator {
	public static void main(String[] args) {
		
	
	int a =20;
	int b = 18;
	System.out.println("value of a = " + a+"\nValue of b = "+b);
	
		a=a^b; 
		b=a^b;
		a=a^b;
	
	
	System.out.println("*******************Value after Swaping*****************************");
	System.out.println("value of a = " + a+"\nValue of b = "+b);
	

}
}
