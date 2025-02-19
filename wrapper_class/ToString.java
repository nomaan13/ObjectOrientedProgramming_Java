package wrapper_class;

public class ToString {
	
	/*  ======================toString() -Method=================================
	 * With the help of Wrapper class we can convert any type of data into String
	 * Form. Every wrapper class provides a method called toString() which can be
	 * use to convert any data into String type.
	 */
	
	public static void main(String[] args) {
		int c = 1093209;
		String s = Integer.toString(c);
		
		double d = 689.2345;
		String d1 = Double.toString(d);
		
		System.out.println(s);
		System.out.println("Total digit in String is :" + s.length());
		
		System.out.println(d1 + "\nTotal digit in String d1 is :" + (d1.length()-1));
				
	}
}
