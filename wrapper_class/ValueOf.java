package wrapper_class;

public class ValueOf {

	/*We can convert a String data into its Original form .
	 *to convert String type into Original form there are 
	 *2-method are there in Wrapper class
	 * 			1.valueOf()
	 * 			2.parse()
	 * 
	 */
	public static void main(String[] args) {
		
		/*==============valueOf() Method=======================
		 * Every wrapper class provide a valueOf() method 
		 * it take String as input and convert that string into
		 * its Original form.
		 */
		
		String s = "5546";
		int a = Integer.valueOf(s);
	
		System.out.println(a);
		
		String d = "hello";
		String d2 = String.valueOf(d);
		
		System.out.println(d2);
	}
	

}
