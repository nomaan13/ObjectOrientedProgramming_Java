package swap_variable;

public class WithoutUsingThirdVariable {
	public static void main(String[] args) {
		int a  = 40;
		int b = 20;
		System.out.println("value of a = " + a+"\nValue of b = "+b);
		
		
		a=a+b; 
		b=a-b;  
		a=a-b;
		
		
		System.out.println("***************Value after Swaping***************************");
		System.out.println("value of a = " + a+"\nValue of b = "+b);
		
		
		
	}

}
