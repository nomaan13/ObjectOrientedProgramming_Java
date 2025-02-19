//If an interface has only one abstract method than such interface is called Functional-Interface
// example is Runnalble interface


package types_interface;

@FunctionalInterface
public interface Functional_Interface {
	
	
	public void Drive();			//Abstract method	
	
		
	
	public static void name() {		// static method		
	}
	
	
	default void cat() {			//Default method
		
	}
}
