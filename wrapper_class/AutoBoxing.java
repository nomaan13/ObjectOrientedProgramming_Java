package wrapper_class;

public class AutoBoxing {

	
	public static void main(String[] args) {
		 
		
		/*	********************DEFINITION*********************************************
		 * conversion of premitive data-type into its equivalent Wrapper class 
		 * or in non-primitive data is called
		 * Boxing
		 * This process is done by compiler internally so it is called
		 * Auto-Boxing
		 */
		
		int c = 100;
		Integer a = c;				//Integer a = new Integer(c)
		
		System.out.println(a);
		
		
		double e = 25.201;
		Double b = e ;		//Double b = new Double(e);
		
		System.out.println(b);
		
		
		
	}
}
