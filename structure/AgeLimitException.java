package structure;

public class AgeLimitException  extends Exception{
	public AgeLimitException() {
		
		
		System.out.println("Under age !!!!");
	}
	
	AgeLimitException(String msg){
		  super(msg);
		
	}
	
	

}
