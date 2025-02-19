package lamda_expression;

public class Main {

	public static void main(String[] args) {		
//		Engineer e1 = new Engineer();
//		
//		System.out.println(e1.getName());
		
		/*
		 * BY using lamda expression we can give body to Functional Interface inside main class
		 * WE dont have to use seperate class to give implementation to Interface
		 * 
		 */
		Empolye e2 = ()-> "NomaanAhmadKhan";
		
		String string =e2.getName();
		System.out.println(string);
	}
}
